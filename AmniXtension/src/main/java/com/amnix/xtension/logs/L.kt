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

package com.amnix.xtension.logs


import android.util.Log
import com.amnix.xtension.AmniXtension
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.util.*

/**
 * A Custom Log Class for the developer Ease.
 *
 * Its Prints The Logs in Pretty Way So Developers Can Easily Differentiate between multiple Logs
 *
 * Available Methods :
 *
 * L.d()
 * L.e()
 * L.i()
 * L.v()
 * L.w()
 * L.json()
 */
object L {
    /**
     * Similar of Log.d
     */
    fun d(obj: Any?, tag: String? = null) {
        if (AmniXtension.isLoggingEnabled)
            log(Log.DEBUG, tag, obj)
    }

    /**
     * Log the Json into the Logcat as a DEBUG Log
     */
    fun json(json: Any?, tag: String? = null) {
        if (AmniXtension.isLoggingEnabled)
            log(Log.DEBUG, tag, formatJson(if (json == null) "null" else "" + json))

    }

    /**
     * Similar of Log.e
     */
    fun e(obj: Any?, tag: String? = null) {
        if (AmniXtension.isLoggingEnabled)
            log(Log.ERROR, tag, obj)
    }

    /**
     * Similar of Log.i
     */
    fun i(obj: Any?, tag: String? = null) {
        if (AmniXtension.isLoggingEnabled)
            log(Log.INFO, tag, obj)
    }

    /**
     * Similar of Log.v
     */
    fun v(obj: Any?, tag: String? = null) {
        if (AmniXtension.isLoggingEnabled)
            log(Log.VERBOSE, tag, obj)
    }

    /**
     * Similar of Log.w
     */
    fun w(obj: Any?, tag: String? = null) {
        if (AmniXtension.isLoggingEnabled)
            log(Log.WARN, tag, obj)
    }

    /**
     * Similar of Log.wtf
     */
    fun wtf(throwable: Throwable?, tag: String? = null) {
        if (AmniXtension.isLoggingEnabled)
            e(Log.getStackTraceString(throwable), tag)
    }


    private fun formatJson(json: String): String {
        return try {
            val trimJson = json.trim()
            when {
                trimJson.startsWith("{") -> JSONObject(trimJson).toString(2)
                trimJson.startsWith("[") -> JSONArray(trimJson).toString(2)
                else -> trimJson
            }
        } catch (e: JSONException) {
            wtf(e)
            "An Error While Printing This Json. Please Check Above CrashLog"

        }

    }

    private fun log(priority: Int, tag: String?, msg: Any?) {
        if (!AmniXtension.isLoggingEnabled) return
        val elements = Thread.currentThread().stackTrace
        val element = elements[findIndex(elements)]
        Log.println(priority, handleTag(element, tag), msg.toString())
    }

    private fun handleTag(element: StackTraceElement, customTag: String?): String = when {
        customTag.isNullOrBlank().not() -> customTag!!
        AmniXtension.globalLogTag.isNotBlank() -> AmniXtension.globalLogTag
        else -> element.className.substringAfterLast(".")
    }

    private fun findIndex(elements: Array<StackTraceElement>): Int {
        var index = 4
        while (index < elements.size) {
            val className = elements[index].className
            if (className != L::class.java.name && !elements[index].methodName.startsWith("log")) {
                return index
            }
            index++
        }
        return -1
    }
}