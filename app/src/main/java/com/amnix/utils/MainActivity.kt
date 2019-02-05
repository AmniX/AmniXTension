package com.amnix.utils

import android.app.Activity
import android.os.Bundle
import com.amnix.utils.demo.R
import com.amnix.utils.extensions.loop
import com.amnix.utils.extensions.showMultiPicker
import com.amnix.utils.logs.L

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loop(40) {
            L.d(it)
        }
        showMultiPicker(arrayOf("One", "Two", "Three", "Four"), {it,checked->
            L.d(it)
        })
        arrayOf("")
        "".format(40,40)
        val bool = false
    }
}
