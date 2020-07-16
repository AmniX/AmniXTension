package com.amnix.xtension.extensions

import android.os.Bundle

fun Bundle.asMap() = keySet().associateWith { get(it) }