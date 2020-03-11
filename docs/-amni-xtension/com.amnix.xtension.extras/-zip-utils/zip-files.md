[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ZipUtils](index.md) / [zipFiles](./zip-files.md)

# zipFiles

`static fun zipFiles(srcFiles: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>!, zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Zip the files.

### Parameters

`srcFiles` - [MutableCollection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!&gt;!: The source of files.

`zipFilePath` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The path of ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): `true`: success`false`: fail

`static fun zipFiles(srcFilePaths: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>!, zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, comment: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Zip the files.

### Parameters

`srcFilePaths` - [MutableCollection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!&gt;!: The paths of source files.

`zipFilePath` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The path of ZIP file.

`comment` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The comment.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): `true`: success`false`: fail

`static fun zipFiles(srcFiles: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!>!, zipFile: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Zip the files.

### Parameters

`srcFiles` - [MutableCollection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)&lt;[File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!&gt;!: The source of files.

`zipFile` - [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!: The ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): `true`: success`false`: fail

`static fun zipFiles(srcFiles: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!>!, zipFile: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!, comment: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Zip the files.

### Parameters

`srcFiles` - [MutableCollection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)&lt;[File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!&gt;!: The source of files.

`zipFile` - [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!: The ZIP file.

`comment` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The comment.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): `true`: success`false`: fail

