[AmniXtension](../../index.md) / [com.amnix.xtension.widgets](../index.md) / [TouchImageView](index.md) / [setZoom](./set-zoom.md)

# setZoom

`open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Set zoom to the specified scale. Image will be centered by default.

### Parameters

`scale` - `open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusX: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Set zoom to the specified scale. Image will be centered around the point (focusX, focusY). These floats range from 0 to 1 and denote the focus point as a fraction from the left and top of the view. For example, the top left corner of the image would be (0, 0). And the bottom right corner would be (1, 1).

### Parameters

`scale` -

`focusX` -

`focusY` - `open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusX: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, scaleType: ScaleType): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Set zoom to the specified scale. Image will be centered around the point (focusX, focusY). These floats range from 0 to 1 and denote the focus point as a fraction from the left and top of the view. For example, the top left corner of the image would be (0, 0). And the bottom right corner would be (1, 1).

### Parameters

`scale` -

`focusX` -

`focusY` -

`scaleType` - `open fun setZoom(img: `[`TouchImageView`](index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Set zoom parameters equal to another TouchImageView. Including scale, position, and ScaleType.

### Parameters

`img` - 