[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ZipUtils](index.md) / [getComments](./get-comments.md)

# getComments

`static fun getComments(zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>!`

Return the files' comment in ZIP file.

### Parameters

`zipFilePath` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!: The path of ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!&gt;!: the files' comment in ZIP file

`static fun getComments(zipFile: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`!): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!>!`

Return the files' comment in ZIP file.

### Parameters

`zipFile` - [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)!: The ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)!&gt;!: the files' comment in ZIP file

