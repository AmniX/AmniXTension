package com.amnix.utils.extensions

import android.Manifest
import android.graphics.Bitmap
import android.graphics.Rect
import android.support.annotation.RequiresPermission
import java.io.File
import java.io.FileOutputStream

fun Bitmap.size(): Pair<Int, Int> = Pair(width, height)
@RequiresPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
fun Bitmap.save(
    to: String,
    format: Bitmap.CompressFormat = Bitmap.CompressFormat.JPEG,
    quality: Int = 100,
    recycle: Boolean = true
): Boolean =
    FileOutputStream(File(to)).use {
        this.compress(format, quality, it)
        it.flush()
        it.close()
        if (recycle)
            recycle()
        true
    }

@RequiresPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
fun Bitmap.saveAsync(
    to: String,
    format: Bitmap.CompressFormat = Bitmap.CompressFormat.JPEG,
    quality: Int = 100,
    recycle: Boolean = true
) = async {
    this.save(to, format, quality, recycle)
}

fun Bitmap.crop(r: Rect) =
    if (Rect(0, 0, width, height).contains(r)) Bitmap.createBitmap(this, r.left, r.top, r.width(), r.height()) else null