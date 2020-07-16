package com.amnix.xtension.extensions

fun Boolean?.safe(default: Boolean = false): Boolean = this ?: default

fun Byte?.safe(default: Byte = 0): Byte = this ?: default

fun Short?.safe(default: Short = 0): Short = this ?: default

fun Int?.safe(default: Int = 0): Int = this ?: default

fun Long?.safe(default: Long = 0): Long = this ?: default

fun Float?.safe(default: Float = 0f): Float = this ?: default

fun Double?.safe(default: Double = 0.toDouble()): Double = this ?: default


fun <T : CharSequence> T?.safe(default: T = "" as T): T = this ?: default

fun BooleanArray?.safe(default: BooleanArray = booleanArrayOf()): BooleanArray = this ?: default

fun ByteArray?.safe(default: ByteArray = byteArrayOf()): ByteArray = this ?: default

fun ShortArray?.safe(default: ShortArray = shortArrayOf()): ShortArray = this ?: default

fun IntArray?.safe(default: IntArray = intArrayOf()): IntArray = this ?: default

fun LongArray?.safe(default: LongArray = longArrayOf()): LongArray = this ?: default

fun FloatArray?.safe(default: FloatArray = floatArrayOf()): FloatArray = this ?: default

fun DoubleArray?.safe(default: DoubleArray = doubleArrayOf()): DoubleArray = this ?: default

fun IntRange?.safe(default: IntRange = 0..0): IntRange = this ?: default

fun LongRange?.safe(default: LongRange = 0L..0L): LongRange = this ?: default

inline fun <reified E> Array<E>?.safe(): Array<E> =
    this ?: emptyArray()

fun <E> List<E>?.safe(default: List<E> = emptyList()): List<E> = this ?: default

fun <K, V> Map<K, V>?.safe(default: Map<K, V> = emptyMap()): Map<K, V> = this ?: default

/**
 * SAFE MUTABLE
 */

fun <E> List<E>?.safeMutable(default: MutableList<E> = mutableListOf()): MutableList<E> =
    (if (this is MutableList<E>) this else this?.toMutableList()) ?: default

fun <K, V> Map<K, V>?.safeMutable(default: MutableMap<K, V> = mutableMapOf()): MutableMap<K, V> =
    (if (this is MutableMap<K, V>) this else this?.toMutableMap()) ?: default

/**
 * CHECKERS
 */

fun CharSequence?.isNotNullOrEmpty() = !isNullOrEmpty()

fun CharSequence?.isNotNullOrBlank() = !isNullOrBlank()

fun <E> List<E>?.isNotNullOrEmpty() = this != null && isNotEmpty()

fun <E> List<E>?.isNullOrEmpty(): Boolean = this == null || isEmpty()

fun <K, V> Map<K, V>?.isNotNullOrEmpty() = this != null && isNotEmpty()

fun <K, V> Map<K, V>?.isNullOrEmpty() = this == null || isEmpty()

fun <T> T?.isNull() = this == null

fun <T> T?.isNotNull() = this != null

/**
 * ACTIONS
 */

fun <T> T?.ifNotNull(toBoolean: T.() -> Boolean) =
    if (this != null) toBoolean() else false