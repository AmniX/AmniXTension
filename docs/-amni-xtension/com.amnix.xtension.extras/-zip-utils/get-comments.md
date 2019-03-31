[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ZipUtils](index.md) / [getComments](./get-comments.md)

# getComments

`static fun getComments(zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extras/ZipUtils.java#L398)

Return the files' comment in ZIP file.

### Parameters

`zipFilePath` - The path of ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
the files' comment in ZIP file

`static fun getComments(zipFile: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extras/ZipUtils.java#L410)

Return the files' comment in ZIP file.

### Parameters

`zipFile` - The ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
the files' comment in ZIP file

