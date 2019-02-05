package com.amnix.utils.logs

import android.util.Log
import com.amnix.utils.AmniXUtils


import org.json.JSONException
import org.json.JSONObject

object L {

    private val SHOW_LOGS = AmniXUtils.isLoggingEnabled

    private val codeLocation: CodeLocation
        get() = getCodeLocation(3)

    fun d(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (objs in objects) {
                val msg = if (objs == null) "null" else "" + objs
                Log.d(codeLocation.toString(), msg)
            }
    }

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

    fun e(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (objs in objects) {
                Log.e(codeLocation.toString(), if (objs == null) "null" else "" + objs)
            }
    }

    fun i(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (`object` in objects)
                Log.i(codeLocation.toString(), if (`object` == null) "null" else "" + `object`)
    }

    fun v(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (`object` in objects)
                Log.v(codeLocation.toString(), if (`object` == null) "null" else "" + `object`)
    }

    fun w(vararg objects: Any?) {
        if (SHOW_LOGS)
            for (`object` in objects)
                Log.w(codeLocation.toString(), if (`object` == null) "null" else "" + `object`)
    }

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