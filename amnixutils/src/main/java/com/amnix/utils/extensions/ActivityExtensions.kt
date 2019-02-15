package com.amnix.utils.extensions

import android.app.Activity
import android.content.Intent

fun Activity.startActivityForResults(cls: Class<out Activity>, responseCode : Int)=startActivityForResult(Intent(this,cls),responseCode)