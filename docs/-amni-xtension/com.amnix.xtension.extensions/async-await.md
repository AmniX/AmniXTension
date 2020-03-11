[AmniXtension](../index.md) / [com.amnix.xtension.extensions](index.md) / [asyncAwait](./async-await.md)

# asyncAwait

`fun <T> asyncAwait(asyncRunnable: () -> T?, awaitRunnable: (result: T?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`AsyncTask`](https://developer.android.com/reference/android/os/AsyncTask.html)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, T>`
`fun <T, P> asyncAwait(param: P, asyncRunnable: P.() -> T?, awaitRunnable: (result: T?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`AsyncTask`](https://developer.android.com/reference/android/os/AsyncTask.html)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, T>`

Want to run some code on another thread?

run it with the ease of asyncAwait [asyncRunnable](async-await.md#com.amnix.xtension.extensions$asyncAwait(kotlin.Function0((com.amnix.xtension.extensions.asyncAwait.T)), kotlin.Function1((com.amnix.xtension.extensions.asyncAwait.T, kotlin.Unit)))/asyncRunnable) and leave it to be executed on a Worker Thread. [awaitRunnable](async-await.md#com.amnix.xtension.extensions$asyncAwait(kotlin.Function0((com.amnix.xtension.extensions.asyncAwait.T)), kotlin.Function1((com.amnix.xtension.extensions.asyncAwait.T, kotlin.Unit)))/awaitRunnable) wil be invoked after the asyncRunnable with the result returned from [asyncRunnable](async-await.md#com.amnix.xtension.extensions$asyncAwait(kotlin.Function0((com.amnix.xtension.extensions.asyncAwait.T)), kotlin.Function1((com.amnix.xtension.extensions.asyncAwait.T, kotlin.Unit)))/asyncRunnable)
Make sure you don't do some context related stuff in [asyncRunnable](async-await.md#com.amnix.xtension.extensions$asyncAwait(kotlin.Function0((com.amnix.xtension.extensions.asyncAwait.T)), kotlin.Function1((com.amnix.xtension.extensions.asyncAwait.T, kotlin.Unit)))/asyncRunnable), It may cause an memory leak

