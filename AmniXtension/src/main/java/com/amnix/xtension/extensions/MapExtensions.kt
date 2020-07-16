package com.amnix.xtension.extensions

fun <K, V> Map<K, List<V>>.flatten(): List<Any?> =
    map { (k, v) ->
        mutableListOf<Any?>().apply {
            add(k)
            addAll(v)
        }
    }.flatten()

fun <K, V> Map<K, List<V>>.indexInSection(element: V): Int {
    forEach { (_, list) -> if (list.contains(element)) return list.indexOf(element) }
    return -1
}

fun <K, V> Map<K, List<V>>.keyIndex(key: K?): Int {
    key ?: return -1
    var index = 0
    forEach { (k, _) -> if (key == k) return index else index++ }
    return -1
}

fun <K, V> Map<K, List<V>>.keyAtIndex(index: Int): K? {
    keys.forEachIndexed { ind, k -> if (ind == index) return k }
    return null
}

fun <K, V> Map<K, List<V>>.sectionKey(element: V): K? {
    forEach { (k, list) -> if (list.contains(element)) return k }
    return null
}

fun <K, V> MutableMap<K, V>.putAllIfNotNull(
    vararg data: Pair<K, V?>,
    predicate: (V) -> Boolean = { true }
) {
    for ((key, value) in data) {
        value?.also { if (predicate.invoke(it)) putIfNotNull(key, value) }
    }
}

fun <K, V> MutableMap<K, V>.putIfNotNull(value: Pair<K, V?>): V? = putIfNotNull(value.first, value.second)

fun <K, V> MutableMap<K, V>.putIfNotNull(key: K, value: V?): V? = if (value != null) put(key, value) else get(key)

fun <K, V> MutableMap<K, V>.putAllIfNotNull(map: Map<K, V>?) = map?.let { putAll(it) } ?: Unit

fun <K, V> MutableMap<K, V>.putIfNotContains(value: Pair<K, V>): V? = putIfNotContains(value.first, value.second)

fun <K, V> MutableMap<K, V>.putIfNotContains(key: K, value: V): V? = if (containsKey(key)) get(key) else put(key, value)

fun <K, V> MutableMap<K, V>.put(value: Pair<K, V>): V? = put(value.first, value.second)

fun <K, V> MutableMap<K, V>.putAll(vararg values: Pair<K, V>) = putAll(values.asSequence())

fun <K, V : CharSequence> MutableMap<K, V>.putAllIfNotNullOrEmpty(vararg data: Pair<K, V?>) =
    putAllIfNotNull(*data) { it.isNotEmpty() }

fun <K, V : CharSequence> MutableMap<K, V>.putAllIfNotNullOrBlank(vararg data: Pair<K, V?>) =
    putAllIfNotNull(*data) { it.isNotBlank() }