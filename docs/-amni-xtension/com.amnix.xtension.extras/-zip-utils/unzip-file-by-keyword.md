[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ZipUtils](index.md) / [unzipFileByKeyword](./unzip-file-by-keyword.md)

# unzipFileByKeyword

`static fun unzipFileByKeyword(zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, destDirPath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, keyword: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!>!`

Unzip the file by keyword.

### Parameters

`zipFilePath` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The path of ZIP file.

`destDirPath` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The path of destination directory.

`keyword` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The keyboard.

### Exceptions

`IOException` - if unzip unsuccessfully

**Return**
[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!&gt;!: the unzipped files

`static fun unzipFileByKeyword(zipFile: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!, destDir: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!, keyword: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!>!`

Unzip the file by keyword.

### Parameters

`zipFile` - [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!: The ZIP file.

`destDir` - [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!: The destination directory.

`keyword` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The keyboard.

### Exceptions

`IOException` - if unzip unsuccessfully

**Return**
[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!&gt;!: the unzipped files

