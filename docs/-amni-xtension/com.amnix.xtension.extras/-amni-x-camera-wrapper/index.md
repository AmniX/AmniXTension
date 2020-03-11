[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [AmniXCameraWrapper](./index.md)

# AmniXCameraWrapper

`class AmniXCameraWrapper`

Class to wrap Camera and Provide Ease Modifications

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Class to wrap Camera and Provide Ease Modifications`AmniXCameraWrapper(camera: `[`Camera`](https://developer.android.com/reference/android/hardware/Camera.html)`?)` |

### Properties

| Name | Summary |
|---|---|
| [rawCamera](raw-camera.md) | Returns Raw Camera Object, Do Whatever You want`val rawCamera: `[`Camera`](https://developer.android.com/reference/android/hardware/Camera.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [release](release.md) | Release Camera Immediately`fun release(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [startPreview](start-preview.md) | Starts Camera Directly`fun startPreview(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [takePicture](take-picture.md) | take Picture and Stop the Camera Preview.`fun takePicture(onPictureClicked: (yuv: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [takeSnapShot](take-snap-shot.md) | take SnapShot from the Preview. Doesn't Stops the Camera.`fun takeSnapShot(onSnapShotClicked: (yuv: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
