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
| [&lt;init&gt;](-init-.md) | This Class is Responsible to BenchMark Any Lines of Code and Its Execution Time in Logcat.`BenchMarkUtils()` |

### Functions

| Name | Summary |
|---|---|
| [dump](dump.md) | dumps the log into logcat`fun dump(logTag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, msg: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>`fun dump(msg: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [reset](reset.md) | resets The startTime`fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
