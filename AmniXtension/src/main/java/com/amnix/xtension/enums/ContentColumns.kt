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

package com.amnix.xtension.enums

/**
 * Enum to choose between multiple column type
 */
enum class ContentColumns(internal val s: String) {
    /**
     * the size Column
     */
    SIZE ("_size"),
    /**
     * the displayName Column
     */
    DISPLAY_NAME ("_display_name"),
    /**
     * the title Column
     */
    TITLE ("title"),
    /**
     * the date Added Column
     */
    DATE_ADDED ("date_added"),
    /**
     * the date Modified Column
     */
    DATE_MODIFIED ("date_modified"),
    /**
     * the width Column
     */
    WIDTH ("width"),
    /**
     * the Height Column
     */
    HEIGHT ("height")
}