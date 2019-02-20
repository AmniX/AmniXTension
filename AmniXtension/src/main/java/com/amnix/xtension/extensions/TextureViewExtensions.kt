package com.amnix.xtension.extensions

import android.graphics.SurfaceTexture
import android.hardware.Camera
import android.view.TextureView
import com.amnix.xtension.extras.AmniXCameraWrapper
import com.amnix.xtension.internals.CameraHelper

/**
 * Easily Setup the Camera on TextureView
 * Make Sure that You have the Permission to Access CAMERA
 *
 * @property front If You want the Front Camera Or Not. Defaults is true
 * @property preViewWidth width Of PreViewSize for Parameters. Default is 480
 * @property previewHeight height Of PreViewSize for Parameters. Defaults is 640
 * @property desireFps FPS You desire to request [Every Desire will not be fulfill]. Defaults is 30
 * @property autoFocus set the AutoFocus Value. Default is true
 * @property autoFlash set the AutoFlash if you want or Not. Default is true
 * @property onReady An Unit block to be executed when camera is Ready to Roll. *Required param
 */
fun TextureView.setupCamera(
    front: Boolean = false,
    preViewWidth: Int = 480,
    previewHeight: Int = 640,
    desireFps: Float = 30f,
    autoFocus: Boolean = true,
    autoFlash: Boolean = true,
    onReady: (camera: AmniXCameraWrapper) -> Unit
) {
    surfaceTextureListener = object : TextureView.SurfaceTextureListener {
        var camera: Camera? = null
        override fun onSurfaceTextureSizeChanged(surface: SurfaceTexture?, width: Int, height: Int) {

        }

        override fun onSurfaceTextureUpdated(surface: SurfaceTexture?) {

        }

        override fun onSurfaceTextureDestroyed(surface: SurfaceTexture?): Boolean {
            camera?.stopPreview()
            camera?.release()
            return true
        }

        override fun onSurfaceTextureAvailable(surface: SurfaceTexture?, width: Int, height: Int) {
            surface?.let {
                camera = CameraHelper.getCamera(
                    context,
                    front,
                    preViewWidth,
                    previewHeight,
                    desireFps,
                    autoFocus,
                    autoFlash,
                    it
                )
                camera?.let{
                    onReady(AmniXCameraWrapper(it))
                }
            }
        }

    }
}