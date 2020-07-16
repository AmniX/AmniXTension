package com.amnix.xtension.extensions

import java.nio.ByteBuffer

val Float.Companion.SIZE_BYTES: Int
    get() = 4

val Double.Companion.SIZE_BYTES: Int
    get() = 8

/**
 * Converts short variable to byte array
 * @return 2 byte array representing short variable
 */
fun Short.fromHexStringToByteArray() = numberToByteArray(Short.SIZE_BYTES) { putShort(this@fromHexStringToByteArray) }

/**
 * Converts integer variable to byte array
 * @return 4 byte array representing integer variable
 */
fun Int.fromHexStringToByteArray() = numberToByteArray(Int.SIZE_BYTES) { putInt(this@fromHexStringToByteArray) }

/**
 * Converts long variable to byte array
 * @return 8 byte array representing long variable
 */
fun Long.fromHexStringToByteArray() = numberToByteArray(Long.SIZE_BYTES) { putLong(this@fromHexStringToByteArray) }

/**
 * Converts float variable to byte array
 * @return 4 byte array representing float variable
 */
fun Float.fromHexStringToByteArray() = numberToByteArray(Float.SIZE_BYTES) { putFloat(this@fromHexStringToByteArray) }

/**
 * Converts double variable to byte array
 * @return 8 byte array representing double variable
 */
fun Double.fromHexStringToByteArray() = numberToByteArray(Double.SIZE_BYTES) { putDouble(this@fromHexStringToByteArray) }

/**
 * Converts byte array to short variable
 * @return short variable result
 * @throws NumberFormatException in case of byte array size not equals 2
 */
@Throws(NumberFormatException::class)
fun ByteArray.toShort(): Short = toNumeric(Short.SIZE_BYTES) { short }

/**
 * Converts byte array to integer variable
 * @return integer variable result
 * @throws NumberFormatException in case of byte array size not equals 4
 */
@Throws(NumberFormatException::class)
fun ByteArray.toInt(): Int = toNumeric(Int.SIZE_BYTES) { int }

/**
 * Converts byte array to long variable
 * @return long variable result
 * @throws NumberFormatException in case of byte array size not equals 8
 */
@Throws(NumberFormatException::class)
fun ByteArray.toLong(): Long = toNumeric(Long.SIZE_BYTES) { long }

/**
 * Converts byte array to float variable
 * @return float variable result
 * @throws NumberFormatException in case of byte array size not equals 4
 */
@Throws(NumberFormatException::class)
fun ByteArray.toFloat(): Float = toNumeric(Float.SIZE_BYTES) { float }

/**
 * Converts byte array to double variable
 * @return double variable result
 * @throws NumberFormatException in case of byte array size not equals 8
 */
@Throws(NumberFormatException::class)
fun ByteArray.toDouble(): Double = toNumeric(Double.SIZE_BYTES) { double }

/**
 * Converts byte array to its hex string representation. Example: [34, 0, 0, -101] to "2200009b"
 * @param upperCase - should use upper case for letters in result string
 * @return hex string representing this byte array
 */
fun ByteArray.toHexString(upperCase: Boolean = false): String {
    val x = if (upperCase) 'X' else 'x'

    return this.joinToString(separator = "") { "%02$x".format(it) }
}

/**
 * Converts hex string, which represent byte array, to byte array. Example: "2200009b" to [34, 0, 0, -101]
 * @return byte array from this string
 * @throws java.lang.NumberFormatException in case if string contains illegal letters (must contains only a,b,c,b,e,f)
 */
@Throws(java.lang.NumberFormatException::class)
fun String.fromHexStringToByteArray(): ByteArray {
    val size = this.length shr 1
    val array = ByteArray(size)

    for (i in this.indices step 2) {
        val strByte = this.substring(i, i + 2)
        val byte = strByte.toInt(radix = 16).toByte()
        array[i shr 1] = byte
    }

    return array
}

private inline fun numberToByteArray(size: Int, bufferFun: ByteBuffer.() -> ByteBuffer): ByteArray =
    ByteBuffer.allocate(size).bufferFun().array()

@Throws(NumberFormatException::class)
private inline fun <reified T: Number> ByteArray.toNumeric(size: Int, bufferFun: ByteBuffer.() -> T): T {
    if (this.size != size) throw NumberFormatException("${T::class.java.simpleName} value must contains $size bytes")

    return ByteBuffer.wrap(this).bufferFun()
}