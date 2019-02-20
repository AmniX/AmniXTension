[amnixutils](../../index.md) / [com.amnix.utils.extras](../index.md) / [BenchMarkUtils](./index.md)

# BenchMarkUtils

`class BenchMarkUtils` [(source)](https://github.com/AmniX/amnixUtils/tree/master/amnixutils/src/main/java/com/amnix/utils/extras/BenchMarkUtils.kt#L21)

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
