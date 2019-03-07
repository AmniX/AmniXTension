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

/**
 * A Custom Log Class for the developer Ease
 */
object L {
    private const val TOP_LINE =
        "╔══════════════════════════════════════════════════════════════════════════════════════>"
    private const val MIDDLE_LINE =
        "╟────────────────────────────────────────────────────────────────────────────────────────>"
    private const val BOTTOM_LINE =
        "╚════════════════════════════════════════════════════════════════════════════════════════>"
    private const val VERTICAL_DOUBLE_LINE = "║"
    private const val CALL_INDEX = 4
    /**
     * Similar of Log.d but with many params
     */
    fun d(vararg objects: Any?) {
        if (AmniXtension.isLoggingEnabled)
            for (obj in objects) {
                log(Log.DEBUG, if (obj == null) "null" else "" + obj)
            }
    }

    /**
     * Log the Json into the Logcat as a DEBUG Log
     */
    fun json(json: Any?) {
        if (AmniXtension.isLoggingEnabled)
            if (AmniXtension.isLoggingEnabled)
                log(Log.DEBUG, formatJson(if (json == null) "null" else "" + json))

    }

    /**
     * Similar of Log.e but with many params
     */
    fun e(vararg objects: Any?) {
        if (AmniXtension.isLoggingEnabled)
            for (obj in objects) log(Log.ERROR, if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.i but with many params
     */
    fun i(vararg objects: Any?) {
        if (AmniXtension.isLoggingEnabled)
            for (obj in objects)
                log(Log.INFO, if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.v but with many params
     */
    fun v(vararg objects: Any?) {
        if (AmniXtension.isLoggingEnabled)
            for (obj in objects)
                log(Log.VERBOSE, if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.w but with many params
     */
    fun w(vararg objects: Any?) {
        if (AmniXtension.isLoggingEnabled)
            for (obj in objects)
                log(Log.WARN, if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.wtf but with many params
     */
    fun wtf(vararg throwables: Throwable?) {
        if (AmniXtension.isLoggingEnabled)
            for (throwable in throwables) e(Log.getStackTraceString(throwable))
    }


    private fun formatJson(json: String): String {
        return try {
            val trimJson = json.trim()
            when {
                trimJson.startsWith("{") -> JSONObject(trimJson).toString(4)
                trimJson.startsWith("[") -> JSONArray(trimJson).toString(4)
                else -> trimJson
            }
        } catch (e: JSONException) {
            L.wtf(e)
            "An Error While Printing This Json. Please Check Above CrashLog"

        }

    }

    private fun log(priority: Int, msg: String) {
        if (!AmniXtension.isLoggingEnabled) return
        val elements = Thread.currentThread().stackTrace
        val element = elements[findIndex(elements)]
        Log.println(priority, handleTag(element, ""), handleFormat(element, msg))
    }

    private fun handleFormat(element: StackTraceElement, msg: String): String {
        return StringBuilder().apply {
            append(" ")
            appendln()
            append(TOP_LINE)
            appendln()
            append("║ " + "Thread: " + Thread.currentThread().name + ", Source: " + element.className + "." + element.methodName + " (" + element.fileName + ":" + element.lineNumber + ")")
            appendln()
            append(MIDDLE_LINE)
            appendln()
            append(VERTICAL_DOUBLE_LINE + " " + msg.replace("\n", "\n$VERTICAL_DOUBLE_LINE"))
            appendln()
            append(BOTTOM_LINE)
            appendln()
        }.toString()
    }

    private fun handleTag(element: StackTraceElement, customTag: String): String = when {
        customTag.isNotBlank() -> customTag
        AmniXtension.globalLogTag.isNotBlank() -> AmniXtension.globalLogTag
        else -> element.className.substringAfterLast(".")
    }

    private fun findIndex(elements: Array<StackTraceElement>): Int {
        var index = CALL_INDEX
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