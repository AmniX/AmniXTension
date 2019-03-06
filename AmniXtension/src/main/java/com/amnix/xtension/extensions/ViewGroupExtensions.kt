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

import android.view.View
import android.view.ViewGroup

/**
 * Remove View with the (-) Operator
 */
operator fun ViewGroup.minusAssign(child: View) = removeView(child)
/**
 * Add View with the (+) Operator
 */
operator fun ViewGroup.plusAssign(child: View) = addView(child)

/**
 * check if ViewGroup have the given View as Its Child
 */
fun ViewGroup.contains(child: View) = indexOfChild(child) > -1

/**
 * get All the Children's as Iterator
 */
fun ViewGroup.childs() = object : Iterator<View> {
    var index = 0
    override fun hasNext(): Boolean {
        return index < childCount
    }

    override fun next(): View {
        return getChildAt(index++)
    }

}

