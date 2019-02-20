package com.amnix.xtension.extensions

import android.content.SharedPreferences

/**
 * Inspired From Android KTX
 * *******************************     *    ***********************************
 * *  sharedPreferences.edit()   *      *   *   sharedPreferences.edit {      *
 * *  .putBoolean("key", value)  * *******  *        putBoolean("key", value) *
 * *  .apply()                   *      *   *   }                             *
 * *******************************     *    ***********************************
 *
 * Cool na?
 *
 * @property editor Block to be Executed to put Values
 */
fun SharedPreferences.edit(editor: SharedPreferences.Editor.() -> Unit) {
    val tor = edit()
    editor(tor)
    tor.apply()
}