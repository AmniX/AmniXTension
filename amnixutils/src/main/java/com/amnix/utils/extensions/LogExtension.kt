package com.amnix.utils.extensions

import android.util.Log

fun log(any: Any) = async {
    Log.d("",any.toString())
}