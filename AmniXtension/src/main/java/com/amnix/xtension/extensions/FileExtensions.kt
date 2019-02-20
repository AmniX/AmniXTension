package com.amnix.xtension.extensions

import android.graphics.BitmapFactory
import java.io.*
import java.nio.channels.FileChannel

/**
 * Read File data as String and Returns the Result
 */
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

/**
 * Open File in InputStream
 */
fun File.open(): InputStream = FileInputStream(this)

/**
 * Cope File to destination
 */
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

/**
 * Move File to Another Destination
 */
fun File.move(dest: File) {
    renameTo(dest)
}

/**
 * Cope Directory with All contents to new Destination
 */
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

/**
 * Move the Full Directory to another location
 */
fun File.moveDirectory(dest: File) {
    copyDirectory(dest)
    deleteAll()
}

/**
 * Delete the File or if its a Directory the delete all the contents
 */
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

/**
 * returns true if File is an Image
 */
fun File.isImage(): Boolean {
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    return try {
        val bitmap = BitmapFactory.decodeFile(absolutePath, options)
        val result = options.outWidth != -1 && options.outHeight != -1
        bitmap.recycle()
        return result
    } catch (e: Exception) {
        false
    }
}

/**
 * Convert File to ByteArray
 */
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

