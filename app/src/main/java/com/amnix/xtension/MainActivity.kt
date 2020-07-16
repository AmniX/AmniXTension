package com.amnix.xtension

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amnix.xtension.demo.R
import com.amnix.xtension.extensions.cast
import com.amnix.xtension.extensions.requestPermission
import com.amnix.xtension.extras.ProgressDialog
import com.amnix.xtension.logs.L
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ProgressDialog.show(this,"Title","Message",true)
        1.cast<CharSequence>()?.toString()
    }
}
