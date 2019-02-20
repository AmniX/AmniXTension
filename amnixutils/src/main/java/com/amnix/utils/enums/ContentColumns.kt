package com.amnix.utils.enums

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