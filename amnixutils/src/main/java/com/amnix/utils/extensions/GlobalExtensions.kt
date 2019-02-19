package com.amnix.utils.extensions

import android.os.AsyncTask
import com.amnix.utils.extras.InMemoryCache
import java.io.Closeable
import java.util.*


fun async(runnable: () -> Unit) = object : AsyncTask<Void, Void, Void>() {
    override fun doInBackground(vararg params: Void?): Void? {
        runnable.invoke()
        return null
    }
}.execute()!!

fun <T> asyncAwait(asyncRunnable: () -> T?, awaitRunnable: (result: T?) -> Unit) =
    object : AsyncTask<Void, Void, T>() {
        override fun doInBackground(vararg params: Void?): T? {
            return try {
                asyncRunnable()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

        override fun onPostExecute(result: T?) {
            super.onPostExecute(result)
            awaitRunnable(result)
        }

    }.execute()!!

fun tryOrIgnore(runnable: () -> Unit) = try {
    runnable()
} catch (ignore: Exception) {
}

fun putInMemory(key: String, any: Any?) = InMemoryCache.put(key, any)

fun getFromMemory(key: String): Any? = InMemoryCache.get(key)

fun tryAndCatch(runnable: () -> Unit, onCatch: ((e: Throwable?) -> Unit)? = null, onFinally: (() -> Unit)? = null) =
    try {
        runnable.invoke()
    } catch (e: Throwable) {
        onCatch?.invoke(e)
    } finally {
        onFinally?.invoke()
    }

fun closeSafely(vararg closeables: Closeable) {
    closeables.forEach {
        try {
            it.close()
        } catch (e: Error) {
        }
    }
}

fun isDeviceRooted(): Boolean {
    val locs = arrayOf(
        "/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/",
        "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/",
        "/system/sbin/", "/usr/bin/", "/vendor/bin/"
    )
    locs.forEach {
        if ((it + "su").toFile().exists())
            return true
    }
    return false

}

fun guardRun(runnable: () -> Unit): Boolean = try {
    runnable()
    true
} catch (ignore: Exception) {
    ignore.printStackTrace()
    false
}

fun currentDate() = Date(System.currentTimeMillis())

fun loop(till: Int, loop: (i: Int) -> Unit) = repeat(till, loop)

fun loopWhile(boolean: Boolean, loop: () -> Unit) {
    while (boolean) loop()
}

fun <T : Any?> T?.isNotNull(runnable: (it: T) -> Unit) = this?.let {
    runnable(it)
}

inline val currentTimeMillis: Long get() = System.currentTimeMillis()