/*
 * Copyright (c) 2019, AmniX
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *                            http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *  either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

@file:Suppress("DEPRECATION")

package com.amnix.xtension.extras

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