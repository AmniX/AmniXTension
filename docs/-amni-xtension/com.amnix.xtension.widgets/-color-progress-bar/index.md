[AmniXtension](../../index.md) / [com.amnix.xtension.widgets](../index.md) / [ColorProgressBar](./index.md)

# ColorProgressBar

`class ColorProgressBar : ProgressBar`

Class to Render ProgressBar with some Specific Color with the ease

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ColorProgressBar(context: Context)`<br>Context Constructor`ColorProgressBar(context: Context, attrs: AttributeSet)`<br>Context,AttributeSet Constructor`ColorProgressBar(context: Context, attrs: AttributeSet, defStyleAttr: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Context,AttributeSet,Int Constructor |

### Functions

| Name | Summary |
|---|---|
| [setColor](set-color.md) | `fun setColor(color: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ColorProgressBar`](./index.md)<br>Set Color Dynamically |

### Extension Functions

| Name | Summary |
|---|---|
| [castAs](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castAs(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`?`<br>helper Function to Cast things |
| [castTo](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castTo(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`?`<br>helper Function to Cast things |
| [disableIf](../../com.amnix.xtension.extensions/android.view.-view/disable-if.md) | `fun View.disableIf(boolean: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>will disable the view If Condition is true else enables It |
| [enableIf](../../com.amnix.xtension.extensions/android.view.-view/enable-if.md) | `fun View.enableIf(boolean: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>will enable the view If Condition is true else enables It |
| [fadeIn](../../com.amnix.xtension.extensions/android.view.-view/fade-in.md) | `fun View.fadeIn(duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 400): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Start The FadeIn Animation on This View |
| [fadeOut](../../com.amnix.xtension.extensions/android.view.-view/fade-out.md) | `fun View.fadeOut(duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 400): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Start the FadeOut Animation on This View |
| [getActivity](../../com.amnix.xtension.extensions/android.view.-view/get-activity.md) | `fun View.getActivity(): Activity?`<br>get Activity On Which View is inflated to |
| [hideIf](../../com.amnix.xtension.extensions/android.view.-view/hide-if.md) | `fun View.hideIf(boolean: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, makeInvisible: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>will hide the view If Condition is true else make if INVISIBLE or GONE Based on the [makeInvisible](../../com.amnix.xtension.extensions/android.view.-view/hide-if.md#com.amnix.xtension.extensions$hideIf(android.view.View, kotlin.Boolean, kotlin.Boolean)/makeInvisible) flag |
| [hideKeyboard](../../com.amnix.xtension.extensions/android.view.-view/hide-keyboard.md) | `fun View.hideKeyboard(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>hide Keyboard |
| [isGone](../../com.amnix.xtension.extensions/android.view.-view/is-gone.md) | `fun View.isGone(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if View Visiblity == GONE |
| [isInvisible](../../com.amnix.xtension.extensions/android.view.-view/is-invisible.md) | `fun View.isInvisible(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if View is Invisible to User |
| [isVisible](../../com.amnix.xtension.extensions/android.view.-view/is-visible.md) | `fun View.isVisible(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>check if View is Visible to User Or Not |
| [resize](../../com.amnix.xtension.extensions/android.view.-view/resize.md) | `fun View.resize(width: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, height: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>resize the View Width Height |
| [screenshot](../../com.amnix.xtension.extensions/android.view.-view/screenshot.md) | `fun View.screenshot(): Bitmap`<br>Create a Screnshot of the view and returns it as a Bitmap |
| [setHeight](../../com.amnix.xtension.extensions/android.view.-view/set-height.md) | `fun View.setHeight(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set height |
| [setOnSingleClickListener](../../com.amnix.xtension.extensions/android.view.-view/set-on-single-click-listener.md) | `fun View.setOnSingleClickListener(tolerance: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 500, onClick: (v: View) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set On Single Click Listener, It will allow user to click on the button after the specified tolerance. So no multiClick Or FastClick From Now |
| [setPaddingBottom](../../com.amnix.xtension.extensions/android.view.-view/set-padding-bottom.md) | `fun View.setPaddingBottom(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Bottom |
| [setPaddingEnd](../../com.amnix.xtension.extensions/android.view.-view/set-padding-end.md) | `fun View.setPaddingEnd(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From End |
| [setPaddingHorizontal](../../com.amnix.xtension.extensions/android.view.-view/set-padding-horizontal.md) | `fun View.setPaddingHorizontal(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding On Horizontal Edges |
| [setPaddingLeft](../../com.amnix.xtension.extensions/android.view.-view/set-padding-left.md) | `fun View.setPaddingLeft(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Left |
| [setPaddingRight](../../com.amnix.xtension.extensions/android.view.-view/set-padding-right.md) | `fun View.setPaddingRight(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Right |
| [setPaddingStart](../../com.amnix.xtension.extensions/android.view.-view/set-padding-start.md) | `fun View.setPaddingStart(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Start |
| [setPaddingTop](../../com.amnix.xtension.extensions/android.view.-view/set-padding-top.md) | `fun View.setPaddingTop(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Top |
| [setPaddingVertical](../../com.amnix.xtension.extensions/android.view.-view/set-padding-vertical.md) | `fun View.setPaddingVertical(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Vertical Edges |
| [setWidth](../../com.amnix.xtension.extensions/android.view.-view/set-width.md) | `fun View.setWidth(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set Width |
| [showIf](../../com.amnix.xtension.extensions/android.view.-view/show-if.md) | `fun View.showIf(boolean: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, makeInvisible: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>will show the view If Condition is true else make if INVISIBLE or GONE Based on the [makeInvisible](../../com.amnix.xtension.extensions/android.view.-view/show-if.md#com.amnix.xtension.extensions$showIf(android.view.View, kotlin.Boolean, kotlin.Boolean)/makeInvisible) flag |
| [showKeyboard](../../com.amnix.xtension.extensions/android.view.-view/show-keyboard.md) | `fun View.showKeyboard(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>show KeyBoard |
