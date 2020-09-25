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

inline fun <reified T : Enum<T>> find(predicate: (item: T) -> Boolean): T? = enumValues<T>().find { predicate(it) }

inline fun <reified T : Enum<T>> first(predicate: (item: T) -> Boolean): T = enumValues<T>().first { predicate(it) }

inline fun <reified T : Enum<T>> convert(ord: Int): T = enumValues<T>()[ord]

/**
 * Returns an enum entry with specified name.
 */
inline fun <reified E : Enum<E>> enumValueOfOrNull(name: String?): E? {
    return try {
        enumValueOf<E>(name!!)
    } catch (e: IllegalArgumentException) {
        null
    } catch (e: NullPointerException) {
        null
    }
}

/**
 * Returns an enum entry with specified name.
 */
inline fun <reified T : Enum<T>> String.enumSafeValueOf(): T? {
    return try {
        enumValueOf<T>(this)
    } catch (e: Exception) {
        null
    }
}