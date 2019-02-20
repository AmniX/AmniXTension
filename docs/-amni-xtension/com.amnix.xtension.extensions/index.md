[AmniXtension](../index.md) / [com.amnix.xtension.extensions](./index.md)

## Package com.amnix.xtension.extensions

### Extensions for External Classes

| Name | Summary |
|---|---|
| [android.app.Activity](android.app.-activity/index.md) |  |
| [android.content.Context](android.content.-context/index.md) |  |
| [android.content.SharedPreferences](android.content.-shared-preferences/index.md) |  |
| [android.graphics.Bitmap](android.graphics.-bitmap/index.md) |  |
| [android.view.SurfaceView](android.view.-surface-view/index.md) |  |
| [android.view.TextureView](android.view.-texture-view/index.md) |  |
| [android.view.View](android.view.-view/index.md) |  |
| [android.view.ViewGroup](android.view.-view-group/index.md) |  |
| [android.widget.EditText](android.widget.-edit-text/index.md) |  |
| [androidx.viewpager.widget.ViewPager](androidx.viewpager.widget.-view-pager/index.md) |  |
| [java.io.File](java.io.-file/index.md) |  |
| [kotlin.Boolean](kotlin.-boolean/index.md) |  |
| [kotlin.Number](kotlin.-number/index.md) |  |
| [kotlin.String](kotlin.-string/index.md) |  |

### Properties

| Name | Summary |
|---|---|
| [currentTimeMillis](current-time-millis.md) | `val currentTimeMillis: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>get CurrentTimeInMillis from System.currentTimeMillis |

### Functions

| Name | Summary |
|---|---|
| [async](async.md) | `fun async(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): AsyncTask<`[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`>`<br>Want to run some code on another thread? |
| [asyncAwait](async-await.md) | `fun <T> asyncAwait(asyncRunnable: () -> `[`T`](async-await.md#T)`?, awaitRunnable: (result: `[`T`](async-await.md#T)`?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): AsyncTask<`[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`Void`](http://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`, `[`T`](async-await.md#T)`>`<br>Want to run some code on another thread? |
| [closeSafely](close-safely.md) | `fun closeSafely(vararg closeables: `[`Closeable`](http://docs.oracle.com/javase/6/docs/api/java/io/Closeable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Close All the CLosable safely. |
| [currentDate](current-date.md) | `fun currentDate(): `[`Date`](http://docs.oracle.com/javase/6/docs/api/java/util/Date.html)<br>get Current Date. |
| [getFromMemory](get-from-memory.md) | `fun getFromMemory(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?`<br>get Saved Data from memory, null if it os not exists |
| [guardRun](guard-run.md) | `fun guardRun(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>guardRun will run your code and returns True if it executed Properly else false. |
| [isDeviceRooted](is-device-rooted.md) | `fun isDeviceRooted(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if Device is Rooted. |
| [isNotNull](is-not-null.md) | `fun <T> `[`T`](is-not-null.md#T)`?.isNotNull(runnable: (it: `[`T`](is-not-null.md#T)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`?`<br>invokes [runnable](is-not-null.md#com.amnix.xtension.extensions$isNotNull(com.amnix.xtension.extensions.isNotNull.T, kotlin.Function1((com.amnix.xtension.extensions.isNotNull.T, kotlin.Unit)))/runnable) if value is Not Null. Quite handy. |
| [loop](loop.md) | `fun loop(till: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, loop: (i: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Loop with a single Int, It will call the [loop](loop.md#com.amnix.xtension.extensions$loop(kotlin.Int, kotlin.Function1((kotlin.Int, kotlin.Unit)))/loop) till the value of [till](loop.md#com.amnix.xtension.extensions$loop(kotlin.Int, kotlin.Function1((kotlin.Int, kotlin.Unit)))/till) |
| [loopWhile](loop-while.md) | `fun loopWhile(boolean: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, loop: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>While Loop Wrapped with Kotlin Global Extension |
| [putInMemory](put-in-memory.md) | `fun putInMemory(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, any: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`InMemoryCache`](../com.amnix.xtension.extras/-in-memory-cache/index.md)<br>put Something In Memory to use it later |
| [tryAndCatch](try-and-catch.md) | `fun tryAndCatch(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, onCatch: (e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = null, onFinally: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`?`<br>Try Catch within a single line |
| [tryOrIgnore](try-or-ignore.md) | `fun tryOrIgnore(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>try the code in [runnable](try-or-ignore.md#com.amnix.xtension.extensions$tryOrIgnore(kotlin.Function0((kotlin.Unit)))/runnable), If it runs then its perfect if its not, It won't crash your app. |
