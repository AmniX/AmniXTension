[AmniXtension](../index.md) / [com.amnix.xtension.extensions](index.md) / [async](./async.md)

# async

`fun async(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): AsyncTask<`[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`>` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extensions/GlobalExtensions.kt#L14)

Want to run some code on another thread?

run it with the ease of async and leave it to be executed on a Worker Thread.
Make sure you don't do some context related stuff in async, It may cause an memory leak

