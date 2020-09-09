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

import android.os.Handler
import android.os.Looper
import com.amnix.xtension.extras.InMemoryCache
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Date

/**
 * Want to run some code on another thread?
 *
 * run it with the ease of async and leave it to be executed on a Worker Thread.
 * Make sure you don't do some context related stuff in async, It may cause an memory leak
 */
fun async(runnable: () -> Unit) = GlobalScope.launch(Dispatchers.IO) {runnable()}

/**
 * Want to run some code on another thread?
 *
 * run it with the ease of async and leave it to be executed on a Worker Thread.
 * Make sure you don't do some context related stuff in async, It may cause an memory leak
 */
fun <T> async(param: T, runnable: T.() -> Unit) = GlobalScope.launch(Dispatchers.IO) { runnable(param) }

/**
 * Want to run some code on another thread?
 *
 * run it with the ease of asyncAwait [asyncRunnable] and leave it to be executed on a Worker Thread. [awaitRunnable] wil be invoked after the asyncRunnable with the result returned from [asyncRunnable]
 * Make sure you don't do some context related stuff in [asyncRunnable], It may cause an memory leak
 */
fun <T> asyncAwait(asyncRunnable: () -> T?, awaitRunnable: (result: T?) -> Unit) = GlobalScope.launch(Dispatchers.IO) {
    asyncRunnable().let {
        launch(Dispatchers.Main) { awaitRunnable(it) }
    }
}

/**
 * Want to run some code on another thread?
 *
 * run it with the ease of asyncAwait [asyncRunnable] and leave it to be executed on a Worker Thread. [awaitRunnable] wil be invoked after the asyncRunnable with the result returned from [asyncRunnable]
 * Make sure you don't do some context related stuff in [asyncRunnable], It may cause an memory leak
 */
fun <T, P> asyncAwait(param: P, asyncRunnable: P.() -> T?, awaitRunnable: (result: T?) -> Unit) = GlobalScope.launch(Dispatchers.IO) {
    asyncRunnable(param).let {
        launch(Dispatchers.Main) { awaitRunnable(it) }
    }
}

/**
 * try the code in [runnable], If it runs then its perfect if its not, It won't crash your app.
 */
fun tryOrIgnore(runnable: () -> Unit) = try {
    runnable()
} catch (e: Exception) {
    e.printStackTrace()
}

/**
 * ifIs provides a block to match the value with Given Value and execute the block
 */
fun <T> T.ifIs(valueToCompare: T?, block: T.() -> Unit) {
    if (this == valueToCompare) block(this)
}

/**
 * ifIs provides a block to match the value with Given Value and execute the block
 */
fun <T> T.ifIsNot(valueToCompare: T?, block: (T) -> Unit) {
    if (this != valueToCompare) block(this)
}

/**
 * put Something In Memory to use it later
 */
fun putInMemory(key: String, any: Any?) = InMemoryCache.put(key, any)

/**
 * helper Function to Cast things
 */
inline fun <reified T> Any?.cast() = this as? T

/**
 * helper Function to Cast things Force fully
 */
inline fun <reified T> Any.forceCast() = this as T

/**
 * get Saved Data from memory, null if it os not exists
 */
fun getFromMemory(key: String): Any? = InMemoryCache.get(key)

/**
 * Check if Device is Rooted.
 */
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

/**
 * guardRun will run your code and returns True if it executed Properly else false.
 */
fun guardRun(runnable: () -> Unit): Boolean = try {
    runnable()
    true
} catch (ignore: Exception) {
    ignore.printStackTrace()
    false
}

/**
 * get Current Date.
 */
fun currentDate() = Date(System.currentTimeMillis())

/**
 * Loop with a single Int, It will call the [loop] till the value of [till]
 *
 * It will execute from 0 .. [till]
 */
fun loop(till: Int, loop: (i: Int) -> Unit) = repeat(till, loop)

/**
 * While Loop Wrapped with Kotlin Global Extension
 */
fun loopWhile(boolean: Boolean, loop: () -> Unit) {
    while (boolean) loop()
}

/**
 * Runs the Block With a Delay.
 */
fun runWithDelay(delay: Long, block: () -> Unit) {
    Handler(Looper.getMainLooper()).postDelayed({ block() }, delay)
}

/**
 * invokes [runnable] if value is Not Null. Quite handy.
 */
fun <T : Any?> T?.isNotNull(runnable: (it: T) -> Unit) = this?.let {
    runnable(it)
}

/**
 * Run the UI Code on UI Thread From AnyWhere, No need the Activity Reference
 */
fun runOnUIThread(runnable: () -> Unit) = Handler(Looper.getMainLooper()).post(runnable)

/**
 * get CurrentTimeInMillis from System.currentTimeMillis
 */
inline val currentTimeMillis: Long get() = System.currentTimeMillis()