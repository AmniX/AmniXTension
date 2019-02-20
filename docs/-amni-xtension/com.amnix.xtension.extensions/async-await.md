[AmniXtension](../index.md) / [com.amnix.xtension.extensions](index.md) / [asyncAwait](./async-await.md)

# asyncAwait

`fun <T> asyncAwait(asyncRunnable: () -> `[`T`](async-await.md#T)`?, awaitRunnable: (result: `[`T`](async-await.md#T)`?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): AsyncTask<`[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`T`](async-await.md#T)`>`

Want to run some code on another thread?

run it with the ease of asyncAwait [asyncRunnable](async-await.md#com.amnix.xtension.extensions$asyncAwait(kotlin.Function0((com.amnix.xtension.extensions.asyncAwait.T)), kotlin.Function1((com.amnix.xtension.extensions.asyncAwait.T, kotlin.Unit)))/asyncRunnable) and leave it to be executed on a Worker Thread. [awaitRunnable](async-await.md#com.amnix.xtension.extensions$asyncAwait(kotlin.Function0((com.amnix.xtension.extensions.asyncAwait.T)), kotlin.Function1((com.amnix.xtension.extensions.asyncAwait.T, kotlin.Unit)))/awaitRunnable) wil be invoked after the asyncRunnable with the result returned from [asyncRunnable](async-await.md#com.amnix.xtension.extensions$asyncAwait(kotlin.Function0((com.amnix.xtension.extensions.asyncAwait.T)), kotlin.Function1((com.amnix.xtension.extensions.asyncAwait.T, kotlin.Unit)))/asyncRunnable)
Make sure you don't do some context related stuff in [asyncRunnable](async-await.md#com.amnix.xtension.extensions$asyncAwait(kotlin.Function0((com.amnix.xtension.extensions.asyncAwait.T)), kotlin.Function1((com.amnix.xtension.extensions.asyncAwait.T, kotlin.Unit)))/asyncRunnable), It may cause an memory leak

