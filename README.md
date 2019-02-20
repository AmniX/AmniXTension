# AmniXTension
A Kotlin extensions + Utils library with Bunch of Help inbuild. 

<div align="center">
<img src="art/logo.png" alt="AmniXTension" />
</div>

[ ![Download](https://api.bintray.com/packages/amnix/AmniXUtils/AmniXtension/images/download.svg) ](https://bintray.com/amnix/AmniXUtils/AmniXtension/_latestVersion)

[Documentation](docs/-amni-xtension/index.md) |
[FileTree](docs/fileTree.md) | [FAQ's](#) | [RoadMap](#) | [Demo](https://github.com/AmniX/AmniXTension#demo) |
[Suggestion](https://github.com/AmniX/AmniXTension/issues/new) |
[Bugs](https://github.com/AmniX/AmniXTension/issues)

**AmniXTension** = AmniX's Tension Which Means No Tension to Developers, AmniXTension is Here.

AmniXTension is On Jcenter, Simply implementat the library and simplify Your Life

 ```
 dependencies {
        implementation 'com.amnix.xtension:AmniXtension:x.x.x'  
 }
 ```
 
# Demo
Wanna See Some Demo? Few are mention, Many to explore.

<details><summary>Bitmap Extensions</summary>
<p>

```kotlin

Bitmap.save("/path/..../image.jpg")
Bitmap.saveAsync("/path/..../image.jpg")

val pixel = bitmap[x,y]
bitmap[x,y] = Color.WHITE

val base64 = bitmap.toBase64()
val resized = bitmap.resize(20,40)
val rotated = bitmap.rotateTo(90)
val round = bitmap.toRound()
val roundCorner = bitmap.toRoundCorner()
val grey = bitmap.toGrayScale()
val byteArray = bitmap.toByteArray

val compressed = bitmap.compressBySampleSize(400,500)
val compressedQuality = bitmap.compressByQuality(80)
```

</p>
</details>

<details><summary>Context Extensions</summary>
<p>

```kotlin
val screenWidth = context.screenWidth
val screenHeight = context.screenHeight

context.showToast()
context.showToastHard()
context.showConfirmationDialog()
context.showSinglePicker()
context.showMultiPicker()
context.showDatePicker()
context.showTimePicker()

context.isGPSEnable()
context.isNetworkAvailable()
context.isAppInstalled()
context.isIntentResolvable()
context.checkSelfPermissions()

context.getAndroidID()
context.getDeviceID()
context.getIMEI()

context.requestMediaScanner()

context.vibrate()

context.startApp()
context.startActivity()
context.startService()
context.startApp()

context.getAllImages()
context.getAllVideos()
context.getAllAudios()

context.getActivityManager()
context.getAlarmManager()
context.getAudioManager()
context.getClipboardManager()
context.getConnectivityManager()
context.getKeyguardManager()
context.getLocationManager()
context.getNotificationManager()
context.getPowerManager()
context.getSearchManager()
context.getSensorManager()
context.getTelephonyManager()
context.getVibrator()
context.getWifiManager()
context.getWindowManager()
context.getInputMethodManager()
context.getKeyguardManager()
context.getLayoutInflater()
.....And All The...........
......System Service.......
........Are Avaibale.......

```

</p>
</details>
