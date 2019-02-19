package com.amnix.utils.enums

/**
 * Enum to choose between multiple column type
 */
enum class ContentColumns(internal val s: String) {
    SIZE ("_size"),
    DISPLAY_NAME ("_display_name"),
    TITLE ("title"),
    DATE_ADDED ("date_added"),
    DATE_MODIFIED ("date_modified"),
    WIDTH ("width"),
    HEIGHT ("height")
}