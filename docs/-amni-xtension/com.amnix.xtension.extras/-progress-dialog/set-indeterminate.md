[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ProgressDialog](index.md) / [setIndeterminate](./set-indeterminate.md)

# setIndeterminate

`open fun setIndeterminate(indeterminate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Change the indeterminate mode for this ProgressDialog. In indeterminate mode, the progress is ignored and the dialog shows an infinite animation instead.

**Note:** A ProgressDialog with style ``[`#STYLE_SPINNER`](-s-t-y-l-e_-s-p-i-n-n-e-r.md) is always indeterminate and will ignore this setting.

### Parameters

`indeterminate` - [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): true to enable indeterminate mode, false otherwise

**See Also**
[#setProgressStyle(int)](set-progress-style.md)

