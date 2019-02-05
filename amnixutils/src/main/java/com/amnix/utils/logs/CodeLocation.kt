package com.amnix.utils.logs

internal class CodeLocation internal constructor(mStackTrace: Array<StackTraceElement?>) {
    private var mFileName: String = ""
    private var mLineNumber: Int = 0


    init {
        val root = mStackTrace[0]
        root?.let {
            mFileName = it.fileName
            mLineNumber = it.lineNumber
        }
    }


    override fun toString(): String {
        return "(" +
                mFileName +
                ':'.toString() +
                mLineNumber +
                ") "
    }
}