[AmniXtension](../../index.md) / [com.amnix.xtension.extensions](../index.md) / [android.graphics.Bitmap](index.md) / [saveAsync](./save-async.md)

# saveAsync

`fun Bitmap.saveAsync(to: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, format: CompressFormat = Bitmap.CompressFormat.JPEG, quality: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 100, recycle: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, onComplete: (isSaved: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = null): AsyncTask<`[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

Save Bitmap to the provided Path Asynchronously and private a callback when its done.

Make Sure you have the permission to write the file to.

