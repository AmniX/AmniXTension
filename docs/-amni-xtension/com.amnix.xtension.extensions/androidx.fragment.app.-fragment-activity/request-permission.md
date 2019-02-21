[AmniXtension](../../index.md) / [com.amnix.xtension.extensions](../index.md) / [androidx.fragment.app.FragmentActivity](index.md) / [requestPermission](./request-permission.md)

# requestPermission

`fun FragmentActivity.requestPermission(permission: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, onResult: (isGranted: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extensions/ActivityExtensions.kt#L131)

Request Permission WithOut Waiting For Any OnPermissionResult Callback.

Get The Result in a Callback Easily.
No need to check if the Permission Grated Already Or Not, We Will do it for you. Just Place the code in [onResult](request-permission.md#com.amnix.xtension.extensions$requestPermission(androidx.fragment.app.FragmentActivity, kotlin.String, kotlin.Function1((kotlin.Boolean, kotlin.Unit)))/onResult) Block, We will Execute it SomeHow.
Its Based on LifeCycleObserver So Supported FragmentActivity+

