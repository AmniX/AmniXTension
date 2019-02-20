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

Extensions:-

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
},{
    // Some Code Will be Executed After Async Block
    // You Will Receive Result Passed From Asycn Block Last line
})

tryOrIgnore{
    // Code Here Which Can be throw Exception but App Won't Crash At All
}

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

Extras:-

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

<details><summary>Logging</summary>
<p>

Logging is Simple Now, Auto TAGS, Will Embed The Tag From Its Invoked
Class Name Automatically.

```kotlin
AmniXtension.isLoggingEnabled = true // Sets The Logging Enable Or Disable

L.d("Hello", 400, object, model, anything)
L.e("Hello", 400, object, model, anything)
L.i("Hello", 400, object, model, anything)
L.w("Hello", 400, object, model, anything)
L.v("Hello", 400, object, model, anything)
L.json(jsonObject) // Log Josn With Beautification

L.wtf(exception)

```

</p>
</details>