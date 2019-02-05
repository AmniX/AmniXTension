package com.amnix.utils.extensions

import android.os.AsyncTask


fun async(runnable: () -> Unit) = object : AsyncTask<Void, Void, Void>() {
    override fun doInBackground(vararg params: Void?): Void? {
        runnable.invoke()
        return null
    }
}.execute()

fun tryCatch(runnable: () -> Unit) = try {
    runnable()
} catch (e: Exception) {
}

fun tryCatch(runnable: () -> Unit, onCatch: ((e: Throwable?) -> Unit)? = null, onFinally: (() -> Unit)? = null) = try {
    runnable.invoke()
} catch (e: Throwable) {
    onCatch?.invoke(e)
} finally {
    onFinally?.invoke()
}

fun loop(till: Int, loop: (i: Int) -> Unit) = repeat(till, loop)

fun <T : Any?> T?.isNotNull(runnable: (it: T) -> Unit) = this?.let {
    runnable(it)
}

inline val currentTimeMillis: Long get() = System.currentTimeMillis()