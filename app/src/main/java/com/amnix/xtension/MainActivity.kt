package com.amnix.xtension

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import com.amnix.xtension.demo.R
import com.amnix.xtension.extensions.setOnSeekBarChangeListener
import com.amnix.xtension.extensions.setupCamera
import com.amnix.xtension.extensions.showTimePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showTimePicker (is24Hour = true){ hour, minute ->
            Log.d("Aman","hour$hour minute$minute")
        }
        textureView.setupCamera {

        }

       SeekBar(this).setOnSeekBarChangeListener(onProgressChanged = {seekBar, progress, fromUser ->

       })
    }
}
