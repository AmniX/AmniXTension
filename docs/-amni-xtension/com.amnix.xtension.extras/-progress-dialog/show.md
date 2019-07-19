[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ProgressDialog](index.md) / [show](./show.md)

# show

`@JvmOverloads fun show(context: Context, title: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`?, message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, indeterminate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, cancelable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, cancelListener: OnCancelListener? = null): `[`ProgressDialog`](index.md)

Creates and shows a ProgressDialog.

### Parameters

`context` - the parent context

`title` - the title text for the dialog's window

`message` - the text to be displayed in the dialog

`indeterminate` - true if the dialog should be [        indeterminate](#), false otherwise

`cancelable` - true if the dialog is [cancelable](#),
false otherwise

`cancelListener` - the [listener](#)
to be invoked when the dialog is canceled

**Return**
the ProgressDialog

