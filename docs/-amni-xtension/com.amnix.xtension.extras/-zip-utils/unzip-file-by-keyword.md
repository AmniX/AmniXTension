[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ZipUtils](index.md) / [unzipFileByKeyword](./unzip-file-by-keyword.md)

# unzipFileByKeyword

`static fun unzipFileByKeyword(zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, destDirPath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, keyword: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extras/ZipUtils.java#L266)

Unzip the file by keyword.

### Parameters

`zipFilePath` - The path of ZIP file.

`destDirPath` - The path of destination directory.

`keyword` - The keyboard.

### Exceptions

`IOException` - if unzip unsuccessfully

**Return**
the unzipped files

`static fun unzipFileByKeyword(zipFile: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, destDir: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, keyword: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extras/ZipUtils.java#L282)

Unzip the file by keyword.

### Parameters

`zipFile` - The ZIP file.

`destDir` - The destination directory.

`keyword` - The keyboard.

### Exceptions

`IOException` - if unzip unsuccessfully

**Return**
the unzipped files

