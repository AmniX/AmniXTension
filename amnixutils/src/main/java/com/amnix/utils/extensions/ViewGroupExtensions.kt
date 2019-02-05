package com.amnix.utils.extensions

import android.view.View
import android.view.ViewGroup

inline operator fun ViewGroup.minusAssign(child: View) = removeView(child)

inline operator fun ViewGroup.plusAssign(child: View) = addView(child)

inline fun ViewGroup.contains(child: View) = indexOfChild(child) > -1

inline fun ViewGroup.childs() = object : Iterator<View> {
    var index = 0
    override fun hasNext(): Boolean {
        return index < childCount
    }

    override fun next(): View {
        return getChildAt(index++)
    }

}

