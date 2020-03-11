[AmniXtension](../../index.md) / [com.amnix.xtension.widgets](../index.md) / [TouchImageView](./index.md)

# TouchImageView

`open class TouchImageView : AppCompatImageView`

### Types

| Name | Summary |
|---|---|
| [FixedPixel](-fixed-pixel/index.md) | the enum behind the Fixed Pixel Functionality`class FixedPixel` |
| [OnTouchImageViewListener](-on-touch-image-view-listener/index.md) | `interface OnTouchImageViewListener` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TouchImageView(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`!)`<br>`TouchImageView(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`!, attrs: `[`AttributeSet`](https://developer.android.com/reference/android/util/AttributeSet.html)`!)`<br>`TouchImageView(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`!, attrs: `[`AttributeSet`](https://developer.android.com/reference/android/util/AttributeSet.html)`!, defStyle: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [AUTOMATIC_MIN_ZOOM](-a-u-t-o-m-a-t-i-c_-m-i-n_-z-o-o-m.md) | If setMinZoom(AUTOMATIC_MIN_ZOOM), then we'll set the min scale to include the whole image.`static val AUTOMATIC_MIN_ZOOM: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |

### Functions

| Name | Summary |
|---|---|
| [canScrollHorizontally](can-scroll-horizontally.md) | `open fun canScrollHorizontally(direction: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [canScrollHorizontallyFroyo](can-scroll-horizontally-froyo.md) | `open fun canScrollHorizontallyFroyo(direction: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [canScrollVertically](can-scroll-vertically.md) | `open fun canScrollVertically(direction: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getCurrentZoom](get-current-zoom.md) | Get the current zoom. This is the zoom relative to the initial scale, not the original resource.`open fun getCurrentZoom(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getMaxZoom](get-max-zoom.md) | Get the max zoom multiplier.`open fun getMaxZoom(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getMinZoom](get-min-zoom.md) | Get the min zoom multiplier.`open fun getMinZoom(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getOrientationChangeFixedPixel](get-orientation-change-fixed-pixel.md) | `open fun getOrientationChangeFixedPixel(): FixedPixel!` |
| [getScaleType](get-scale-type.md) | `open fun getScaleType(): `[`ScaleType`](https://developer.android.com/reference/android/widget/ImageView/ScaleType.html)`!` |
| [getScrollPosition](get-scroll-position.md) | Return the point at the center of the zoomed image. The PointF coordinates range in value between 0 and 1 and the focus point is denoted as a fraction from the left and top of the view. For example, the top left corner of the image would be (0, 0). And the bottom right corner would be (1, 1).`open fun getScrollPosition(): `[`PointF`](https://developer.android.com/reference/android/graphics/PointF.html)`!` |
| [getViewSizeChangeFixedPixel](get-view-size-change-fixed-pixel.md) | `open fun getViewSizeChangeFixedPixel(): FixedPixel!` |
| [getZoomedRect](get-zoomed-rect.md) | Return a Rect representing the zoomed image.`open fun getZoomedRect(): `[`RectF`](https://developer.android.com/reference/android/graphics/RectF.html)`!` |
| [isZoomed](is-zoomed.md) | Returns false if image is in initial, unzoomed state. False, otherwise.`open fun isZoomed(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isZoomEnabled](is-zoom-enabled.md) | `open fun isZoomEnabled(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onConfigurationChanged](on-configuration-changed.md) | `open fun onConfigurationChanged(newConfig: `[`Configuration`](https://developer.android.com/reference/android/content/res/Configuration.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onDraw](on-draw.md) | `open fun onDraw(canvas: `[`Canvas`](https://developer.android.com/reference/android/graphics/Canvas.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onMeasure](on-measure.md) | `open fun onMeasure(widthMeasureSpec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, heightMeasureSpec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onRestoreInstanceState](on-restore-instance-state.md) | `open fun onRestoreInstanceState(state: `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSaveInstanceState](on-save-instance-state.md) | `open fun onSaveInstanceState(): `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)`?` |
| [onSizeChanged](on-size-changed.md) | `open fun onSizeChanged(w: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, h: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, oldw: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, oldh: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [resetZoom](reset-zoom.md) | Reset zoom and translation to initial state.`open fun resetZoom(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [savePreviousImageValues](save-previous-image-values.md) | Save the current matrix and view dimensions in the prevMatrix and prevView variables.`open fun savePreviousImageValues(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setImageBitmap](set-image-bitmap.md) | `open fun setImageBitmap(bm: `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setImageDrawable](set-image-drawable.md) | `open fun setImageDrawable(drawable: `[`Drawable`](https://developer.android.com/reference/android/graphics/drawable/Drawable.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setImageResource](set-image-resource.md) | `open fun setImageResource(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setImageURI](set-image-u-r-i.md) | `open fun setImageURI(uri: `[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setMaxZoom](set-max-zoom.md) | Set the max zoom multiplier to a constant. Default value: 3.`open fun setMaxZoom(max: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setMaxZoomRatio](set-max-zoom-ratio.md) | Set the max zoom multiplier as a multiple of minZoom, whatever minZoom may change to. By default, this is not done, and maxZoom has a fixed value of 3.`open fun setMaxZoomRatio(max: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setMinZoom](set-min-zoom.md) | Set the min zoom multiplier. Default value: 1.`open fun setMinZoom(min: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setOnDoubleTapListener](set-on-double-tap-listener.md) | `open fun setOnDoubleTapListener(l: `[`OnDoubleTapListener`](https://developer.android.com/reference/android/view/GestureDetector/OnDoubleTapListener.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setOnTouchImageViewListener](set-on-touch-image-view-listener.md) | `open fun setOnTouchImageViewListener(l: OnTouchImageViewListener!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setOnTouchListener](set-on-touch-listener.md) | `open fun setOnTouchListener(l: `[`OnTouchListener`](https://developer.android.com/reference/android/view/View/OnTouchListener.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setOrientationChangeFixedPixel](set-orientation-change-fixed-pixel.md) | `open fun setOrientationChangeFixedPixel(fixedPixel: FixedPixel!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setScaleType](set-scale-type.md) | `open fun setScaleType(type: `[`ScaleType`](https://developer.android.com/reference/android/widget/ImageView/ScaleType.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setScrollPosition](set-scroll-position.md) | Set the focus point of the zoomed image. The focus points are denoted as a fraction from the left and top of the view. The focus points can range in value between 0 and 1.`open fun setScrollPosition(focusX: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setViewSizeChangeFixedPixel](set-view-size-change-fixed-pixel.md) | `open fun setViewSizeChangeFixedPixel(viewSizeChangeFixedPixel: FixedPixel!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setZoom](set-zoom.md) | Set zoom to the specified scale. Image will be centered by default.`open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set zoom to the specified scale. Image will be centered around the point (focusX, focusY). These floats range from 0 to 1 and denote the focus point as a fraction from the left and top of the view. For example, the top left corner of the image would be (0, 0). And the bottom right corner would be (1, 1).`open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusX: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun setZoom(scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusX: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, focusY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, scaleType: `[`ScaleType`](https://developer.android.com/reference/android/widget/ImageView/ScaleType.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set zoom parameters equal to another TouchImageView. Including scale, position, and ScaleType.`open fun setZoom(img: `[`TouchImageView`](./index.md)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setZoomEnabled](set-zoom-enabled.md) | `open fun setZoomEnabled(zoomEnabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
