[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ProgressDialog](./index.md)

# ProgressDialog

`class ProgressDialog : AlertDialog`

ProgressDialog Replacement of Android ProgressDialog

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ProgressDialog(context: Context)`<br>`ProgressDialog(context: Context, theme: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Creates a Progress dialog. |

### Properties

| Name | Summary |
|---|---|
| [isIndeterminate](is-indeterminate.md) | `var isIndeterminate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this ProgressDialog is in indeterminate mode. Change the indeterminate mode for this ProgressDialog. In indeterminate mode, the progress is ignored and the dialog shows an infinite animation instead. |
| [max](max.md) | `var max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Max Progress |
| [progress](progress.md) | `var progress: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Current Progress |
| [secondaryProgress](secondary-progress.md) | `var secondaryProgress: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Secondary Progress |

### Functions

| Name | Summary |
|---|---|
| [incrementProgressBy](increment-progress-by.md) | `fun incrementProgressBy(diff: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Increments the current progress value. |
| [incrementSecondaryProgressBy](increment-secondary-progress-by.md) | `fun incrementSecondaryProgressBy(diff: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Increments the current secondary progress value. |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: Bundle?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>OnCreate Method |
| [onStart](on-start.md) | `fun onStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>onStart Method |
| [onStop](on-stop.md) | `fun onStop(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>onStop Method |
| [setIndeterminateDrawable](set-indeterminate-drawable.md) | `fun setIndeterminateDrawable(d: Drawable): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the drawable to be used to display the indeterminate progress value. |
| [setMessage](set-message.md) | `fun setMessage(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set Text Message |
| [setProgressDrawable](set-progress-drawable.md) | `fun setProgressDrawable(d: Drawable): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the drawable to be used to display the progress value. |
| [setProgressNumberFormat](set-progress-number-format.md) | `fun setProgressNumberFormat(format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Change the format of the small text showing current and maximum units of progress.  The default is "%1d/%2d". Should not be called during the number is progressing. |
| [setProgressPercentFormat](set-progress-percent-format.md) | `fun setProgressPercentFormat(format: `[`NumberFormat`](http://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Change the format of the small text showing the percentage of progress. The default is [NumberFormat.getPercentageInstnace().](http://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html#getPercentInstance()) Should not be called during the number is progressing. |
| [setProgressStyle](set-progress-style.md) | `fun setProgressStyle(style: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the style of this ProgressDialog, either [com.amnix.xtension.extras.ProgressDialog.STYLE_SPINNER](-s-t-y-l-e_-s-p-i-n-n-e-r.md) or [com.amnix.xtension.extras.ProgressDialog.STYLE_HORIZONTAL](-s-t-y-l-e_-h-o-r-i-z-o-n-t-a-l.md). The default is [com.amnix.xtension.extras.ProgressDialog.STYLE_SPINNER](-s-t-y-l-e_-s-p-i-n-n-e-r.md). |

### Companion Object Properties

| Name | Summary |
|---|---|
| [STYLE_HORIZONTAL](-s-t-y-l-e_-h-o-r-i-z-o-n-t-a-l.md) | `val STYLE_HORIZONTAL: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Creates a ProgressDialog with a horizontal progress bar. |
| [STYLE_SPINNER](-s-t-y-l-e_-s-p-i-n-n-e-r.md) | `val STYLE_SPINNER: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Creates a ProgressDialog with a circular, spinning progress bar. This is the default. |

### Companion Object Functions

| Name | Summary |
|---|---|
| [show](show.md) | `fun show(context: Context, title: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`?, message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, indeterminate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, cancelable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, cancelListener: OnCancelListener? = null): `[`ProgressDialog`](./index.md)<br>Creates and shows a ProgressDialog. |

### Extension Functions

| Name | Summary |
|---|---|
| [castAs](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castAs(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`?`<br>helper Function to Cast things |
| [castTo](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castTo(clazz: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<`[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`>): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-to.md#T)`?`<br>helper Function to Cast things |
