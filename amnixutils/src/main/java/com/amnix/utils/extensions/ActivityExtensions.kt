package com.amnix.utils.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Point
import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import android.support.annotation.ColorInt
import android.view.Display
import android.view.View
import android.view.ViewTreeObserver
import android.view.WindowManager
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
 * Returns the StatusBarHeight
 */
fun Activity.getStatusBarHeight(): Int {
    val rect = Rect()
    window.decorView.getWindowVisibleDisplayFrame(rect)
    return rect.top
}

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

fun Activity.setStatusBarColor(@ColorInt color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        window.statusBarColor = color
}

fun Activity.setNavigationBarColor(@ColorInt color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        window.navigationBarColor = color
}

fun Activity.setNavigationBarDividerColor(@ColorInt color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
        window.navigationBarDividerColor = color
}

fun Activity.onViewInflated(onInflated: () -> Unit) {
    window.decorView.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            window.decorView.viewTreeObserver.removeOnGlobalLayoutListener(this)
            onInflated()
        }
    })
}

//Private Methods are below
private fun getAppUsableScreenSize(context: Context): Point {
    val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val display = windowManager.defaultDisplay
    val size = Point()
    display.getSize(size)
    return size
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

fun Activity.getRootView(): View? {
    var rootVIew = findViewById<View>(android.R.id.content)
    if (rootVIew == null)
        rootVIew = window.decorView.findViewById(android.R.id.content)
    return rootVIew
}