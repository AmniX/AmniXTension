package com.amnix.utils.extras

/**
 * Class for an InMemory Cache to keep your variables globally in heap and get them wherever you want.
 */
object InMemoryCache {
    private val map = HashMap<String, Any?>()
    /**
     * put [key] & [value] where
     *
     * @param key is the String to get the value from anywhere, If you have the key then you can get the value. So keep it safe.
     *
     */
    fun put(key: String, value: Any?): InMemoryCache {
        map[key] = value
        return this
    }

    /**
     * get the saved value addressed by the key
     */
    fun get(key: String): Any? = map[key]

    fun have(key: String) = map.containsKey(key)

    fun clear() = map.clear()::class.java.getDeclaredMethod("",null,null)

    fun getAll() = map.toMap()

    fun getAllByType(clazz: Class<*>) = getAll().filter {
        it.value != null && it.value!!::class.java == clazz
    }
}