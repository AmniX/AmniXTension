package com.amnix.utils.extras
class BenchMarkUtils {
    private var startTime = System.currentTimeMillis()
    fun reset(){
        startTime = System.currentTimeMillis()
    }
    fun dump(logTag: String, msg: String) {
        Log.d("$logTag : ", msg + " Took " + (System.currentTimeMillis() - startTime))
    }

    fun dump(msg: String) {
        Log.d("BenchMark : ", msg + " Took " + (System.currentTimeMillis() - startTime))
    }
}