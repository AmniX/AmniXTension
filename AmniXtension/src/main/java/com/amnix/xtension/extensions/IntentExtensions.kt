package com.amnix.xtension.extensions

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager

fun Intent.isActivityResolvable(ctx: Context) = ctx.packageManager.resolveActivity(
    this,
    PackageManager.MATCH_DEFAULT_ONLY
) != null

fun Intent.isServiceResolvable(ctx: Context) = ctx.packageManager.resolveService(
    this,
    PackageManager.MATCH_DEFAULT_ONLY
) != null