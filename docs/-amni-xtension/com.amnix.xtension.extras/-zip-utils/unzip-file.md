[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ZipUtils](index.md) / [unzipFile](./unzip-file.md)

# unzipFile

`static fun unzipFile(zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, destDirPath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extras/ZipUtils.java#L224)

Unzip the file.

### Parameters

`zipFilePath` - The path of ZIP file.

`destDirPath` - The path of destination directory.

### Exceptions

`IOException` - if unzip unsuccessfully

**Return**
the unzipped files

`static fun unzipFile(zipFile: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, destDir: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extras/ZipUtils.java#L238)

Unzip the file.

### Parameters

`zipFile` - The ZIP file.

`destDir` - The destination directory.

### Exceptions

`IOException` - if unzip unsuccessfully

**Return**
the unzipped files

