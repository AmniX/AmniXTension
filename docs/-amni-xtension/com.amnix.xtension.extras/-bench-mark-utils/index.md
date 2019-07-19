[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [BenchMarkUtils](./index.md)

# BenchMarkUtils

`class BenchMarkUtils`

This Class is Responsible to BenchMark Any Lines of Code and Its Execution Time in Logcat.

val benchMarkUtils = BenchMarkUtils()

.................................
.................................
.......... Your Code ............
.................................
.................................

benchMarkUtils.dump() //Prints the Execution time in Logcat

Above comments are the demonstration on how this class can be useful

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BenchMarkUtils()`<br>This Class is Responsible to BenchMark Any Lines of Code and Its Execution Time in Logcat. |

### Functions

| Name | Summary |
|---|---|
| [dump](dump.md) | `fun dump(logTag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, msg: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>`fun dump(msg: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>dumps the log into logcat |
| [reset](reset.md) | `fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>resets The startTime |

### Extension Functions

| Name | Summary |
|---|---|
| [castAs](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castAs(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`?`<br>helper Function to Cast things |
| [castTo](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castTo(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`?`<br>helper Function to Cast things |
