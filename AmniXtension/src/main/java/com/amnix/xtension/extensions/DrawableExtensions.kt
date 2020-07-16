package com.amnix.xtension.extensions

import android.graphics.Rect
import android.graphics.drawable.Drawable

fun Drawable.setSize(width: Int, height : Int) {
    bounds = Rect(0, 0, width, height)
}