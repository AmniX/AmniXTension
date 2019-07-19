[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ProgressDialog](index.md) / [setProgressStyle](./set-progress-style.md)

# setProgressStyle

`fun setProgressStyle(style: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Sets the style of this ProgressDialog, either [com.amnix.xtension.extras.ProgressDialog.STYLE_SPINNER](-s-t-y-l-e_-s-p-i-n-n-e-r.md) or
[com.amnix.xtension.extras.ProgressDialog.STYLE_HORIZONTAL](-s-t-y-l-e_-h-o-r-i-z-o-n-t-a-l.md). The default is [com.amnix.xtension.extras.ProgressDialog.STYLE_SPINNER](-s-t-y-l-e_-s-p-i-n-n-e-r.md).

**Note:** A ProgressDialog with style [com.amnix.xtension.extras.ProgressDialog.STYLE_SPINNER](-s-t-y-l-e_-s-p-i-n-n-e-r.md)
is always indeterminate and will ignore the [ indeterminate](is-indeterminate.md) setting.

### Parameters

`style` - the style of this ProgressDialog, either [com.amnix.xtension.extras.ProgressDialog.STYLE_SPINNER](-s-t-y-l-e_-s-p-i-n-n-e-r.md) or
[com.amnix.xtension.extras.ProgressDialog.STYLE_HORIZONTAL](-s-t-y-l-e_-h-o-r-i-z-o-n-t-a-l.md)