package com.amnix.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.amnix.utils.demo.R
import com.amnix.utils.extensions.async
import com.amnix.utils.extensions.getAllAudios

class MainActivity : Activity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        async {
            getAllAudios().forEach {
                Log.d("Aman",it)
            }
        }

    }
}
