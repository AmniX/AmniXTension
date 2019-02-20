@file:Suppress("DEPRECATION")

package com.amnix.xtension.internals

import android.content.ContentValues
import android.content.Context
import android.graphics.ImageFormat
import android.graphics.SurfaceTexture
import android.hardware.Camera
import android.util.Log
import android.view.Surface
import android.view.SurfaceHolder
import android.view.WindowManager
import java.util.*

internal object CameraHelper {
    internal fun getCamera(
        context: Context,
        front: Boolean,
        preViewWidth: Int,
        previewHeight: Int,
        desireFps: Float,
        autoFocs: Boolean,
        autoFlash: Boolean,
        holder: Any
    ): Camera {
        if (holder is SurfaceHolder || holder is SurfaceTexture) {
            val id = if (front) Camera.CameraInfo.CAMERA_FACING_FRONT else Camera.CameraInfo.CAMERA_FACING_BACK
            val camera = Camera.open(id)
            val sizePair = selectSizePair(camera, preViewWidth, previewHeight)
            val fps = selectPreviewFpsRange(camera, desireFps)
            camera?.parameters?.let { parameters ->
                sizePair?.previewSize()?.let {
                    parameters.setPreviewSize(it.width, it.height)
                }
                sizePair?.pictureSize()?.let {
                    parameters.setPictureSize(it.width, it.height)
                }
                fps?.let {
                    parameters.setPreviewFpsRange(
                        fps[Camera.Parameters.PREVIEW_FPS_MIN_INDEX],
                        fps[Camera.Parameters.PREVIEW_FPS_MAX_INDEX]
                    )
                }
                parameters.previewFormat = ImageFormat.NV21
                parameters.whiteBalance = Camera.Parameters.WHITE_BALANCE_AUTO
                setRotation(context, camera, parameters, id)
                parameters.focusMode =
                    if (autoFocs) Camera.Parameters.FOCUS_MODE_AUTO else Camera.Parameters.FOCUS_MODE_CONTINUOUS_PICTURE
                parameters.flashMode =
                    if (autoFlash) Camera.Parameters.FLASH_MODE_AUTO else Camera.Parameters.FLASH_MODE_OFF
            }
            if (holder is SurfaceHolder)
                camera.setPreviewDisplay(holder)
            else if (holder is SurfaceTexture)
                camera.setPreviewTexture(holder)
            return camera
        } else throw RuntimeException("holder must be ")
    }

    private fun selectSizePair(camera: Camera, desiredWidth: Int, desiredHeight: Int): SizePair? {
        val validPreviewSizes = generateValidPreviewSizeList(camera)
        var selectedPair: SizePair? = null
        var minDiff = Integer.MAX_VALUE
        for (sizePair in validPreviewSizes) {
            val size = sizePair.previewSize()
            val diff = Math.abs(size.width - desiredWidth) + Math.abs(size.height - desiredHeight)
            if (diff < minDiff) {
                selectedPair = sizePair
                minDiff = diff
            }
        }

        return selectedPair
    }


    private fun generateValidPreviewSizeList(camera: Camera): List<SizePair> {
        val parameters = camera.parameters
        val supportedPreviewSizes = parameters.supportedPreviewSizes
        val supportedPictureSizes = parameters.supportedPictureSizes
        val validPreviewSizes = ArrayList<SizePair>()
        for (previewSize in supportedPreviewSizes) {
            val previewAspectRatio = previewSize.width.toFloat() / previewSize.height.toFloat()
            for (pictureSize in supportedPictureSizes) {
                val pictureAspectRatio = pictureSize.width.toFloat() / pictureSize.height.toFloat()
                if (Math.abs(previewAspectRatio - pictureAspectRatio) < 0.01f) {
                    validPreviewSizes.add(
                        SizePair(
                            Size(previewSize.width, previewSize.height),
                            Size(pictureSize.width, pictureSize.height)
                        )
                    )
                    break
                }
            }
        }

        if (validPreviewSizes.size == 0) {
            Log.d(ContentValues.TAG, "No preview sizes have a corresponding same-aspect-ratio picture size")
            for (previewSize in supportedPreviewSizes) {

                validPreviewSizes.add(SizePair(Size(previewSize.width, previewSize.height), null))
            }
        }

        return validPreviewSizes
    }

    private fun setRotation(mContext: Context, camera: Camera, parameters: Camera.Parameters, cameraId: Int) {
        val windowManager = mContext.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        var degrees = 0
        val rotation = windowManager.defaultDisplay.rotation
        when (rotation) {
            Surface.ROTATION_0 -> degrees = 0
            Surface.ROTATION_90 -> degrees = 90
            Surface.ROTATION_180 -> degrees = 180
            Surface.ROTATION_270 -> degrees = 270
            else -> Log.d(ContentValues.TAG, "Bad rotation value: $rotation")
        }

        val cameraInfo = Camera.CameraInfo()
        Camera.getCameraInfo(cameraId, cameraInfo)
        val angle: Int
        val displayOrientation =
            if (cameraInfo.facing == Camera.CameraInfo.CAMERA_FACING_FRONT) {
                angle = (cameraInfo.orientation + degrees) % 360
                (360 - angle) % 360
            } else {
                angle = (cameraInfo.orientation - degrees + 360) % 360
                angle
            }
        camera.setDisplayOrientation(displayOrientation)
        parameters.setRotation(angle)
    }


    private fun selectPreviewFpsRange(camera: Camera, desiredPreviewFps: Float): IntArray? {
        val desiredPreviewFpsScaled = (desiredPreviewFps * 1000.0f).toInt()
        var selectedFpsRange: IntArray? = null
        var minDiff = Integer.MAX_VALUE
        val previewFpsRangeList = camera.parameters.supportedPreviewFpsRange
        for (range in previewFpsRangeList) {
            val deltaMin = desiredPreviewFpsScaled - range[Camera.Parameters.PREVIEW_FPS_MIN_INDEX]
            val deltaMax = desiredPreviewFpsScaled - range[Camera.Parameters.PREVIEW_FPS_MAX_INDEX]
            val diff = Math.abs(deltaMin) + Math.abs(deltaMax)
            if (diff < minDiff) {
                selectedFpsRange = range
                minDiff = diff
            }
        }
        return selectedFpsRange
    }

    private class SizePair(
        previewSize: Size,
        pictureSize: Size?
    ) {
        private val mPreview: Size = Size(previewSize.width, previewSize.height)
        private var mPicture: Size? = null

        init {
            if (pictureSize != null) {
                mPicture = Size(pictureSize.width, pictureSize.height)
            }
        }

        fun previewSize(): Size {
            return mPreview
        }

        fun pictureSize(): Size? {
            return mPicture
        }
    }

    private data class Size(val width: Int, val height: Int)
}