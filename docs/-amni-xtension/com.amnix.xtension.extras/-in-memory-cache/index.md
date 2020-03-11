[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [InMemoryCache](./index.md)

# InMemoryCache

`object InMemoryCache`

Class for an InMemory Cache to keep your variables globally in heap and get them wherever you want.

### Functions

| Name | Summary |
|---|---|
| [clear](clear.md) | Clear all the InMemoryCache`fun clear(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [contains](contains.md) | check if have the value on the Given Key`fun contains(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [get](get.md) | get the saved value addressed by the key`fun get(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?` |
| [getAll](get-all.md) | get All The InMemoryCache`fun getAll(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>` |
| [getAllByType](get-all-by-type.md) | get All the InMemoryCache of an Specific Type.`fun getAllByType(clazz: `[`Class`](https://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<*>): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>` |
| [put](put.md) | put [key](put.md#com.amnix.xtension.extras.InMemoryCache$put(kotlin.String, kotlin.Any)/key) &amp; [value](put.md#com.amnix.xtension.extras.InMemoryCache$put(kotlin.String, kotlin.Any)/value) where`fun put(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`InMemoryCache`](./index.md) |
