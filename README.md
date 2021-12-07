# AmniXTension [DEPRECATED]
No Longer maintained. There are tons of ktx libraries prvided by google itself now which are more preferable over this.
A Kotlin extensions + Utils library with Bunch of Help inbuild. 

<div align="center">
<img src="art/logo.png" alt="AmniXTension" />
<br/>
<img src="https://img.shields.io/bintray/v/amnix/AmniXUtils/AmniXtension.svg?color=%23134660&label=Latest%20Version%20&style=for-the-badge" alt="Current Version">
</div>

<div align="center">

![Made With Kotlin](https://img.shields.io/badge/Made%20With-Kotlin-blue.svg?style=for-the-badge&logo=kotlin)
![Build With Love](https://img.shields.io/badge/Build%20With-%E2%9D%A4-red.svg?style=for-the-badge)
</div>

<div align="center">


[ ![Build Status](https://app.bitrise.io/app/695e9ded2132c339/status.svg?token=cbdPWb4DWtdOX9ObshPkYg) ](https://app.bitrise.io/app/695e9ded2132c339)
[ ![Download](https://api.bintray.com/packages/amnix/AmniXUtils/AmniXtension/images/download.svg) ](https://bintray.com/amnix/AmniXUtils/AmniXtension/_latestVersion)
[![Dependencies](https://camo.githubusercontent.com/6266857d1c53194119edf1d9aafae7a4b301fa16/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f646570656e64656e636965732d7570253230746f253230646174652d627269676874677265656e2e737667)]()
![GitHub code size](https://img.shields.io/badge/Code%20size-44%20KB-blue.svg)
![GitHub issues](https://img.shields.io/github/issues-raw/AmniX/AmniXtension.svg)
![Contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg)
[![Say Thanks!](https://img.shields.io/badge/Say%20Thanks-!-1EAEDB.svg)](https://saythanks.io/to/AmniX)
[![Donate](https://img.shields.io/badge/$-donate-ff69b4.svg?maxAge=2592000&amp;style=flat)](https://www.paypal.me/amnixtonk)
[![License](https://img.shields.io/badge/license-Apache%202-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

</div>

<div align="center">

![GitHub forks](https://img.shields.io/github/forks/AmniX/AmniXtension.svg?style=social)
![GitHub stars](https://img.shields.io/github/stars/AmniX/AmniXtension.svg?style=social)
![GitHub stars](https://img.shields.io/github/watchers/AmniX/AmniXtension.svg?style=social)
![GitHub followers](https://img.shields.io/github/followers/AmniX.svg?style=social)

</div>

<div align="center">

[Documentation](docs/-amni-xtension/index.md) |
[FileTree](docs/fileTree.md) | [FAQ's](#) | [RoadMap](#) |
[Demo](https://github.com/AmniX/AmniXTension#demo) |
[Suggestion](https://github.com/AmniX/AmniXTension/issues/new) |
[Bugs](https://github.com/AmniX/AmniXTension/issues)

</div>


**AmniXTension** = AmniX's Tension Which Means No Tension to Developers, AmniXTension is Here.

AmniXTension is On Jcenter, Simply implementat the library and simplify Your Life

 ```
 dependencies {
        implementation 'com.amnix.xtension:AmniXtension:x.x.x'  
 }
 ```
 
# Demo
Wanna See Some Demo? Few are mention, Many to explore. 

Things Are Collapsed. You need to Expand them ;)

**Extensions:-**

<details><summary>Global Extensions</summary>
<p>

**Global Extensions Means You can Use them Anywhere**

```kotlin
async{
    // Some Code Which Will Run in a Worker Thread
    // Caution : Make sure you don't do some context related stuff in async, It may cause an memory leak
}

asyncAwait({
    // Some Code Which Will Run in a Worker Thread
    // Caution : Make sure you don't do some context related stuff in async, It may cause an memory leak
    result // Keep the Result in Last Line, You Will Receive it in Await Block Magically. 
},{result->
    // Some Code Will be Executed After Async Block
    // You Will Receive Result Passed From Async Block Last line
})

          OR

asyncAwait<Bitmap>({bitmap->
    // Some Code Which Will Run in a Worker Thread
    // Caution : Make sure you don't do some context related stuff in async, It may cause an memory leak
    result // Keep the Result in Last Line, You Will Receive it in Await Block Magically. 
},{result->
    // Some Code Will be Executed After Async Block
    // You Will Receive Result Passed From Async Block Last line
})

tryOrIgnore{
    // Code Here Which Can be throw Exception but App Won't Crash At All
}

object.castTo(Object::class) // Cast Object inline and Supports Code Chaining.
             OR
object.castAs(Object::class) // Cast Object inline and Supports Code Chaining.

tryAndCatch({
    // Try Code
},{
    // catch Exception
},{
    // Optional Finally Block
})

if(guardRun{
    //Run Code in Guarded Way
}){
    //Code There If Above Code Executed Without Any Exception
}

object.ifIs(otherObject){
    // Run Code if above Object is equal to other Object.
    It does Simply Replace below code
    
    if(object == otherObject){
        //Your Code
    }
}

object.ifIsNot(otherObject){
    // Run Code if above Object is equal to other Object.
    It does Simply Replace below code
    
    if(object != otherObject){
        //Your Code
    }
}

closeSafely(inputStream, outputStream) // Clode Streams Safely and prevent any memory leak

if(isDeviceRooted()){
    // Alert User that Few Features are disable Because You have Rooted Device
}

val date = currentDate()

runOnUiThread{
    // Run Your Code On UI thread Without the Activity Object
}

putInMemory("key",value) // Put Anything In Memory For Later Use
val value = getFromMemory("key") // Get Your Saved Value from Memory


```

</p>
</details>

<details><summary>BoilerPlate Extensions</summary>
<p>

```kotlin
surfaceView.setupCamera{
    it.startPreview()
}

textureView.setupCamera{
    it.startPreview()
}
```

</p>
</details>

<details><summary>Activity Extensions</summary>
<p>

```kotlin

requestPermission(Manifest.permission.CAMERA){
  //No need to check if the Permission Grated Already Or Not, We Will do it for you. Just Place the code in [onResult] Block, We will Execute it SomeHow.
    if(it){
        // Yay, We have Permission to start the Camera
    }else{
        // Alas, We Don't have Permission to Start The Camera, Ask User to disable the feature
    }
}

getStatusBarHeight()
getNavigationBarSize()

showSnackBar() // Show SnackBar WithOut Design Support Library. Its look better then Actual Snackbar ;)

setStatusBarColor()
setNavigationBarColor()
setNavigationBarDividerColor()

onViewInflated{
    // Code On View Inflated 
    // Mimics the ViewTreeObserver/globalLayoutListener
}

getRootView()

```

</p>
</details>


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
context.showNotification("Hello Notification",...,...,... other params) //Handles Everything For You
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

context.getAppName() // Current or Given Package
context.getAppIcon() // Current or Given Package
context.getAppSize() // Current or Given Package
context.getAppApk() // Current or Given Package
context.getAppVersionName() // Current or Given Package
context.getAppVersionCode() // Current or Given Package
context.isServiceRunning() //Check If Service is Running Or Not

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

<details><summary>File Extensions</summary>
<p>

```kotlin
val file = File("/a/file/from/anywhere")

val string = file.readToString()
val inputStream = file.open()
val byteArray = file.toByteArray()


file.copy(File("copy to"))
file.move(File("copy to"))
file.deleteAll()

if(file.isImage()){
    //do the Stuff Like Decoding File to image
}

```

</p>
</details>



<details><summary>Number Extensions</summary>
<p>

```kotlin
pxFromSp()
spFromPx()
pxFromDp()
dpFromPx()

40.loop{
    // Loop Till 0 to 40
}

1.toBoolean()
```

</p>
</details>

<details><summary>SeekBar Extensions</summary>
<p>

```kotlin
seekBar.setOnSeekBarChangeListener(
    onProgressChanged={seek,progress,fromUser->

})
```

</p>
</details>

<details><summary>String Extensions</summary>
<p>

```kotlin
encodeToBase64()
decodeToBase64()

toCamelCase()
toTitleCase()

encryptAES("mySecretKey")
decryptAES("mySecretKey")

encodeToBinary()
deCodeToBinary()
```

</p>
</details>

<details><summary>View Extensions</summary>
<p>

```kotlin
val bitmap = view.screenshot()

view.setOnSingleClickListener{
    //Prevent Multiple tap from Geeky Users
}

view.fadeIn() // Fade the View In
view.fadeOut() // Fade the View Out

view.showKeyBoard()
view.hideKeyBoard()

setPaddingLeft(40)
setPaddingRight(40)
top
bottom
start
end
Horizontal
setPaddingVertical(40)

setHeight()
setWidth()

isVisible()
isGone()
isInvisible()

getActivity()

```

</p>
</details>


<br/>
 
**Extras :-**



<details><summary>Code benchMarking</summary>
<p>

Want to Know How Much Does You Code takes to Execute? <br/> Let me show
you how you can do the same Easily.

```kotlin
val bench = BenchMarkUtils()

Your Code Goes Here
And Maybe Here Too
And Might Be Here Too...


val time = bench.dump() // Dumps The Time to Logcat and Returns The Same Too
//Now Check the Logcat With Tha Class name Tag and You will see the Results

```

</p>
</details>

<details><summary>Color Progress bar</summary>
<p>

A ProgressBar But Supported Color Change from xml Only.

```xml
<com.amnix.xtension.widgets.ColorProgressBar
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:color="#FF0000"/>
        
        <!--RED Progress Bar-->

```

</p>
</details>

<details><summary>Shadow View</summary>
<p>

A View to Apply Linear Shadow to any View, Its Like and Gradient
Replacement From the xml itself

```xml
<com.amnix.xtension.widgets.ShadowView
        android:layout_width="match_parent"
        android:layout_height="8dp"
        app:angle="bottomToTop"
        app:endColor="#00000000"
        app:startColor="#FF0000" />
        
        <!--Linear Shadow From Bottom to Top -->

```

</p>
</details>

<details><summary>Touch ImageView</summary>
<p>

An ImageView With Inbuild Support of ImageView Ping and Double Tap to
Zoom

```xml
 <com.amnix.xtension.widgets.TouchImageView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
        
        <!--Touch ImageView -->

```

</p>
</details>

<details><summary>Circular ImageView</summary>
<p>
```xml
<com.amnix.xtension.widgets.CircularImageView
        android:layout_width="240dp"
        android:id="@+id/circularImageView"
        android:layout_height="240dp"
        app:background_color="#ffffff"
        app:border="true"
        app:border_color="#ffffff"
        app:border_width="4dp"
        app:shadow="true"
        app:shadow_color="#AAAAAA"
        app:shadow_gravity="center"
        app:shadow_radius="8" />

```
</p>
</details>

<details><summary>InMemoryCache</summary>
<p>

Keep AnyThing In Memory and Access From Anywhere Easily

```kotlin
val myData = "HelloData"

InMemoryCache.put("data",myData)

val data = InMemoryCache.get("data")

InMemoryCache.clear()

More Methods To Explore.

```

</p>
</details>

<details><summary>Pretty Logging</summary>
<p>

Logging is Simple Now, Auto TAGS, Will Embed The Tag From Its Invoked
Class Name Automatically.

```kotlin
AmniXtension.isLoggingEnabled = true // Sets The Logging Enable Or Disable

L.d(listOf("One", "Two", "Three"))
L.d(mapOf(1 to "One", 2 to "Two", 3 to "Three"))
L.d(arrayOf("One", "Two", "Three"))
L.d(setOf("One", "Two", "Three"))
L.d(UUID.randomUUID().toString().append(UUID.randomUUID().toString()))
L.e(UUID.randomUUID().toString())
L.d("A Long String Is Here to Print to Log And Can Be Printed Easily")
L.json("{ \"glossary\": { \"title\": \"example glossary\", \"GlossDiv\": { \"title\": \"S\", \"GlossList\": { \"GlossEntry\": { \"ID\": \"SGML\", \"SortAs\": \"SGML\", \"GlossTerm\": \"Standard Generalized Markup Language\", \"Acronym\": \"SGML\", \"Abbrev\": \"ISO 8879:1986\", \"GlossDef\": { \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\", \"GlossSeeAlso\": [\"GML\", \"XML\"] }, \"GlossSee\": \"markup\" } } } } }")
```

Above Lines Will Print the Logs Like Below-

```
2019-03-07 12:34:02.171 8162-8162/? D/AmniXLogs:
    ┌────────────────────────────────────────────────────────────────────────────────────────
    │ Thread: main, Source: com.amnix.xtension.MainActivity.onCreate (MainActivity.kt:17)
    ├────────────────────────────────────────────────────────────────────────────────────────
    │ [One, Two, Three]
    └────────────────────────────────────────────────────────────────────────────────────────
2019-03-07 12:34:02.178 8162-8162/? D/AmniXLogs:
    ┌────────────────────────────────────────────────────────────────────────────────────────
    │ Thread: main, Source: com.amnix.xtension.MainActivity.onCreate (MainActivity.kt:18)
    ├────────────────────────────────────────────────────────────────────────────────────────
    │ {1=One, 2=Two, 3=Three}
    └────────────────────────────────────────────────────────────────────────────────────────
2019-03-07 12:34:02.179 8162-8162/? D/AmniXLogs:
    ┌────────────────────────────────────────────────────────────────────────────────────────
    │ Thread: main, Source: com.amnix.xtension.MainActivity.onCreate (MainActivity.kt:19)
    ├────────────────────────────────────────────────────────────────────────────────────────
    │ [One, Two, Three]
    └────────────────────────────────────────────────────────────────────────────────────────
2019-03-07 12:34:02.270 8162-8162/? D/AmniXLogs:
    ┌────────────────────────────────────────────────────────────────────────────────────────
    │ Thread: main, Source: com.amnix.xtension.MainActivity.onCreate (MainActivity.kt:20)
    ├────────────────────────────────────────────────────────────────────────────────────────
    │ [One, Two, Three]
    └────────────────────────────────────────────────────────────────────────────────────────
2019-03-07 12:34:02.277 8162-8162/? D/AmniXLogs:
    ┌────────────────────────────────────────────────────────────────────────────────────────
    │ Thread: main, Source: com.amnix.xtension.MainActivity.onCreate (MainActivity.kt:21)
    ├────────────────────────────────────────────────────────────────────────────────────────
    │ 333bd5d4-ae3c-488f-afb8-bddfb4e6661cecd401a7-835c-45bb-9827-a6fa5bd4d723
    └────────────────────────────────────────────────────────────────────────────────────────
2019-03-07 12:34:02.278 8162-8162/? E/AmniXLogs:
    ┌────────────────────────────────────────────────────────────────────────────────────────
    │ Thread: main, Source: com.amnix.xtension.MainActivity.onCreate (MainActivity.kt:22)
    ├────────────────────────────────────────────────────────────────────────────────────────
    │ 19449369-e192-44aa-8460-a7d3d8776fff
    └────────────────────────────────────────────────────────────────────────────────────────
2019-03-07 12:34:02.279 8162-8162/? D/AmniXLogs:
    ┌────────────────────────────────────────────────────────────────────────────────────────
    │ Thread: main, Source: com.amnix.xtension.MainActivity.onCreate (MainActivity.kt:23)
    ├────────────────────────────────────────────────────────────────────────────────────────
    │ A Long String Is Here to Print to Log And Can Be Printed Easily
    └────────────────────────────────────────────────────────────────────────────────────────
2019-03-07 12:34:02.291 8162-8162/? D/AmniXLogs:
    ┌────────────────────────────────────────────────────────────────────────────────────────
    │ Thread: main, Source: com.amnix.xtension.MainActivity.onCreate (MainActivity.kt:24)
    ├────────────────────────────────────────────────────────────────────────────────────────
    │ {
    │  "glossary": {
    │    "title": "example glossary",
    │    "GlossDiv": {
    │      "title": "S",
    │      "GlossList": {
    │        "GlossEntry": {
    │          "ID": "SGML",
    │          "SortAs": "SGML",
    │          "GlossTerm": "Standard Generalized Markup Language",
    │          "Acronym": "SGML",
    │          "Abbrev": "ISO 8879:1986",
    │          "GlossDef": {
    │            "para": "A meta-markup language, used to create markup languages such as DocBook.",
    │            "GlossSeeAlso": [
    │              "GML",
    │              "XML"
    │            ]
    │          },
    │          "GlossSee": "markup"
    │        }
    │      }
    │    }
    │  }
    │}
    └────────────────────────────────────────────────────────────────────────────────────────

```
</p>
</details>

## License
Copyright 2019, AmniX

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
