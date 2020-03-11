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
| [android.widget.SeekBar](android.widget.-seek-bar/index.md) |  |
| [androidx.fragment.app.FragmentActivity](androidx.fragment.app.-fragment-activity/index.md) |  |
| [androidx.viewpager.widget.ViewPager](androidx.viewpager.widget.-view-pager/index.md) |  |
| [java.io.File](java.io.-file/index.md) |  |
| [kotlin.Any](kotlin.-any/index.md) |  |
| [kotlin.Boolean](kotlin.-boolean/index.md) |  |
| [kotlin.Number](kotlin.-number/index.md) |  |
| [kotlin.String](kotlin.-string/index.md) |  |

### Properties

| Name | Summary |
|---|---|
| [currentTimeMillis](current-time-millis.md) | get CurrentTimeInMillis from System.currentTimeMillis`val currentTimeMillis: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

### Functions

| Name | Summary |
|---|---|
| [async](async.md) | Want to run some code on another thread?`fun async(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`AsyncTask`](https://developer.android.com/reference/android/os/AsyncTask.html)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!>`<br>`fun <T> async(param: T, runnable: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`AsyncTask`](https://developer.android.com/reference/android/os/AsyncTask.html)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!>` |
| [asyncAwait](async-await.md) | Want to run some code on another thread?`fun <T> asyncAwait(asyncRunnable: () -> T?, awaitRunnable: (result: T?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`AsyncTask`](https://developer.android.com/reference/android/os/AsyncTask.html)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, T>`<br>`fun <T, P> asyncAwait(param: P, asyncRunnable: P.() -> T?, awaitRunnable: (result: T?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`AsyncTask`](https://developer.android.com/reference/android/os/AsyncTask.html)`<`[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, `[`Void`](https://docs.oracle.com/javase/6/docs/api/java/lang/Void.html)`!, T>` |
| [closeSafely](close-safely.md) | Close All the CLosable safely.`fun closeSafely(vararg closeables: `[`Closeable`](https://docs.oracle.com/javase/6/docs/api/java/io/Closeable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [currentDate](current-date.md) | get Current Date.`fun currentDate(): `[`Date`](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html) |
| [getFromMemory](get-from-memory.md) | get Saved Data from memory, null if it os not exists`fun getFromMemory(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?` |
| [guardRun](guard-run.md) | guardRun will run your code and returns True if it executed Properly else false.`fun guardRun(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [ifIs](if-is.md) | ifIs provides a block to match the value with Given Value and execute the block`fun <T> T.ifIs(valueToCompare: T?, block: T.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [ifIsNot](if-is-not.md) | ifIs provides a block to match the value with Given Value and execute the block`fun <T> T.ifIsNot(valueToCompare: T?, block: (T) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [isDeviceRooted](is-device-rooted.md) | Check if Device is Rooted.`fun isDeviceRooted(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isNotNull](is-not-null.md) | invokes [runnable](is-not-null.md#com.amnix.xtension.extensions$isNotNull(com.amnix.xtension.extensions.isNotNull.T, kotlin.Function1((com.amnix.xtension.extensions.isNotNull.T, kotlin.Unit)))/runnable) if value is Not Null. Quite handy.`fun <T> T?.isNotNull(runnable: (it: T) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`?` |
| [loop](loop.md) | Loop with a single Int, It will call the [loop](loop.md#com.amnix.xtension.extensions$loop(kotlin.Int, kotlin.Function1((kotlin.Int, kotlin.Unit)))/loop) till the value of [till](loop.md#com.amnix.xtension.extensions$loop(kotlin.Int, kotlin.Function1((kotlin.Int, kotlin.Unit)))/till)`fun loop(till: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, loop: (i: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [loopWhile](loop-while.md) | While Loop Wrapped with Kotlin Global Extension`fun loopWhile(boolean: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, loop: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [putInMemory](put-in-memory.md) | put Something In Memory to use it later`fun putInMemory(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, any: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`InMemoryCache`](../com.amnix.xtension.extras/-in-memory-cache/index.md) |
| [runOnUIThread](run-on-u-i-thread.md) | Run the UI Code on UI Thread From AnyWhere, No need the Activity Reference`fun runOnUIThread(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [runWithDelay](run-with-delay.md) | Runs the Block With a Delay.`fun runWithDelay(delay: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, block: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [tryAndCatch](try-and-catch.md) | Try Catch within a single line`fun tryAndCatch(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, onCatch: ((e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null, onFinally: (() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`?` |
| [tryOrIgnore](try-or-ignore.md) | try the code in [runnable](try-or-ignore.md#com.amnix.xtension.extensions$tryOrIgnore(kotlin.Function0((kotlin.Unit)))/runnable), If it runs then its perfect if its not, It won't crash your app.`fun tryOrIgnore(runnable: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
