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

package com.amnix.xtension.extras

import android.util.Log

/**
 * This Class is Responsible to BenchMark Any Lines of Code and Its Execution Time in Logcat.
 *
 * val benchMarkUtils = BenchMarkUtils()
 *
 * .................................
 * .................................
 * .......... Your Code ............
 * .................................
 * .................................
 *
 * benchMarkUtils.dump() //Prints the Execution time in Logcat
 *
 * Above comments are the demonstration on how this class can be useful
 *
 */
class BenchMarkUtils {
    private var startTime = System.currentTimeMillis()

    /**
     * resets The startTime
     */
    fun reset() {
        startTime = System.currentTimeMillis()
    }

    /**
     * dumps the log into logcat
     *
     * @param logTag is The TagName which can be useful to sort the logs output
     * @param msg is The msg which will be append into the logs for better readability.
     *
     * @return execution time
     */
    fun dump(logTag: String, msg: String): Long {
        val execTime = System.currentTimeMillis() - startTime
        Log.d("$logTag : ", "$msg Took $execTime")
        return execTime
    }

    /**
     * dumps the log into logcat
     *
     * @param msg is The msg which will be append into the logs for better readability.
     *
     * @return execution time
     */
    fun dump(msg: String): Long {
        val execTime = System.currentTimeMillis() - startTime
        Log.d("BenchMark : ", "$msg Took $execTime")
        return execTime
    }
}