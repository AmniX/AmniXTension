package com.amnix.utils.extensions

import android.content.res.Resources
import android.util.TypedValue

/**
 * Consider that Number is the Value of SP the it will convert it to PX
 */
fun Number.pxFromSp() =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, this.toFloat(), Resources.getSystem().displayMetrics)

/**
 * Consider that Number is the Value of PX the it will convert it to SP
 */
fun Number.spFromPx() =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, this.toFloat(), Resources.getSystem().displayMetrics)

/**
 * Consider that Number is the Value of SP the it will convert it to PX
 */
fun Number.pxFromDp() =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), Resources.getSystem().displayMetrics)

/**
 * Consider that Number is the Value of PX the it will convert it to SP
 */
fun Number.dpFromPx() =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, this.toFloat(), Resources.getSystem().displayMetrics)

/**
 * Loop Through the Number
 */
fun Number.loop(runnable: (Int) -> Unit) = com.amnix.utils.extensions.loop(this.toInt(), runnable)

/**
 * if Number != 0 then return true else false so 0 == false else true
 */
fun Number.toBoolean() : Boolean = toInt() != 0
