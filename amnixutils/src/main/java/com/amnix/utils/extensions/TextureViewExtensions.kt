package com.amnix.utils.extensions

import android.graphics.SurfaceTexture
import android.hardware.Camera
import android.view.TextureView
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