package com.amnix.utils.extras

import android.graphics.Color
import kotlin.random.Random

object PlaceHolders {
    fun getRandomNumber(max: Int = 100) = Random.nextInt(max)

    fun getRandomNumberBetween(min: Int, max: Int) = Random.nextInt(max - min) + min

    fun getRandomColor(maxRed: Int = 255, maxGreen: Int = 255, maxBlue: Int = 255) = Color.rgb(
        getRandomNumber(maxRed),
        getRandomNumber(maxGreen),
        getRandomNumber(maxBlue)
    )

    fun getRandomColors(len: Int, maxRed: Int = 255, maxGreen: Int = 255, maxBlue: Int = 255) = IntArray(len).apply {
        forEachIndexed { index, _ ->
            this[index] = getRandomColor(maxRed, maxGreen, maxBlue)
        }
    }

}