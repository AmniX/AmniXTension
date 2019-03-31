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

package com.amnix.xtension.extras

import android.graphics.Color
import kotlin.random.Random

/**
 * Class for Several PlaceHolders
 */
object PlaceHolders {
    /**
     * Random Number But below the Max Value
     */
    fun getRandomNumber(max: Int = Integer.MAX_VALUE) = Random.nextInt(max)

    /**
     * Random Number Between a Range
     */
    fun getRandomNumberBetween(min: Int, max: Int) = Random.nextInt(max - min) + min

    /**
     * get Random Color
     */
    fun getRandomColor(maxRed: Int = 255, maxGreen: Int = 255, maxBlue: Int = 255) = Color.rgb(
        getRandomNumber(maxRed),
        getRandomNumber(maxGreen),
        getRandomNumber(maxBlue)
    )

    /**
     * get a bunch of Random Colors
     */
    fun getRandomColors(len: Int, maxRed: Int = 255, maxGreen: Int = 255, maxBlue: Int = 255) = IntArray(len).apply {
        forEachIndexed { index, _ ->
            this[index] = getRandomColor(maxRed, maxGreen, maxBlue)
        }
    }

}