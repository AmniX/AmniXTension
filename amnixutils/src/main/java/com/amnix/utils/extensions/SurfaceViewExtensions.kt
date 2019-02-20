package com.amnix.utils.extensions

import android.Manifest
import android.hardware.Camera
import android.support.annotation.RequiresPermission
import android.view.SurfaceHolder
import android.view.SurfaceView
import com.amnix.utils.extras.AmniXCameraWrapper
import com.amnix.utils.internals.CameraHelper

/**
 * Setup Camera With the Ease.
 *
 * @param front If You want the Front Camera Or Not
 * @preViewWidth width Of PreView
 * @preViewHeight height of the Preview
 * @desireFps the FPS You want to request
 * @autoFocus the AUtoFocus You want or Not
 * @autoFlash the AutoFlash You want or Not
 * @onReady Block to Execute on Ready.
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

