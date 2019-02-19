package com.amnix.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.amnix.utils.demo.R
import com.amnix.utils.extensions.showTimePicker

class MainActivity : Activity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showTimePicker (is24Hour = true){ hour, minute ->
            Log.d("Aman","hour$hour minute$minute")
        }
    }
}
