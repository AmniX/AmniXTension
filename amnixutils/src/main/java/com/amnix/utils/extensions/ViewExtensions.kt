package com.amnix.utils.extensions

import android.graphics.Bitmap
import android.view.View

fun View.screenshot(): Bitmap {
    destroyDrawingCache()
    buildDrawingCache()
    return drawingCache
}