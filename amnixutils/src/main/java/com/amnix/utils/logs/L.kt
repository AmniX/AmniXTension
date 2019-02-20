package com.amnix.utils.logs

import android.util.Log
import com.amnix.utils.AmniXUtils


import org.json.JSONException
import org.json.JSONObject

/**
 * A Custom Log Class for the developer Ease
 */
object L {

    private val SHOW_LOGS = AmniXUtils.isLoggingEnabled

    private val codeLocation: CodeLocation
        get() = getCodeLocation(3)

    /**
     * Similar of Log.d but with many params
     */
    fun d(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects) {
                val msg = if (obj == null) "null" else "" + obj
                Log.d(codeLocation.toString(), msg)
            }
    }

    /**
     * Log the Json into the Logcat as a DEBUG Log
     */
    fun json(json: Any?) {
        if (SHOW_LOGS)
            when (json) {
                null -> Log.d(codeLocation.toString(), "null")
                is JSONObject -> try {
                    d(json.toString(4))
                } catch (e: JSONException) {
                    wtf(e)
                }
                else -> try {
                    d(codeLocation.toString(), JSONObject(json.toString()).toString(4))
                } catch (e: JSONException) {
                    wtf(e)
                }
            }

    }

    /**
     * Similar of Log.e but with many params
     */
    fun e(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects) {
                Log.e(codeLocation.toString(), if (obj == null) "null" else "" + obj)
            }
    }
    /**
     * Similar of Log.i but with many params
     */
    fun i(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                Log.i(codeLocation.toString(), if (obj == null) "null" else "" + obj)
    }
    /**
     * Similar of Log.v but with many params
     */
    fun v(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                Log.v(codeLocation.toString(), if (obj == null) "null" else "" + obj)
    }
    /**
     * Similar of Log.w but with many params
     */
    fun w(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (obj in objects)
                Log.w(codeLocation.toString(), if (obj == null) "null" else "" + obj)
    }
    /**
     * Similar of Log.wtf but with many params
     */
    fun wtf(vararg throwables: Throwable?) {
        if (SHOW_LOGS)
            for (throwable in throwables) {
                Log.wtf(codeLocation.toString(), Log.getStackTraceString(throwable))
            }
    }

    private fun getCodeLocation(depth: Int): CodeLocation {
        val stackTrace = Throwable().stackTrace
        val filteredStackTrace = arrayOfNulls<StackTraceElement>(stackTrace.size - depth)
        System.arraycopy(stackTrace, depth, filteredStackTrace, 0, filteredStackTrace.size)
        return CodeLocation(filteredStackTrace)
    }


}