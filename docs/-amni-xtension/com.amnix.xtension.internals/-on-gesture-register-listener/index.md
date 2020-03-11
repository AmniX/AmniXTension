[AmniXtension](../../index.md) / [com.amnix.xtension.internals](../index.md) / [OnGestureRegisterListener](./index.md)

# OnGestureRegisterListener

`abstract class OnGestureRegisterListener : `[`OnTouchListener`](https://developer.android.com/reference/android/view/View/OnTouchListener.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OnGestureRegisterListener(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`)` |

### Functions

| Name | Summary |
|---|---|
| [onClick](on-click.md) | `abstract fun onClick(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?, point: `[`PointF`](https://developer.android.com/reference/android/graphics/PointF.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onLongClick](on-long-click.md) | `abstract fun onLongClick(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?, point: `[`PointF`](https://developer.android.com/reference/android/graphics/PointF.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onSwipeBottom](on-swipe-bottom.md) | `abstract fun onSwipeBottom(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSwipeLeft](on-swipe-left.md) | `abstract fun onSwipeLeft(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSwipeRight](on-swipe-right.md) | `abstract fun onSwipeRight(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSwipeTop](on-swipe-top.md) | `abstract fun onSwipeTop(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onTouch](on-touch.md) | `open fun onTouch(view: `[`View`](https://developer.android.com/reference/android/view/View.html)`, event: `[`MotionEvent`](https://developer.android.com/reference/android/view/MotionEvent.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
