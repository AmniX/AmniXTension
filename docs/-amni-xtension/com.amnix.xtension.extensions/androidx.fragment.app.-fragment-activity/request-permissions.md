[AmniXtension](../../index.md) / [com.amnix.xtension.extensions](../index.md) / [androidx.fragment.app.FragmentActivity](index.md) / [requestPermissions](./request-permissions.md)

# requestPermissions

`fun FragmentActivity.requestPermissions(permissions: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, onResult: (isGranted: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Request Permissions WithOut Waiting For Any OnPermissionResult Callback.

Get The Result in a Callback Easily.
No need to check if the Permission Grated Already Or Not, We Will do it for you. Just Place the code in [onResult](request-permissions.md#com.amnix.xtension.extensions$requestPermissions(androidx.fragment.app.FragmentActivity, kotlin.Array((kotlin.String)), kotlin.Function1((kotlin.Boolean, kotlin.Unit)))/onResult) Block, We will Execute it SomeHow.
Its Based on LifeCycleObserver So Supported FragmentActivity+

