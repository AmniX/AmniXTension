[AmniXtension](../../index.md) / [com.amnix.xtension.widgets](../index.md) / [TouchImageView](./index.md)

# TouchImageView

`open class TouchImageView : AppCompatImageView` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/widgets/TouchImageView.java#L40)

### Types

| Name | Summary |
|---|---|
| [FixedPixel](-fixed-pixel/index.md) | `class FixedPixel` |
| [OnTouchImageViewListener](-on-touch-image-view-listener/index.md) | `interface OnTouchImageViewListener` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TouchImageView(context: Context)`<br>`TouchImageView(context: Context, attrs: AttributeSet)`<br>`TouchImageView(context: Context, attrs: AttributeSet, defStyle: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [AUTOMATIC_MIN_ZOOM](-a-u-t-o-m-a-t-i-c_-m-i-n_-z-o-o-m.md) | `static val AUTOMATIC_MIN_ZOOM: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>If setMinZoom(AUTOMATIC_MIN_ZOOM), then we'll set the min scale to include the whole image. |

### Functions

| Name | Summary |
|---|---|
| [canScrollHorizontally](can-scroll-horizontally.md) | `open fun canScrollHorizontally(direction: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [canScrollHorizontallyFroyo](can-scroll-horizontally-froyo.md) | `open fun canScrollHorizontallyFroyo(direction: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [canScrollVertically](can-scroll-vertically.md) | `open fun canScrollVertically(direction: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getCurrentZoom](get-current-zoom.md) | `open fun getCurrentZoom(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Get the current zoom. This is the zoom relative to the initial scale, not the original resource. |
| [getMaxZoom](get-max-zoom.md) | `open fun getMaxZoom(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Get the max zoom multiplier. |
| [getMinZoom](get-min-zoom.md) | `open fun getMinZoom(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Get the min zoom multiplier. |
| [getOrientationChangeFixedPixel](get-orientation-change-fixed-pixel.md) | `open fun getOrientationChangeFixedPixel(): `[`FixedPixel`](-fixed-pixel/index.md) |
| [getScaleType](get-scale-type.md) | `open fun getScaleType(): ScaleType` |
| [getScrollPosition](get-scroll-position.md) | `open fun getScrollPosition(): PointF`<br>Return the point at the center of the zoomed image. The PointF coordinates range in value between 0 and 1 and the focus point is denoted as a fraction from the left and top of the view. For example, the top left corner of the image would be (0, 0). And the bottom right corner would be (1, 1). |
| [getViewSizeChangeFixedPixel](get-view-size-change-fixed-pixel.md) | `open fun getViewSizeChangeFixedPixel(): `[`FixedPixel`](-fixed-pixel/index.md) |
| [getZoomedRect](get-zoomed-rect.md) | `open fun getZoomedRect(): RectF`<br>Return a Rect representing the zoomed image. |
| [isZoomEnabled](is-zoom-enabled.md) | `open fun isZoomEnabled(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isZoomed](is-zoomed.md) | `open fun isZoomed(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns false if image is in initial, unzoomed state. False, otherwise. |
| [onConfigurationChanged](on-configuration-changed.md) | `open fun onConfigurationChanged(newConfig: Configuration): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onRestoreInstanceState](on-restore-instance-state.md) | `open fun onRestoreInstanceState(state: Parcelable): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSaveInstanceState](on-save-instance-state.md) | `open fun onSaveInstanceState(): Parcelable` |
| [resetZoom](reset-zoom.md) | `open fun resetZoom(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Reset zoom and translation to initial state. |
| [savePreviousImageValues](save-previous-image-values.md) | `open fun savePreviousImageValues(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Save the current matrix and view dimensions in the prevMatrix and prevView variables. |
| [setImageBitmap](set-image-bitmap.md) | `open fun setImageBitmap(bm: Bitmap): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setImageDrawable](set-image-drawable.md) | `open fun setImageDrawable(drawable: Drawable): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setImageResource](set-image-resource.md) | `open fun setImageResource(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setImageURI](set-image-u-r-i.md) | `open fun setImageURI(uri: Uri): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setMaxZoom](set-max-zoom.md) | `open fun setMaxZoom(max: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set the max zoom multiplier to a constant. Default value: 3. |
| [setMaxZoomRatio](set-max-zoom-ratio.md) | `open fun setMaxZoomRatio(max: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set the max zoom multiplier as a multiple of minZoom, whatever minZoom may change to. By default, this is not done, and maxZoom has a fixed value of 3. |
| [setMinZoom](set-min-zoom.md) | `open fun setMinZoom(min: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set the min zoom multiplier. Default value: 1. |
| [setOnDoubleTapListener](set-on-double-tap-listener.md) | `open fun setOnDoubleTapListener(l: OnDoubleTapListener): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setOnTouchImageViewListener](set-on-touch-image-view-listener.md) | `open fun setOnTouchImageViewListener(l: `[`OnTouchImageViewListener`](-on-touch-image-view-listener/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setOnTouchListener](set-on-touch-listener.md) | `open fun setOnTouchListener(l: OnTouchListener): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setOrientationChangeFixedPixel](set-orientation-change-fixed-pixel.md) | `open fun setOrientationChangeFixedPixel(fixedPixel: `[`FixedPixel`](-fixed-pixel/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setScaleType](set-scale-type.md) | `open fun setScaleType(type: ScaleType): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setScrollPosition](set-scroll-position.md) | `open fun setScrollPosition(focusX: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set the focus point of the zoomed image. The focus points are denoted as a fraction from the left and top of the view. The focus points can range in value between 0 and 1. |
| [setViewSizeChangeFixedPixel](set-view-size-change-fixed-pixel.md) | `open fun setViewSizeChangeFixedPixel(viewSizeChangeFixedPixel: `[`FixedPixel`](-fixed-pixel/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setZoom](set-zoom.md) | `open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set zoom to the specified scale. Image will be centered by default.`open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusX: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusX: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, scaleType: ScaleType): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set zoom to the specified scale. Image will be centered around the point (focusX, focusY). These floats range from 0 to 1 and denote the focus point as a fraction from the left and top of the view. For example, the top left corner of the image would be (0, 0). And the bottom right corner would be (1, 1).`open fun setZoom(img: `[`TouchImageView`](./index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set zoom parameters equal to another TouchImageView. Including scale, position, and ScaleType. |
| [setZoomEnabled](set-zoom-enabled.md) | `open fun setZoomEnabled(zoomEnabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
