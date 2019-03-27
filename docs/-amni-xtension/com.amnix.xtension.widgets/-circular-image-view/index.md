[AmniXtension](../../index.md) / [com.amnix.xtension.widgets](../index.md) / [CircularImageView](./index.md)

# CircularImageView

`class CircularImageView : AppCompatImageView` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/widgets/CircularImageView.kt#L32)

Circle Image View.

### Types

| Name | Summary |
|---|---|
| [ShadowGravity](-shadow-gravity/index.md) | `enum class ShadowGravity`<br>The Gravity Enums |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CircularImageView(context: Context, attrs: AttributeSet? = null, defStyleAttr: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0)`<br>Circle Image View. |

### Functions

| Name | Summary |
|---|---|
| [addShadow](add-shadow.md) | `fun addShadow(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>add Shadow |
| [getScaleType](get-scale-type.md) | `fun getScaleType(): ScaleType`<br>get Scale Type |
| [onDraw](on-draw.md) | `fun onDraw(canvas: Canvas): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>the OnDraw Method |
| [onMeasure](on-measure.md) | `fun onMeasure(widthMeasureSpec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, heightMeasureSpec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>on Measure Region |
| [onSizeChanged](on-size-changed.md) | `fun onSizeChanged(w: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, h: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, oldw: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, oldh: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>on Size Change of Image |
| [setBackgroundColor](set-background-color.md) | `fun setBackgroundColor(backgroundColor: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set BackGround Color With Circle Region |
| [setBorderColor](set-border-color.md) | `fun setBorderColor(borderColor: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set Border Color |
| [setBorderWidth](set-border-width.md) | `fun setBorderWidth(borderWidth: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>region Set Attr Method |
| [setColorFilter](set-color-filter.md) | `fun setColorFilter(colorFilter: ColorFilter): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set Color Filter |
| [setScaleType](set-scale-type.md) | `fun setScaleType(scaleType: ScaleType): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set Scale Type |
| [setShadowColor](set-shadow-color.md) | `fun setShadowColor(shadowColor: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set Shadow Color |
| [setShadowGravity](set-shadow-gravity.md) | `fun setShadowGravity(shadowGravity: `[`ShadowGravity`](-shadow-gravity/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set Shadow Gravity |
| [setShadowRadius](set-shadow-radius.md) | `fun setShadowRadius(shadowRadius: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set Shadow Radius |

### Extension Functions

| Name | Summary |
|---|---|
| [castAs](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castAs(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`?`<br>helper Function to Cast things |
| [castTo](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castTo(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`?`<br>helper Function to Cast things |
| [fadeIn](../../com.amnix.xtension.extensions/android.view.-view/fade-in.md) | `fun View.fadeIn(duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 400): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Start The FadeIn Animation on This View |
| [fadeOut](../../com.amnix.xtension.extensions/android.view.-view/fade-out.md) | `fun View.fadeOut(duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 400): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Start the FadeOut Animation on This View |
| [getActivity](../../com.amnix.xtension.extensions/android.view.-view/get-activity.md) | `fun View.getActivity(): Activity?`<br>get Activity On Which View is inflated to |
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
