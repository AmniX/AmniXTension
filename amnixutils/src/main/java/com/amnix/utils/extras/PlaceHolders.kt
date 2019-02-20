package com.amnix.utils.extras

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