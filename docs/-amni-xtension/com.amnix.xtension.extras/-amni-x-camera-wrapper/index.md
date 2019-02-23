[AmniXtension](../../index.md) / [com.amnix.xtension.extras](../index.md) / [AmniXCameraWrapper](./index.md)

# AmniXCameraWrapper

`class AmniXCameraWrapper` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/extras/AmniXCameraWrapper.kt#L23)

Class to wrap Camera and Provide Ease Modifications

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AmniXCameraWrapper(camera: Camera?)`<br>Class to wrap Camera and Provide Ease Modifications |

### Properties

| Name | Summary |
|---|---|
| [rawCamera](raw-camera.md) | `val rawCamera: Camera?`<br>Returns Raw Camera Object, Do Whatever You want |

### Functions

| Name | Summary |
|---|---|
| [release](release.md) | `fun release(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Release Camera Immediately |
| [startPreview](start-preview.md) | `fun startPreview(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Starts Camera Directly |
| [takePicture](take-picture.md) | `fun takePicture(onPictureClicked: (yuv: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>take Picture and Stop the Camera Preview. |
| [takeSnapShot](take-snap-shot.md) | `fun takeSnapShot(onSnapShotClicked: (yuv: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>take SnapShot from the Preview. Doesn't Stops the Camera. |

### Extension Functions

| Name | Summary |
|---|---|
| [castAs](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.castAs(to: `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T)`): `[`T`](../../com.amnix.xtension.extensions/kotlin.-any/cast-as.md#T) |
