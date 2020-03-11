[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ZipUtils](index.md) / [getFilesPath](./get-files-path.md)

# getFilesPath

`static fun getFilesPath(zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>!`

Return the files' path in ZIP file.

### Parameters

`zipFilePath` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The path of ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!&gt;!: the files' path in ZIP file

`static fun getFilesPath(zipFile: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>!`

Return the files' path in ZIP file.

### Parameters

`zipFile` - [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!: The ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!&gt;!: the files' path in ZIP file

