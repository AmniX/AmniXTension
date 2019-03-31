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

package com.amnix.xtension.extensions

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
fun Number.loop(runnable: (Int) -> Unit) = com.amnix.xtension.extensions.loop(this.toInt(), runnable)

/**
 * if Number != 0 then return true else false so 0 == false else true
 */
fun Number.toBoolean() : Boolean = this.toInt() > 0
