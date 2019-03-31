/*
 * Copyright (c) 2019, AmniX
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *                            http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *  either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.amnix.xtension.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Point
import android.graphics.Rect
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.Display
import android.view.View
import android.view.ViewTreeObserver
import android.view.WindowManager
import androidx.annotation.ColorInt
import androidx.core.app.ActivityCompat
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.amnix.xtension.extras.AmniXSnack
import java.lang.reflect.InvocationTargetException


/**
 * startsActivityForResult With a Class Name and Extra Data Followed by RequestCode
 * @cls = Activity Class Name
 * @requestCode = requestCode for result Purpose
 * @extra = Extra Data For Intent
 */
fun Activity.startActivityForResults(cls: Class<out Activity>, requestCode: Int, extra: Bundle? = null) {
    val intent = Intent(this, cls)
    extra.isNotNull {
        intent.putExtras(it)
    }
    startActivityForResult(intent, requestCode)
}

/**
 * Returns the StatusBarHeight in Pixels
 */
fun Activity.getStatusBarHeight(): Int {
    val rect = Rect()
    window.decorView.getWindowVisibleDisplayFrame(rect)
    return rect.top
}

/**
 * Returns the NavigationBar Height in Pixels
 */

fun Activity.getNavigationBarSize(context: Context): Point {
    val appUsableSize = getAppUsableScreenSize(context)
    val realScreenSize = getRealScreenSize(context)
    if (appUsableSize.x < realScreenSize.x) {
        return Point(realScreenSize.x - appUsableSize.x, appUsableSize.y)
    }
    return if (appUsableSize.y < realScreenSize.y) {
        Point(appUsableSize.x, realScreenSize.y - appUsableSize.y)
    } else Point()
}

/**
 * Set Status Bar Color if Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
 */
fun Activity.setStatusBarColor(@ColorInt color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        window.statusBarColor = color
}

/**
 * Set Navigation Bar Color if Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
 */
fun Activity.setNavigationBarColor(@ColorInt color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        window.navigationBarColor = color
}

/**
 * Set Navigation Bar Divider Color if Build.VERSION.SDK_INT >= Build.VERSION_CODES.P
 */

fun Activity.setNavigationBarDividerColor(@ColorInt color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
        window.navigationBarDividerColor = color
}

/**
 * add an Callback to ViewTreeObserver which let the developer know when contentView is inflated to the Activity Content
 */
fun Activity.onViewInflated(onInflated: () -> Unit) {
    window.decorView.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            window.decorView.viewTreeObserver.removeOnGlobalLayoutListener(this)
            onInflated()
        }
    })
}

/**
 * show Custom SnackBar Easily,
 *
 * @property message The Message is going to show on SnackBar
 * @property action the Pair of String and a #Unit which will replace the dismiss Action from SnackBar and provide callBack
 * @property bgColor the argb Form Color for the snackBar
 * @property textColor the argb Form Color for the SnackBar TextView
 * @property duration the Duration to show SnackBar till. if There is a Custom Action then Duration is Infinite.
 */

fun Activity.showSnackBar(
    message: String,
    action: Pair<String, (v: View?) -> Unit>? = null,
    @ColorInt bgColor: Int? = null,
    @ColorInt textColor: Int? = null,
    duration: Long = 1000
) {
    AmniXSnack(this).apply {
        setMessage(message)
        if (action != null)
            setAction(action.first, action.second)
        else
            setDuration(duration)
        if (bgColor != null)
            setBackColor(bgColor)
        if (textColor != null)
            setTextColor(textColor)
    }.show()
}

/**
 * get #rootVIew of the Activity
 */
fun Activity.getRootView(): View? {
    var rootVIew = findViewById<View>(android.R.id.content)
    if (rootVIew == null)
        rootVIew = window.decorView.findViewById(android.R.id.content)
    return rootVIew
}

/**
 * get #contentView of the Activity
 */
fun Activity.getContentView(): View? {
    return getRootView()
}

/**
 * Request Permission WithOut Waiting For Any OnPermissionResult Callback.
 *
 * Get The Result in a Callback Easily.
 * No need to check if the Permission Grated Already Or Not, We Will do it for you. Just Place the code in [onResult] Block, We will Execute it SomeHow.
 * Its Based on LifeCycleObserver So Supported FragmentActivity+
 *
 * @property permission is the Permission you want to Request For
 * @property onResult is the Block Which Will be Executed On Permission Granted.
 *
 *
 * * Only Supports One Permission at a time. Contributors will be welcomed
 */
fun FragmentActivity.requestPermission(permission: String, onResult: (isGranted: Boolean) -> Unit) {
    if (checkSelfPermissions(permission)) {
        onResult(true)
        return
    }
    val observer = PermissionObserver()
    observer.onResumeCallback = {
        lifecycle.removeObserver(observer)
        onResult(checkSelfPermissions(permission))
    }
    lifecycle.addObserver(observer)
    if (ActivityCompat.shouldShowRequestPermissionRationale(this, permission))
        ActivityCompat.requestPermissions(this, arrayOf(permission), 420)
    else
        startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.fromParts("package", packageName, null)))
}

/**
 * Request Permissions WithOut Waiting For Any OnPermissionResult Callback.
 *
 * Get The Result in a Callback Easily.
 * No need to check if the Permission Grated Already Or Not, We Will do it for you. Just Place the code in [onResult] Block, We will Execute it SomeHow.
 * Its Based on LifeCycleObserver So Supported FragmentActivity+
 *
 * @property permissions is the Permission you want to Request For
 * @property onResult is the Block Which Will be Executed On Permission Granted.
 *
 */
fun FragmentActivity.requestPermission(permissions: Array<String>, onResult: (isGranted: Boolean) -> Unit) {
    if (checkSelfPermissions(permissions.toList())) {
        onResult(true)
        return
    }
    val observer = PermissionObserver()
    observer.onResumeCallback = {
        lifecycle.removeObserver(observer)
        onResult(checkSelfPermissions(permissions.toList()))
    }
    lifecycle.addObserver(observer)
    if (shouldShowRequestPermissionRationaleBunch(this, permissions))
        ActivityCompat.requestPermissions(this, permissions, 420)
    else
        startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.fromParts("package", packageName, null)))
}

//Private Methods are below
private fun getAppUsableScreenSize(context: Context): Point {
    val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val display = windowManager.defaultDisplay
    val size = Point()
    display.getSize(size)
    return size
}

private fun shouldShowRequestPermissionRationaleBunch(activity: FragmentActivity, permissions: Array<String>): Boolean {
    permissions.forEach {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, it).not())
            return false
    }
    return true
}

private fun getRealScreenSize(context: Context): Point {
    val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val display = windowManager.defaultDisplay
    val size = Point()

    if (Build.VERSION.SDK_INT >= 17) {
        display.getRealSize(size)
    } else if (Build.VERSION.SDK_INT >= 14) {
        try {
            size.x = Display::class.java.getMethod("getRawWidth").invoke(display) as Int
            size.y = Display::class.java.getMethod("getRawHeight").invoke(display) as Int
        } catch (e: IllegalAccessException) {
        } catch (e: InvocationTargetException) {
        } catch (e: NoSuchMethodException) {
        }

    }
    return size
}

private class PermissionObserver : LifecycleObserver {
    var onResumeCallback: (() -> Unit)? = null
    var readyToCheck = false
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        readyToCheck = true
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        if (readyToCheck)
            onResumeCallback?.invoke()
        readyToCheck = false
    }
}
