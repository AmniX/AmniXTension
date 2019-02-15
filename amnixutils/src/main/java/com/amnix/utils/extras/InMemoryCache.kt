package com.amnix.utils.extras


object InMemoryCache {
    private val map = HashMap<String, Any?>()

    fun put(key: String, value: Any?): InMemoryCache {
        map[key] = value
        return this
    }

    fun get(key: String): Any? = map[key]

    fun have(key: String) = map.containsKey(key)

    fun clear() = map.clear()::class.java.getDeclaredMethod("",null,null)

    fun getAll() = map.toMap()
}