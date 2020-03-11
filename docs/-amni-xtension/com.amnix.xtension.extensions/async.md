[AmniXtension](../index.md) / [com.amnix.xtension.extensions](index.md) / [async](./async.md)

# async

`fun async(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`AsyncTask`](https://developer.android.com/reference/android/os/AsyncTask.html)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!>`
`fun <T> async(param: T, runnable: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`AsyncTask`](https://developer.android.com/reference/android/os/AsyncTask.html)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!>`

Want to run some code on another thread?

run it with the ease of async and leave it to be executed on a Worker Thread.
Make sure you don't do some context related stuff in async, It may cause an memory leak

