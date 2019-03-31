[AmniXtension](../../index.md) / [com.amnix.xtension.logs](../index.md) / [L](./index.md)

# L

`object L` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/logs/L.kt#L44)

A Custom Log Class for the developer Ease.

Its Prints The Logs in Pretty Way So Developers Can Easily Differentiate between multiple Logs

┌──────────────────────────────────────────────────────────────────────────────────────────────────────────────────
│ Thread: , Source: &lt;your.package.name&gt;.. (:)
├──────────────────────────────────────────────────────────────────────────────────────────────────────────────────
│ A Message Which Were Logged with L.d("")
└──────────────────────────────────────────────────────────────────────────────────────────────────────────────────

Available Methods :

L.d()
L.e()
L.i()
L.v()
L.w()
L.json()

### Functions

| Name | Summary |
|---|---|
| [d](d.md) | `fun d(obj: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Similar of Log.d |
| [e](e.md) | `fun e(obj: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Similar of Log.e |
| [i](i.md) | `fun i(obj: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Similar of Log.i |
| [json](json.md) | `fun json(json: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Log the Json into the Logcat as a DEBUG Log |
| [v](v.md) | `fun v(obj: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Similar of Log.v |
| [w](w.md) | `fun w(obj: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Similar of Log.w |
| [wtf](wtf.md) | `fun wtf(throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`?, tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Similar of Log.wtf |

### Extension Functions

| Name | Summary |
|---|---|
| [castAs](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castAs(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`?`<br>helper Function to Cast things |
| [castTo](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castTo(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`?`<br>helper Function to Cast things |
