package com.amnix.utils.extras

import android.hardware.Camera

/**
 * Class to wrap Camera and Provide Ease Modifications
 */
class AmniXCameraWrapper(private val camera: Camera?) {
    /**
     * Starts Camera Directly
     */
    @Throws(RuntimeException::class)
    fun startPreview() {
        camera?.startPreview()
    }

    /**
     * Returns Raw Camera Object, Do Whatever You want
     */
    val rawCamera: Camera?
        get() {
            return camera
        }

    /**
     * take Picture and Stop the Camera Preview.
     *
     * call [startPreview] Again of you want to continue the camera.
     */
    fun takePicture(onPictureClicked: (yuv: ByteArray?) -> Unit) {
        camera?.takePicture(null, null, null,
            Camera.PictureCallback { data, _ -> onPictureClicked(data) })
    }

    /**
     * take SnapShot from the Preview. Doesn't Stops the Camera.
     */
    fun takeSnapShot(onSnapShotClicked: (yuv: ByteArray) -> Unit) {
        camera?.setOneShotPreviewCallback { data, _ ->
            onSnapShotClicked(data)
        }
    }

    /**
     * Release Camera Immediately
     */
    fun release() {
        camera?.stopPreview()
        camera?.release()
    }
}