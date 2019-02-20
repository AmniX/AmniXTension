[amnixutils](../../index.md) / [com.amnix.utils.extensions](../index.md) / [android.graphics.Bitmap](index.md) / [saveAsync](./save-async.md)

# saveAsync

`fun Bitmap.saveAsync(to: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, format: CompressFormat = Bitmap.CompressFormat.JPEG, quality: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 100, recycle: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): AsyncTask<`[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`>` [(source)](https://github.com/AmniX/amnixUtils/tree/master/amnixutils/src/main/java/com/amnix/utils/extensions/BitmapExtension.kt#L44)

Save Bitmap to the provided Path Asynchronously and private a callback when its done.

Make Sure you have the permission to write the file to.

