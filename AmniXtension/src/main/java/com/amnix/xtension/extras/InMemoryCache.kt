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

import java.util.*

/**
 * Class for an InMemory Cache to keep your variables globally in heap and get them wherever you want.
 */
object InMemoryCache {
    private val map = WeakHashMap<String, Any?>()
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
    /**
     * check if have the value on the Given Key
     */
    fun contains(key: String) = map.contains(key)

    /**
     * Clear all the InMemoryCache
     */
    fun clear() = map.clear()

    /**
     * get All The InMemoryCache
     */
    fun getAll() = map.toMap()

    /**
     * get All the InMemoryCache of an Specific Type.
     */
    fun getAllByType(clazz: Class<*>) = getAll().filter {
        it.value != null && it.value!!::class.java == clazz
    }
}