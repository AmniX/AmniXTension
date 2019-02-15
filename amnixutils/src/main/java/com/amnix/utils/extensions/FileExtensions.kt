package com.amnix.utils.extensions

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.*
import java.nio.channels.FileChannel


fun File.readToString(): String {
    var text = ""
    open().use { inpS ->
        inpS.bufferedReader().use {
            text = it.readText()
            it.close()
        }
        inpS.close()
    }
    return text
}

fun File.open(): InputStream = FileInputStream(this)

fun File.copy(dest: File) {
    var fi: FileInputStream? = null
    var fo: FileOutputStream? = null
    var ic: FileChannel? = null
    var oc: FileChannel? = null
    try {
        if (!dest.exists()) {
            dest.createNewFile()
        }
        fi = FileInputStream(this)
        fo = FileOutputStream(dest)
        ic = fi.channel
        oc = fo.channel
        ic.transferTo(0, ic.size(), oc)
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        fi?.close()
        fo?.close()
        ic?.close()
        oc?.close()
    }
}

fun File.move(dest: File) {
    copy(dest)
    delete()
}

fun File.copyDirectory(dest: File) {
    if (!dest.exists()) {
        dest.mkdirs()
    }
    val files = listFiles()
    files?.forEach {
        if (it.isFile) {
            it.copy(File("${dest.absolutePath}/${it.name}"))
        }
        if (it.isDirectory) {
            val dirSrc = File("$absolutePath/${it.name}")
            val dirDest = File("${dest.absolutePath}/${it.name}")
            dirSrc.copyDirectory(dirDest)
        }
    }
}

fun File.moveDirectory(dest: File) {
    copyDirectory(dest)
    deleteAll()
}

fun File.deleteAll() {
    if (isFile && exists()) {
        delete()
        return
    }
    if (isDirectory) {
        val files = listFiles()
        if (files == null || files.isEmpty()) {
            delete()
            return
        }
        files.forEach { it.deleteAll() }
        delete()
    }
}

fun File.isImage(): Boolean {
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    return try {
        val bitmap = BitmapFactory.decodeFile(absolutePath, options)
        options.outWidth != -1 && options.outHeight != -1
    } catch (e: Exception) {
        false
    }
}

fun Bitmap.compressBySampleSize(
    maxWidth: Int,
    maxHeight: Int,
    recycle: Boolean = true
): Bitmap? {
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    val baos = ByteArrayOutputStream()
    this.compress(Bitmap.CompressFormat.JPEG, 100, baos)
    val bytes = baos.toByteArray()
    BitmapFactory.decodeByteArray(bytes, 0, bytes.size, options)
    options.inSampleSize = calculateInSampleSize(options, maxWidth, maxHeight)
    options.inJustDecodeBounds = false
    if (recycle && !isRecycled) recycle()
    return BitmapFactory.decodeByteArray(bytes, 0, bytes.size, options)
}

fun Bitmap.compressByQuality(
    quality: Int,
    recycle: Boolean = true
): Bitmap? {
    val baos = ByteArrayOutputStream()
    compress(Bitmap.CompressFormat.JPEG, quality, baos)
    val bytes = baos.toByteArray()
    if (recycle && !isRecycled) recycle()
    return BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
}


fun File.toByteArray(): ByteArray {
    val bos = ByteArrayOutputStream(this.length().toInt())
    val input = FileInputStream(this)
    val size = 1024
    val buffer = ByteArray(size)
    var len = input.read(buffer, 0, size)
    while (len != -1) {
        bos.write(buffer, 0, len)
        len = input.read(buffer, 0, size)
    }
    input.close()
    bos.close()
    return bos.toByteArray()
}

private fun calculateInSampleSize(
    options: BitmapFactory.Options,
    maxWidth: Int,
    maxHeight: Int
): Int {
    var height = options.outHeight
    var width = options.outWidth
    var inSampleSize = 1
    do {
        width = width shr 1
        height = height shr 1
        val bool = width >= maxWidth && height >= maxHeight
        if (bool.not())
            break
        else
            inSampleSize = inSampleSize shl 1
    } while (true)
    return inSampleSize
}