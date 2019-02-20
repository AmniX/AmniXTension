package com.amnix.xtension.extensions

/**
 * Converts Boolean to Int, if true then 1 else 0
 */
fun Boolean.toInt():Int = if(this) 1 else 0