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
import com.amnix.xtension.extensions.loop
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
    private const val MAX_LINE_LENGTH = 64 * 2

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
            L.wtf(e)
            "An Error While Printing This Json. Please Check Above CrashLog"

        }

    }

    private fun log(priority: Int, msg: String) {
        if (!logEnabled) return

        val elements = Thread.currentThread().stackTrace
        val index = findIndex(elements)
        val element = elements[index]
        val tag = handleTag(element, "")
        Log.println(priority, tag, handleFormat(element, msg))
    }

    private fun handleFormat(element: StackTraceElement, msg: String): String {
        var TOP_BORDER = TOP_BORDER
        var MIDDLE_BORDER = MIDDLE_BORDER
        var BOTTOM_BORDER = BOTTOM_BORDER
        var maxLength = -1
        val msgLines = msg.split(System.getProperty("line.separator")!!)
        msgLines.forEach {
            if (Math.min(it.length, MAX_LINE_LENGTH) > maxLength)
                maxLength = Math.min(it.length, MAX_LINE_LENGTH)
        }
        if (maxLength > TOP_BORDER.length) {
            TOP_BORDER = TOP_LEFT_CORNER.toString()
            MIDDLE_BORDER = MIDDLE_CORNER_START.toString()
            BOTTOM_BORDER = BOTTOM_LEFT_CORNER.toString()
            maxLength.plus(1).loop {
                TOP_BORDER += "═"
                MIDDLE_BORDER += "─"
                BOTTOM_BORDER += "═"
            }
            TOP_BORDER += TOP_RIGHT_CORNER
            MIDDLE_BORDER += MIDDLE_CORNER_END
            BOTTOM_BORDER += BOTTOM_RIGHT_CORNER

        }
        var threadNameLine = ("║ " + "Thread: " + Thread.currentThread().name)
        repeat(TOP_BORDER.length - threadNameLine.length - 1) {
            threadNameLine += " "
        }
        threadNameLine += VERTICAL_DOUBLE_LINE.toString()

        var sourceLine =
            "║ Source: " + element.className + "." + element.methodName + " (" + element.fileName + ":" + element.lineNumber + ")"
        repeat(TOP_BORDER.length - sourceLine.length - 1) {
            sourceLine += " "
        }
        sourceLine += VERTICAL_DOUBLE_LINE.toString()
        return StringBuilder().apply {
            append(" ")
            appendln()
            append(TOP_BORDER)
            appendln()
            append(threadNameLine)
            appendln()
            append(MIDDLE_BORDER)
            appendln()
            append(sourceLine)
            appendln()
            append(MIDDLE_BORDER)
            appendln()
            msgLines.forEachIndexed { index, it ->
                var msg = it.trim()
                if (msg.length > MAX_LINE_LENGTH)
                    msg = msg.substring(0, MAX_LINE_LENGTH - 3) + "..."
                repeat(TOP_BORDER.length - msg.length - 3) {
                    msg += " "
                }
                msg += VERTICAL_DOUBLE_LINE.toString()
                append("$VERTICAL_DOUBLE_LINE ")
                append(msg)
                if (index != msgLines.size - 1)
                    appendln()
            }
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