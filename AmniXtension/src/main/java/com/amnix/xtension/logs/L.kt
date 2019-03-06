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
import com.amnix.xtension.extensions.splitSubString
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

/**
 * A Custom Log Class for the developer Ease
 */
object L {

    private val SHOW_LOGS = AmniXtension.isLoggingEnabled

    /**
     * Similar of Log.d but with many params
     */
    fun d(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects) {
                log(Log.DEBUG, if (obj == null) "null" else "" + obj)
            }
    }

    /**
     * Log the Json into the Logcat as a DEBUG Log
     */
    fun json(json: Any?) {
        if (SHOW_LOGS)
            if (SHOW_LOGS)
                log(Log.DEBUG, formatJson(if (json == null) "null" else "" + json))

    }

    /**
     * Similar of Log.e but with many params
     */
    fun e(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects) log(Log.ERROR, if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.i but with many params
     */
    fun i(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                log(Log.INFO, if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.v but with many params
     */
    fun v(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                log(Log.VERBOSE, if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.w but with many params
     */
    fun w(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                log(Log.WARN, if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.wtf but with many params
     */
    fun wtf(vararg throwables: Throwable?) {
        if (SHOW_LOGS)
            for (throwable in throwables) e(Log.getStackTraceString(throwable))
    }

    private var logEnabled = AmniXtension.isLoggingEnabled
    private var logGlobalTag = AmniXtension.globalLogTag
    private const val TOP_LEFT_CORNER = '╔'
    private const val TOP_RIGHT_CORNER = "╗"
    private const val BOTTOM_LEFT_CORNER = '╚'
    private const val BOTTOM_RIGHT_CORNER = "╝"
    private const val MIDDLE_CORNER_START = '╟'
    private const val MIDDLE_CORNER_END = "╢"
    private const val VERTICAL_DOUBLE_LINE = '║'
    private const val MAX_LINE_LENGTH = 64 * 2
    private const val CALL_INDEX = 4


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
        var infoLine =
            "║ " + "Thread: " + Thread.currentThread().name + ", Source: " + element.className + "." + element.methodName + " (" + element.fileName + ":" + element.lineNumber + ")"
        var TOP_BORDER: String = TOP_LEFT_CORNER.toString()
        var MIDDLE_BORDER: String = MIDDLE_CORNER_START.toString()
        var BOTTOM_BORDER: String = BOTTOM_LEFT_CORNER.toString()
        var maxLength = -1
        val msgLines = msg.split(System.getProperty("line.separator")!!)
        msgLines.forEach {
            if (Math.min(it.length, MAX_LINE_LENGTH) > maxLength)
                maxLength = Math.min(it.length, MAX_LINE_LENGTH)
        }
        if (maxLength < infoLine.length)
            maxLength = infoLine.length
        while (maxLength.rem(4) != 0)
            maxLength++

        maxLength.loop {
            TOP_BORDER += "═"
            MIDDLE_BORDER += "─"
            BOTTOM_BORDER += "═"
        }
        TOP_BORDER += TOP_RIGHT_CORNER
        MIDDLE_BORDER += MIDDLE_CORNER_END
        BOTTOM_BORDER += BOTTOM_RIGHT_CORNER
        var spaceRequired = TOP_BORDER.length - infoLine.length
        if (spaceRequired < 4)
            repeat(spaceRequired) {
                infoLine += " "
            }
        else {
            while (spaceRequired >= 4) {
                infoLine += "\t"
                spaceRequired -= 4
            }
            spaceRequired.loop {
                infoLine += " "
            }
        }
        infoLine += VERTICAL_DOUBLE_LINE.toString()
        return StringBuilder().apply {
            append(" ")
            appendln()
            append(TOP_BORDER)
            appendln()
            append(infoLine)
            appendln()
            append(MIDDLE_BORDER)
            appendln()
            msgLines.forEachIndexed { index, it ->
                appendLine(TOP_BORDER.length,it,this)
                if (index != msgLines.size - 1)
                    appendln()
            }
            appendln()
            append(BOTTOM_BORDER)
            appendln()
        }.toString()
    }

    private fun appendLine(topBorderLength : Int, line:String, addTo:java.lang.StringBuilder){
        var msg = line.trim()
        if (msg.length > MAX_LINE_LENGTH) {
            val lines = msg.splitSubString(MAX_LINE_LENGTH)
            lines.forEachIndexed { index, it ->
                appendLine(MAX_LINE_LENGTH, it, addTo)
                if (index != lines.size - 1)
                    addTo.appendln()
            }
        }
        //msg = msg.substring(0, MAX_LINE_LENGTH - 3) + "..."

        var spaceRequired = topBorderLength - msg.length - 2
        if (spaceRequired > 0) {
            if (spaceRequired < 4)
                repeat(spaceRequired) {
                    msg += " "
                }
            else {
                while (spaceRequired >= 4) {
                    msg += "    "
                    spaceRequired -= 4
                }
                spaceRequired.loop {
                    msg += " "
                }
            }
        }
        msg += VERTICAL_DOUBLE_LINE.toString()
        addTo.append("$VERTICAL_DOUBLE_LINE")
        addTo.append(msg)
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
            if (className != L::class.java.name && !elements[index].methodName.startsWith("log")) {
                return index
            }
            index++
        }
        return -1
    }
}