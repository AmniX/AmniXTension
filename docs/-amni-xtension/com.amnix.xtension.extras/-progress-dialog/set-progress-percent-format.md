[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [ProgressDialog](index.md) / [setProgressPercentFormat](./set-progress-percent-format.md)

# setProgressPercentFormat

`fun setProgressPercentFormat(format: `[`NumberFormat`](https://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Change the format of the small text showing the percentage of progress.
The default is
[NumberFormat.getPercentageInstnace().](https://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html#getPercentInstance())
Should not be called during the number is progressing.

### Parameters

`format` - An instance of a [NumberFormat](https://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html) to generate the
percentage text.  If null, nothing will be shown.