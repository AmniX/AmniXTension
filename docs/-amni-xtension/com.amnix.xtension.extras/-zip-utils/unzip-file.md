[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ZipUtils](index.md) / [unzipFile](./unzip-file.md)

# unzipFile

`static fun unzipFile(zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, destDirPath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!>!`

Unzip the file.

### Parameters

`zipFilePath` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The path of ZIP file.

`destDirPath` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The path of destination directory.

### Exceptions

`IOException` - if unzip unsuccessfully

**Return**
[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!&gt;!: the unzipped files

`static fun unzipFile(zipFile: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!, destDir: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!>!`

Unzip the file.

### Parameters

`zipFile` - [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!: The ZIP file.

`destDir` - [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!: The destination directory.

### Exceptions

`IOException` - if unzip unsuccessfully

**Return**
[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!&gt;!: the unzipped files

