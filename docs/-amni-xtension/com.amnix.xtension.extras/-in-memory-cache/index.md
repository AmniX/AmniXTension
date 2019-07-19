[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [InMemoryCache](./index.md)

# InMemoryCache

`object InMemoryCache`

Class for an InMemory Cache to keep your variables globally in heap and get them wherever you want.

### Functions

| Name | Summary |
|---|---|
| [clear](clear.md) | `fun clear(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Clear all the InMemoryCache |
| [contains](contains.md) | `fun contains(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>check if have the value on the Given Key |
| [get](get.md) | `fun get(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?`<br>get the saved value addressed by the key |
| [getAll](get-all.md) | `fun getAll(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`<br>get All The InMemoryCache |
| [getAllByType](get-all-by-type.md) | `fun getAllByType(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<*>): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`<br>get All the InMemoryCache of an Specific Type. |
| [put](put.md) | `fun put(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`InMemoryCache`](./index.md)<br>put [key](put.md#com.amnix.xtension.extras.InMemoryCache$put(kotlin.String, kotlin.Any)/key) &amp; [value](put.md#com.amnix.xtension.extras.InMemoryCache$put(kotlin.String, kotlin.Any)/value) where |

### Extension Functions

| Name | Summary |
|---|---|
| [castAs](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castAs(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`?`<br>helper Function to Cast things |
| [castTo](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castTo(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`?`<br>helper Function to Cast things |
