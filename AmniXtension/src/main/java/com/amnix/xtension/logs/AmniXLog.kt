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

internal object AmniXLog {

    private var logEnabled = AmniXtension.isLoggingEnabled
    private var logGlobalTag = AmniXtension.globalLogTag

    private const val TOP_LEFT_CORNER = '╔'
    private const val TOP_RIGHT_CORNER = "╗"
    private const val BOTTOM_LEFT_CORNER = '╚'
    private const val BOTTOM_RIGHT_CORNER = "╝"
    private const val MIDDLE_CORNER_START = '╟'
    private const val MIDDLE_CORNER_END = "╢"
    private const val VERTICAL_DOUBLE_LINE = '║'
    private const val HORIZONTAL_DOUBLE_LINE = "═══════════════════════════════════════════════════════════"
    private const val SINGLE_LINE = "───────────────────────────────────────────────────────────"

    private val TOP_BORDER = TOP_LEFT_CORNER + HORIZONTAL_DOUBLE_LINE + HORIZONTAL_DOUBLE_LINE + TOP_RIGHT_CORNER
    private val BOTTOM_BORDER =
        BOTTOM_LEFT_CORNER + HORIZONTAL_DOUBLE_LINE + HORIZONTAL_DOUBLE_LINE + BOTTOM_RIGHT_CORNER
    private val MIDDLE_BORDER = MIDDLE_CORNER_START + SINGLE_LINE + SINGLE_LINE + MIDDLE_CORNER_END

    private const val CALL_INDEX = 5


    fun v(msg: String) {
        log(Log.VERBOSE, msg)
    }

    fun d(msg: String) {
        log(Log.DEBUG, msg)
    }

    fun i(msg: String) {
        log(Log.INFO, msg)
    }

    fun w(msg: String) {
        log(Log.WARN, msg)
    }

    fun e(msg: String) {
        log(Log.ERROR, msg)
    }

    fun json(msg: String) {
        log(Log.DEBUG, formatJson(msg))
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
            e.printStackTrace().toString()
        }

    }

    private fun log(priority: Int, msg: String) {
        if (!logEnabled) return

        val elements = Thread.currentThread().stackTrace
        val index = findIndex(elements)
        val element = elements[index]
        val tag = handleTag(element, "")
        var message = msg
        if (msg.contains("\n")) {
            message = msg.replace("\n".toRegex(), "\n$VERTICAL_DOUBLE_LINE ")
        }

        Log.println(priority, tag, handleFormat(element, message))
    }

    private fun handleFormat(element: StackTraceElement, msg: String): String {
        var threadNameLine = ("║ " + "Thread: " + Thread.currentThread().name)
        repeat((TOP_BORDER.length ) - threadNameLine.length + 1) {
            threadNameLine += " "
        }
        threadNameLine += VERTICAL_DOUBLE_LINE.toString()
        return StringBuilder().apply {
            append(" ")
            appendln()
            append(TOP_BORDER)
            appendln()
            append(threadNameLine)
            appendln()
            append(MIDDLE_BORDER)
            appendln()
            append("║ ")
            append("Source: ").append(element.className)
                .append(".")
                .append(element.methodName).append(" (")
                .append(element.fileName)
                .append(":")
                .append(element.lineNumber)
                .append(")")
            appendln()
            append(MIDDLE_BORDER)
            appendln()
            append("$VERTICAL_DOUBLE_LINE ")
            append(msg)
            appendln()
            append(BOTTOM_BORDER)
            appendln()
        }.toString()
    }

    private fun handleTag(element: StackTraceElement, customTag: String): String = when {
        customTag.isNotBlank() -> customTag
        logGlobalTag.isNotBlank() -> logGlobalTag
        else -> element.className.substringAfterLast(".")
    }

    private fun findIndex(elements: Array<StackTraceElement>): Int {
        var index = CALL_INDEX
        while (index < elements.size) {
            val className = elements[index].className
            if (className != AmniXLog::class.java.name && !elements[index].methodName.startsWith("log")) {
                return index
            }
            index++
        }
        return -1
    }
}