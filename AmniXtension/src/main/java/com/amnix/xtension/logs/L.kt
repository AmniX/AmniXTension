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
                val msg = if (obj == null) "null" else "" + obj
                AmniXLog.d(msg)
            }
    }

    /**
     * Log the Json into the Logcat as a DEBUG Log
     */
    fun json(json: Any?) {
        if (SHOW_LOGS)
            if (SHOW_LOGS)
                AmniXLog.json(if (json == null) "null" else "" + json)

    }

    /**
     * Similar of Log.e but with many params
     */
    fun e(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects) {
                AmniXLog.e(if (obj == null) "null" else "" + obj)
            }
    }

    /**
     * Similar of Log.i but with many params
     */
    fun i(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                AmniXLog.i(if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.v but with many params
     */
    fun v(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                AmniXLog.v(if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.w but with many params
     */
    fun w(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                AmniXLog.w(if (obj == null) "null" else "" + obj)
    }

    /**
     * Similar of Log.wtf but with many params
     */
    fun wtf(vararg throwables: Throwable?) {
        if (SHOW_LOGS)
            for (throwable in throwables) {
                AmniXLog.e(Log.getStackTraceString(throwable))
            }
    }
}