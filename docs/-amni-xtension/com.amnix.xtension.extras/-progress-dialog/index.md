[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ProgressDialog](./index.md)

# ProgressDialog

`class ProgressDialog : AlertDialog`

A dialog showing a progress indicator and an optional text message or view.
Only a text message or a view can be used at the same time.

The dialog can be made cancelable on back key press.

The progress range is 0 to [max](#).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Creates a Progress dialog.`ProgressDialog(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`?)`<br>`ProgressDialog(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`?, theme: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [isIndeterminate](is-indeterminate.md) | Change the indeterminate mode for this ProgressDialog. In indeterminate mode, the progress is ignored and the dialog shows an infinite animation instead.`var isIndeterminate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [max](max.md) | Sets the maximum allowed progress value.`var max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [progress](progress.md) | Sets the current progress.`var progress: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [secondaryProgress](secondary-progress.md) | Sets the secondary progress.`var secondaryProgress: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Functions

| Name | Summary |
|---|---|
| [incrementProgressBy](increment-progress-by.md) | Increments the current progress value.`fun incrementProgressBy(diff: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [incrementSecondaryProgressBy](increment-secondary-progress-by.md) | Increments the current secondary progress value.`fun incrementSecondaryProgressBy(diff: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onStart](on-start.md) | `fun onStart(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onStop](on-stop.md) | `fun onStop(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setIndeterminateDrawable](set-indeterminate-drawable.md) | Sets the drawable to be used to display the indeterminate progress value.`fun setIndeterminateDrawable(d: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setMessage](set-message.md) | `fun setMessage(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setProgressDrawable](set-progress-drawable.md) | Sets the drawable to be used to display the progress value.`fun setProgressDrawable(d: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setProgressNumberFormat](set-progress-number-format.md) | Change the format of the small text showing current and maximum units of progress.  The default is "%1d/%2d". Should not be called during the number is progressing.`fun setProgressNumberFormat(format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setProgressPercentFormat](set-progress-percent-format.md) | Change the format of the small text showing the percentage of progress. The default is [NumberFormat.getPercentageInstnace().](https://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html#getPercentInstance()) Should not be called during the number is progressing.`fun setProgressPercentFormat(format: `[`NumberFormat`](https://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setProgressStyle](set-progress-style.md) | Sets the style of this ProgressDialog, either [.STYLE_SPINNER](#) or [.STYLE_HORIZONTAL](#). The default is [.STYLE_SPINNER](#).`fun setProgressStyle(style: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Properties

| Name | Summary |
|---|---|
| [STYLE_HORIZONTAL](-s-t-y-l-e_-h-o-r-i-z-o-n-t-a-l.md) | Creates a ProgressDialog with a horizontal progress bar.`const val STYLE_HORIZONTAL: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [STYLE_SPINNER](-s-t-y-l-e_-s-p-i-n-n-e-r.md) | Creates a ProgressDialog with a circular, spinning progress bar. This is the default.`const val STYLE_SPINNER: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [show](show.md) | Creates and shows a ProgressDialog.`fun show(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`?, title: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`?, message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, indeterminate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, cancelable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, cancelListener: `[`OnCancelListener`](https://developer.android.com/reference/android/content/DialogInterface/OnCancelListener.html)`? = null): `[`ProgressDialog`](./index.md) |
