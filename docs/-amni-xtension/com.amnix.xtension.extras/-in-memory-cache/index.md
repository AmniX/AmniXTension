[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [InMemoryCache](./index.md)

# InMemoryCache

`object InMemoryCache` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extras/InMemoryCache.kt#L6)

Class for an InMemory Cache to keep your variables globally in heap and get them wherever you want.

### Functions

| Name | Summary |
|---|---|
| [clear](clear.md) | `fun clear(): `[`Method`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Method.html)<br>Clear all the InMemoryCache |
| [contains](contains.md) | `fun contains(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>check if have the value on the Given Key |
| [get](get.md) | `fun get(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?`<br>get the saved value addressed by the key |
| [getAll](get-all.md) | `fun getAll(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`<br>get All The InMemoryCache |
| [getAllByType](get-all-by-type.md) | `fun getAllByType(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<*>): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`<br>get All the InMemoryCache of an Specific Type. |
| [have](have.md) | `fun have(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>check if have the value on the Given Key |
| [put](put.md) | `fun put(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`InMemoryCache`](./index.md)<br>put [key](put.md#com.amnix.xtension.extras.InMemoryCache$put(kotlin.String, kotlin.Any)/key) &amp; [value](put.md#com.amnix.xtension.extras.InMemoryCache$put(kotlin.String, kotlin.Any)/value) where |
