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
        override fun onSurfaceTextureSizeChanged(surface: SurfaceTexture, width: Int, height: Int) {

        }

        override fun onSurfaceTextureUpdated(surface: SurfaceTexture) {

        }

        override fun onSurfaceTextureDestroyed(surface: SurfaceTexture): Boolean {

            return true
        }

        override fun onSurfaceTextureAvailable(surface: SurfaceTexture, width: Int, height: Int) {
            camera = CameraHelper.getCamera(
                context,
                front,
                preViewWidth,
                previewHeight,
                desireFps,
                autoFocus,
                autoFlash,
                surface
            )
            camera?.let{
                onReady(AmniXCameraWrapper(it))
            }
        }

    }
}