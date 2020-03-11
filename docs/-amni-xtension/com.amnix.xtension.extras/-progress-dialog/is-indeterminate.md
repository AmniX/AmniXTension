[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ProgressDialog](index.md) / [isIndeterminate](./is-indeterminate.md)

# isIndeterminate

`var isIndeterminate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Change the indeterminate mode for this ProgressDialog. In indeterminate
mode, the progress is ignored and the dialog shows an infinite
animation instead.

**Note:** A ProgressDialog with style [.STYLE_SPINNER](#)
is always indeterminate and will ignore this setting.

### Parameters

`indeterminate` - true to enable indeterminate mode, false otherwise