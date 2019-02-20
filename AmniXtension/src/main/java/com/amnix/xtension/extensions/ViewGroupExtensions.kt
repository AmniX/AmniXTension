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

