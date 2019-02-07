package com.amnix.utils.extensions

import android.os.AsyncTask


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


fun tryAndCatch(runnable: () -> Unit, onCatch: ((e: Throwable?) -> Unit)? = null, onFinally: (() -> Unit)? = null) =
    try {
        runnable.invoke()
    } catch (e: Throwable) {
        onCatch?.invoke(e)
    } finally {
        onFinally?.invoke()
    }

fun guardRun(runnable: () -> Unit): Boolean = try {
    runnable()
    true
} catch (ignore: Exception) {
    ignore.printStackTrace()
    false
}

fun loop(till: Int, loop: (i: Int) -> Unit) = repeat(till, loop)

fun <T : Any?> T?.isNotNull(runnable: (it: T) -> Unit) = this?.let {
    runnable(it)
}

inline val currentTimeMillis: Long get() = System.currentTimeMillis()