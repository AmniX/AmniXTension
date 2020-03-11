[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ProgressDialog](index.md) / [show](./show.md)

# show

`@JvmOverloads fun show(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`?, title: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`?, message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, indeterminate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, cancelable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, cancelListener: `[`OnCancelListener`](https://developer.android.com/reference/android/content/DialogInterface/OnCancelListener.html)`? = null): `[`ProgressDialog`](index.md)

Creates and shows a ProgressDialog.

### Parameters

`context` - the parent context

`title` - the title text for the dialog's window

`message` - the text to be displayed in the dialog

`indeterminate` - true if the dialog should be [        indeterminate](#), false otherwise

`cancelable` - true if the dialog is [cancelable](#),
false otherwise

**Return**
the ProgressDialog

