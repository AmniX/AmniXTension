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

/**
 * Converts Boolean to Int, if true then 1 else 0
 */
fun Boolean.toInt():Int = if(this) 1 else 0

/**
 * Toggle the Boolean Value, if it's true then it will become false else vice versa.
 */
fun Boolean.toggle() = !this