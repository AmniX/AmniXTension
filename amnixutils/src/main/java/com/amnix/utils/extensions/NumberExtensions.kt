package com.amnix.utils.extensions

import android.content.res.Resources
import android.util.TypedValue

fun Number.pxFromSp() =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, this.toFloat(), Resources.getSystem().displayMetrics)

fun Number.spFromPx() =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, this.toFloat(), Resources.getSystem().displayMetrics)

fun Number.loop(runnable: (Int) -> Unit) = com.amnix.utils.extensions.loop(this.toInt(), runnable)

fun Number.toBoolean() : Boolean = toInt() != 0
