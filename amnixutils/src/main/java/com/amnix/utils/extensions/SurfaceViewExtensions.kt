package com.amnix.utils.extensions

import android.Manifest
import android.hardware.Camera
import android.view.SurfaceHolder
import android.view.SurfaceView
import androidx.annotation.RequiresPermission
import com.amnix.utils.extras.AmniXCameraWrapper
import com.amnix.utils.internals.CameraHelper

/**
 * Easily Setup the Camera on SurfaceView
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
@RequiresPermission(Manifest.permission.CAMERA)
fun SurfaceView.setupCamera(
    front: Boolean = false,
    preViewWidth: Int = 480,
    previewHeight: Int = 640,
    desireFps: Float = 30f,
    autoFocus: Boolean = true,
    autoFlash: Boolean = true,
    onReady: (camera: AmniXCameraWrapper) -> Unit
) {
    var camera: Camera? = null
    holder.addCallback(object : SurfaceHolder.Callback {
        override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {

        }

        override fun surfaceDestroyed(holder: SurfaceHolder?) {
            camera?.stopPreview()
            camera?.release()
        }

        override fun surfaceCreated(holder: SurfaceHolder?) {
            holder?.let {
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

    })
}

