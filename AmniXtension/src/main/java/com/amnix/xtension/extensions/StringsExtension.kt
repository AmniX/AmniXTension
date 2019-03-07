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

package com.amnix.xtension.extensions

import android.util.Base64
import java.io.File
import java.io.FileOutputStream
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.Charset
import java.security.MessageDigest
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec



/**
 * Append String to Current
 */
fun String.append(other: String) = this + other

/**
 * True if String is a Phone Number
 */
fun String.isPhone(): Boolean {
    val p = "^1([34578])\\d{9}\$".toRegex()
    return matches(p)
}

/**
 * True if Email
 */
fun String.isEmail(): Boolean {
    val p = "^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)\$".toRegex()
    return matches(p)
}

/**
 * True if Numeric
 */
fun String.isNumeric(): Boolean {
    val p = "^[0-9]+$".toRegex()
    return matches(p)
}

/**
 * returns the md5 of the String
 */
fun String.md5() = encrypt(this, "MD5")

/**
 * return SHA1 of the String
 */
fun String.sha1() = encrypt(this, "SHA-1")

/**
 * Returns a new File Object with the Current String as Its path
 */
fun String.toFile() = File(this)

/**
 * Encode String to URL
 */
fun String.encodeToUrl(charSet: String = "UTF-8"): String = URLEncoder.encode(this, charSet)

/**
 * Decode String to URL
 */
fun String.decodeToUrl(charSet: String = "UTF-8"): String = URLDecoder.decode(this, charSet)

/**
 * Encode To Base64
 */

fun String.encodeToBase64(): String = Base64.encodeToString(this.toByteArray(), Base64.DEFAULT)

/**
 * Decode to Base64
 */
fun String.decodeToBase64(): String =
    String(Base64.decode(this.toByteArray(), Base64.DEFAULT), Charset.defaultCharset())

/**
 * Converts the String to Camel Case
 */
fun String.toCamelCase(): String {
    if (length == 0)
        return this
    val parts = split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    var camelCaseString = ""
    for (part in parts) camelCaseString = camelCaseString + part.toTitleCase() + " "
    return camelCaseString
}

/**
 * Split String into Multiple SubStrings Based on the Value of [maxLength]
 */
fun String.splitSubStrings(maxLength: Int): Array<String> {
    val ret = ArrayList<String>()
    var start = 0
    while (start < length) {
        ret.add(substring(start, Math.min(length, start + maxLength)))
        start += maxLength
    }
    return ret.toTypedArray()
}

/**
 * Converts the String to Title Case
 */
fun String.toTitleCase(): String {
    return substring(0, 1).toUpperCase() + substring(1).toLowerCase()
}

/**
 * Encrypt String to AES with the specific Key
 */
fun String.encryptAES(key: String): String {
    var crypted: ByteArray? = null
    try {
        val skey = SecretKeySpec(key.toByteArray(), "AES")
        val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
        cipher.init(Cipher.ENCRYPT_MODE, skey)
        crypted = cipher.doFinal(toByteArray())
    } catch (e: Exception) {
        println(e.toString())
    }
    return String(Base64.encode(crypted, Base64.DEFAULT))
}

/**
 * Decrypt String to AES with the specific Key
 */
fun String.decryptAES(key: String): String {
    var output: ByteArray? = null
    try {
        val skey = SecretKeySpec(key.toByteArray(), "AES")
        val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
        cipher.init(Cipher.DECRYPT_MODE, skey)
        output = cipher.doFinal(Base64.decode(this, Base64.DEFAULT))
    } catch (e: Exception) {
        println(e.toString())
    }
    return output?.let { String(it) } ?: ""
}

/**
 * encode The String to Binary
 */
fun String.encodeToBinary(): String {
    val stringBuilder = StringBuilder()
    toCharArray().forEach {
        stringBuilder.append(Integer.toBinaryString(it.toInt()))
        stringBuilder.append(" ")
    }
    return stringBuilder.toString()
}

/**
 * Decode the String from binary
 */
fun String.deCodeToBinary(): String {
    val stringBuilder = StringBuilder()
    split(" ").forEach {
        stringBuilder.append(Integer.parseInt(it.replace(" ", ""), 2))
    }
    return stringBuilder.toString()
}

/**
 * Save String to a Given File
 */
fun String.saveToFile(file: File) = FileOutputStream(file).bufferedWriter().use {
    it.write(this)
    it.flush()
    it.close()
}

// Private Method Below....
private fun encrypt(string: String?, type: String): String {
    val bytes = MessageDigest.getInstance(type).digest(string!!.toByteArray())
    return bytes2Hex(bytes)
}

internal fun bytes2Hex(bts: ByteArray): String {
    var des = ""
    var tmp: String
    for (i in bts.indices) {
        tmp = Integer.toHexString(bts[i].toInt() and 0xFF)
        if (tmp.length == 1) {
            des += "0"
        }
        des += tmp
    }
    return des
}