package com.amnix.xtension

import android.Manifest
import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.amnix.xtension.demo.R
import com.amnix.xtension.extensions.requestPermission
import com.amnix.xtension.extensions.saveAsync

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestPermission(Manifest.permission.CAMERA){
            Log.d("Aman", "Permission Result : $it")
        }
        val bitmap = Bitmap.createBitmap(400,404,Bitmap.Config.ARGB_8888)
        bitmap.saveAsync(""){

        }
    }
}
