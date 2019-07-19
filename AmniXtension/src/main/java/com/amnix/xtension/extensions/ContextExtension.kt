/*
 * Copyright (c) 2019, AmniX
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *                            http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *  either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.amnix.xtension.extensions

import android.Manifest
import android.accounts.AccountManager
import android.annotation.SuppressLint
import android.app.*
import android.app.admin.DevicePolicyManager
import android.bluetooth.BluetoothManager
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.hardware.SensorManager
import android.hardware.display.DisplayManager
import android.hardware.input.InputManager
import android.hardware.usb.UsbManager
import android.location.LocationManager
import android.media.AudioManager
import android.media.MediaRouter
import android.net.ConnectivityManager
import android.net.Uri
import android.net.nsd.NsdManager
import android.net.wifi.WifiManager
import android.net.wifi.p2p.WifiP2pManager
import android.nfc.NfcManager
import android.os.*
import android.os.storage.StorageManager
import android.provider.MediaStore
import android.provider.Settings
import android.telephony.TelephonyManager
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager
import android.widget.RemoteViews
import android.widget.Toast
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresPermission
import androidx.appcompat.app.AlertDialog
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.core.content.pm.PackageInfoCompat
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat
import com.amnix.xtension.enums.ContentColumns
import com.amnix.xtension.enums.ContentOrder
import java.io.File
import java.util.*
import kotlin.random.Random

/**
 * get Screen Width Easily
 */
inline val Context.screenWidth: Int
    get() = resources.displayMetrics.widthPixels
/**
 * get Screen Height Easily
 */
inline val Context.screenHeight: Int
    get() = resources.displayMetrics.heightPixels

/**
 * shows the toast with a Single Call, Just Provide your [msg] and [length] (Optionally)
 */
fun Context.showToast(msg: String, length: Int = Toast.LENGTH_LONG) = Toast.makeText(this, msg, length).show()

/**
 * There is No Such Thing name Hard Toast, Its just an AlertDialog which will the [msg] you passed until user cancels it.
 */
fun Context.showToastHard(msg: String) = AlertDialog.Builder(this).setMessage(msg).show()

/**
 * Want to Confirm the User Action? Just call showConfirmationDialog with required + optional params to do so.
 */
fun Context.showConfirmationDialog(
    msg: String,
    onResponse: (result: Boolean) -> Unit,
    positiveText: String = "Yes",
    negetiveText: String = "No",
    cancelable: Boolean = false
) =
    AlertDialog.Builder(this).setMessage(msg).setPositiveButton(positiveText) { _, _ -> onResponse(true) }.setNegativeButton(
        negetiveText
    ) { _, _ -> onResponse(false) }.setCancelable(cancelable).show()

/**
 * Want your user to choose Single thing from a bunch? call showSinglePicker and provide your options to choose from
 */
fun Context.showSinglePicker(choices: Array<String>, onResponse: (index: Int) -> Unit, checkedItemIndex: Int = -1) =
    AlertDialog.Builder(this).setSingleChoiceItems(choices, checkedItemIndex) { dialog, which ->
        onResponse(which)
        dialog.dismiss()
    }.show()

/**
 * Want your user to choose Multiple things from a bunch? call showMultiPicker and provide your options to choose from
 */
fun Context.showMultiPicker(
    choices: Array<String>,
    onResponse: (index: Int, isChecked: Boolean) -> Unit,
    checkedItems: BooleanArray? = null
) =
    AlertDialog.Builder(this).setMultiChoiceItems(choices, checkedItems) { _, which, isChecked ->
        onResponse(
            which,
            isChecked
        )
    }.setPositiveButton("Done", null).show()

/**
 * Checks if GPS is Enabled or Not. Might Require the Location Permission
 */
fun Context.isGPSEnable(): Boolean = getLocationManager().isProviderEnabled(LocationManager.GPS_PROVIDER)

/**
 * Check if Internet is Available or not. Requires ACCESS_NETWORK_STATE Permission.
 */
@RequiresPermission(Manifest.permission.ACCESS_NETWORK_STATE)
fun Context.isNetworkAvailable(): Boolean {
    val info = getConnectivityManager().activeNetworkInfo
    return info != null && info.isConnected
}

/**
 * ask the system to scan your file easily with a broadcast.
 */
fun Context.requestMediaScanner(url: String) {
    val mediaScanIntent = Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE)
    val contentUri = Uri.fromFile(File(url))
    mediaScanIntent.data = contentUri
    this.sendBroadcast(mediaScanIntent)
}

/**
 * Vanna Vibrate the Device Vibrator for some Feedback? do it with the ease of [vibrate] method with the specific millis
 */
@Suppress("DEPRECATION")
@RequiresPermission(Manifest.permission.VIBRATE)
fun Context.vibrate(millis: Long) = getVibrator().vibrate(millis)

/**
 * check for the Permission Easily. call [checkSelfPermissions] with the permissions and we will tell you if you are permitted or not.
 */
fun Context.checkSelfPermissions(permissions: Array<String>): Boolean {
    permissions.forEach {
        if (ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED)
            return false
    }
    return true
}

/**
 * check for the Permission Easily. call [checkSelfPermissions] with the permissions and we will tell you if you are permitted or not.
 */
fun Context.checkSelfPermissions(permissions: List<String>): Boolean {
    permissions.forEach {
        if (ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED)
            return false
    }
    return true
}

/**
 * Wanna check if you can resolve the intent? Call [isIntentResolvable] with your intent and check it with the ease.
 */
fun Context.isIntentResolvable(intent: Intent) =
    packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY).isNotEmpty()

/**
 * Want to start third party App? Just get us the package Name and we will Start* It
 *
 * *If App Installed ;)
 */
fun Context.startApp(pName: String) =
    if (isAppInstalled(pName)) startActivity(packageManager.getLaunchIntentForPackage(pName)) else {
    }

/**
 * Check if an App is Installed on the user device.
 */
fun Context.isAppInstalled(packageName: String): Boolean {
    return try {
        packageManager.getApplicationInfo(packageName, 0)
        true
    } catch (ignore: Exception) {
        false
    }
}

/**
 * Want All the Images from the User Phone?
 *
 * Get them easily with the below method, Make Sure You have READ_EXTERNAL_STORAGE Permission
 */
@RequiresPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
fun Context.getAllImages(
    sortBy: ContentColumns = ContentColumns.DATE_ADDED,
    order: ContentOrder = ContentOrder.DESCENDING
): List<String> {
    val data = mutableListOf<String>()
    val cursor = contentResolver.query(
        MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
        arrayOf(MediaStore.Images.Media.DATA),
        null,
        null,
        sortBy.s + " " + order.s
    )
    cursor?.let {
        val columnIndexData = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
        while (cursor.isClosed.not() && cursor.moveToNext()) {
            cursor.getString(columnIndexData).let {
                if (it.toFile().exists()) {
                    data.add(it)
                }
            }
        }
        cursor.close()
    }
    return data.toList()
}

/**
 * Want All the Videos from the User Phone?
 *
 * Get them easily with the below method, Make Sure You have READ_EXTERNAL_STORAGE Permission
 */
@RequiresPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
fun Context.getAllVideos(
    sortBy: ContentColumns = ContentColumns.DATE_ADDED,
    order: ContentOrder = ContentOrder.DESCENDING
): List<String> {
    val data = mutableListOf<String>()
    val cursor = contentResolver.query(
        MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
        arrayOf(MediaStore.Video.Media.DATA),
        null,
        null,
        sortBy.s + " " + order.s
    )
    cursor?.let {
        val columnIndexData = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA)
        while (cursor.isClosed.not() && cursor.moveToNext()) {
            cursor.getString(columnIndexData).let {
                if (it.toFile().exists()) {
                    data.add(it)
                }
            }
        }
        cursor.close()
    }
    return data.toList()
}

/**
 * get Application Name,
 *
 * @property pName the Package Name of the Target Application, Default is Current.
 *
 * Provide Package or will provide the current App Detail
 */
@Throws(PackageManager.NameNotFoundException::class)
fun Context.getAppName(pName: String = packageName): String {
    return packageManager.getApplicationLabel(packageManager.getApplicationInfo(pName, 0)).toString()
}

/**
 * get Application Icon,
 *
 * @property pName the Package Name of the Target Application, Default is Current.
 *
 * Provide Package or will provide the current App Detail
 */
@Throws(PackageManager.NameNotFoundException::class)
fun Context.getAppIcon(pName: String = packageName): Drawable {
    return packageManager.getApplicationInfo(pName, 0).loadIcon(packageManager)
}

/**
 * get Application Size in Bytes
 *
 * @property pName the Package Name of the Target Application, Default is Current.
 *
 * Provide Package or will provide the current App Detail
 */
@Throws(PackageManager.NameNotFoundException::class)
fun Context.getAppSize(pName: String = packageName): Long {
    return packageManager.getApplicationInfo(pName, 0).sourceDir.toFile().length()
}

/**
 * get Application Apk File
 *
 * @property pName the Package Name of the Target Application, Default is Current.
 *
 * Provide Package or will provide the current App Detail
 */
@Throws(PackageManager.NameNotFoundException::class)
fun Context.getAppApk(pName: String = packageName): File {
    return packageManager.getApplicationInfo(pName, 0).sourceDir.toFile()
}


/**
 * get Application Version Name
 *
 * @property pName the Package Name of the Target Application, Default is Current.
 *
 * Provide Package or will provide the current App Detail
 */
@Throws(PackageManager.NameNotFoundException::class)
fun Context.getAppVersionName(pName: String = packageName): String {
    return packageManager.getPackageInfo(pName, 0).versionName
}

/**
 * get Application Version Code
 *
 * @property pName the Package Name of the Target Application, Default is Current.
 *
 * Provide Package or will provide the current App Detail
 */
@Throws(PackageManager.NameNotFoundException::class)
fun Context.getAppVersionCode(pName: String = packageName): Long {
    return PackageInfoCompat.getLongVersionCode(packageManager.getPackageInfo(pName, 0))
}

/**
 * Checks If the Service Is Runing or Not.
 *
 * @property clazz is the Service Class you want to check for.
 */
fun Context.isServiceRunning(clazz: Class<out Service>): Boolean {
    @Suppress("DEPRECATION")
    return getActivityManager().getRunningServices(Integer.MAX_VALUE).filter {
        it.service.className == clazz.name
    }.isNotEmpty()
}

/**
 * Send Sms Easily, Opens Default SMS App.
 *
 * @property to the Contact Number
 * @property body the SMS Body
 */
fun Context.sendSMS(to: String = "", body: String) {
    startActivity(Intent(Intent.ACTION_SENDTO, Uri.parse("smsto$to")).putExtra("sms_body", body))
}

/**
 * Dials a Number
 *
 * @property number the Number you want to dial
 */
fun Context.dialNumber(number: String) {
    startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number")))
}

/**
 * Open Default Email Client with the [mailID] preSetted
 */
fun Context.sendEmail(mailID: String) {
    startActivity(Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$mailID")))
}

/**
 * Checks if App is in Background
 */
fun Context.isBackground(pName: String = packageName): Boolean {
    getActivityManager().runningAppProcesses.forEach {
        @Suppress("DEPRECATION")
        if (it.processName == pName)
            return it.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_BACKGROUND
    }
    return false
}

/**
 * Creates App ShortCut to the launcher App Drawer
 *
 * @property shortCutName The Name of the SHortCut
 * @property icon the Resource Drawable for the Shortcut
 * @property cls the Activity Class Which Will be Opened from the Shortcut
 */
@Suppress("DEPRECATION")
fun Context.createDeskShortCut(shortCutName: String, icon: Int, cls: Class<out Activity>) {
    val shortcutIntent = Intent("com.android.launcher.action.INSTALL_SHORTCUT")
    shortcutIntent.putExtra("duplicate", false)
    shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, shortCutName)
    val ico = Intent.ShortcutIconResource.fromContext(applicationContext, icon)
    shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, ico)
    val intent = Intent(this, cls)
    intent.action = "android.intent.action.MAIN"
    intent.addCategory("android.intent.category.LAUNCHER")
    shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, intent)
    sendBroadcast(shortcutIntent)
}

/**
 * Show Notification Easily, With Just a Single Method
 *
 * @property contentTitle The title of the Notification
 * @property id the Id Of the Notification
 * @property contentText the ContentText Of the Notification
 * @property icon The Small Icon of the Notification
 * @property channelID the ID of the Channel
 * @property channelName the Name of the Channel
 * @property contentInfo the ContentInfo For the Notification
 * @property pendingIntent the pending Intent for the Notification
 * @property content the ContentView for the Notification
 * @property bigContent the BigContentView for the Notification
 * @property autoCancel set to True if want to autoCancel the Notification
 * @property ledColor sets the led argb Color
 * @property isColorized true if you want this Notification as a Colorized Notification
 * @property subText the SubText For the Notification
 * @property priority the priority sets param for Notification
 * @property style the Notification Style
 *
 */
fun Context.showNotification(
    contentTitle: String,
    id: Int = Random.nextInt(),
    contentText: String? = null,
    @DrawableRes icon: Int = android.R.drawable.stat_notify_more,
    channelID: String = "default",
    channelName: String = "Default Notification",
    contentInfo: String? = null,
    pendingIntent: PendingIntent? = null,
    content: RemoteViews? = null,
    bigContent: RemoteViews? = null,
    autoCancel: Boolean = false,
    @ColorInt ledColor: Int = Color.WHITE,
    isColorized: Boolean = false,
    subText: String? = null,
    priority: Int = NotificationCompat.PRIORITY_DEFAULT,
    style: NotificationCompat.Style? = null
) {

    val notification = NotificationCompat.Builder(this, channelID)
        .setContentTitle(contentTitle)
        .setSmallIcon(icon)
        .setContentText(contentText)
        .setContentInfo(contentInfo)
        .setContentIntent(pendingIntent).setContent(content).setCustomBigContentView(bigContent)
        .setAutoCancel(autoCancel)
        .setColor(ledColor)
        .setChannelId(channelID)
        .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)
        .setCategory(NotificationCompat.CATEGORY_EVENT)
        .setColorized(isColorized)
        .setSubText(subText)
        .setPriority(priority)
        .setStyle(style)
        .build()
    val notificationManager = getNotificationManager()

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val channel = NotificationChannel(
            channelID,
            channelName,
            NotificationManager.IMPORTANCE_DEFAULT
        )
        notificationManager.createNotificationChannel(channel)
    }

    notificationManager.notify(id, notification)
}

/**
 * Creates App ShortCut to the launcher Screen
 *
 * @property shortCutName The Name of the SHortCut
 * @property iconId the Resource Drawable for the Shortcut
 * @property presentIntent the Intent will be fire on Clicking the ShortCut.
 */
fun Context.createShortcut(shortCutName: String, iconId: Int, presentIntent: Intent) {
    val shortcutInfo = ShortcutInfoCompat.Builder(this, UUID.randomUUID().toString()).setIntent(presentIntent).setIcon(
        IconCompat.createWithResource(this,iconId)).setLongLabel(shortCutName).build()
    ShortcutManagerCompat.createShortcutResultIntent(this, shortcutInfo)
}

/**
 * Want All the Audios from the User Phone?
 *
 * Get them easily with the below method, Make Sure You have READ_EXTERNAL_STORAGE Permission
 */
@RequiresPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
fun Context.getAllAudios(
    sortBy: ContentColumns = ContentColumns.DATE_ADDED,
    order: ContentOrder = ContentOrder.DESCENDING
): List<String> {
    val data = mutableListOf<String>()
    val cursor = contentResolver.query(
        MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
        arrayOf(MediaStore.Audio.Media.DATA),
        null,
        null,
        sortBy.s + " " + order.s
    )
    cursor?.let {
        val columnIndexData = cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)
        while (cursor.isClosed.not() && cursor.moveToNext()) {
            cursor.getString(columnIndexData).let {
                if (it.toFile().exists()) {
                    data.add(it)
                }
            }
        }
        cursor.close()
    }
    return data.toList()
}

/**
 * Show Date Picker and Get the Picked Date Easily
 */
fun Context.showDatePicker(year: Int, month: Int, day: Int, onDatePicked: (year: Int, month: Int, day: Int) -> Unit) {
    DatePickerDialog(this, { _, pyear, pmonth, pdayOfMonth ->
        onDatePicked(pyear, pmonth, pdayOfMonth)
    }, year, month, day).show()
}

/**
 * Show the Time Picker and Get the Picked Time Easily
 */
fun Context.showTimePicker(
    currentDate: Date = currentDate(),
    is24Hour: Boolean = false,
    onDatePicked: (hour: Int, minute: Int) -> Unit
) {
    @Suppress("DEPRECATION")
    TimePickerDialog(this, { _, hourOfDay, minute ->
        onDatePicked(hourOfDay, minute)

    }, currentDate.hours, currentDate.minutes, is24Hour).show()
}

/**
 * get Android ID
 */
@SuppressLint("HardwareIds")
fun Context.getAndroidID() = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)

/**
 * get Device ID a.k.a Android ID
 */
fun Context.getDeviceID() = getAndroidID()

/**
 * get Device IMEI
 *
 * Requires READ_PHONE_STATE Permission
 */
@SuppressLint("HardwareIds")
@RequiresPermission(Manifest.permission.READ_PHONE_STATE)
fun Context.getIMEI() = when {
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.O -> getTelephonyManager().imei
    else -> getTelephonyManager().deviceId
}

/**
 * Starts Activity with the class and extra values
 */
fun Context.startActivity(cls: Class<out Activity>, extras: Bundle) = startActivity(Intent(this, cls).putExtras(extras))

/**
 * Starts Service with the class and extra values
 */
fun Context.startService(cls: Class<out Service>, extras: Bundle) = startService(Intent(this, cls).putExtras(extras))

/**
 * get Activity Manager
 */
fun Context.getActivityManager() = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

/**
 * get Alaram Manager
 */
fun Context.getAlarmManager() = getSystemService(Context.ALARM_SERVICE) as AlarmManager

/**
 * get Audio Manager
 */
fun Context.getAudioManager() = getSystemService(Context.AUDIO_SERVICE) as AudioManager

/**
 * get ClipBoard Manager
 */
fun Context.getClipboardManager() = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

/**
 * get Connectivity Manager
 */
fun Context.getConnectivityManager() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

/**
 * get KeyGuard Manager
 */
fun Context.getKeyguardManager() = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager

/**
 * get Layout Inflater Service
 */
fun Context.getLayoutInflater() = LayoutInflater.from(this)

/**
 * get Location manager
 */
fun Context.getLocationManager() = getSystemService(Context.LOCATION_SERVICE) as LocationManager

/**
 * get Notification Manager
 */
fun Context.getNotificationManager() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

/**
 * get Power Manager
 */
fun Context.getPowerManager() = getSystemService(Context.POWER_SERVICE) as PowerManager

/**
 * get Search Manager
 */
fun Context.getSearchManager() = getSystemService(Context.SEARCH_SERVICE) as SearchManager

/**
 * get Sensor Manager
 */
fun Context.getSensorManager() = getSystemService(Context.SENSOR_SERVICE) as SensorManager

/**
 * get Telephony Manager
 */
fun Context.getTelephonyManager() = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

/**
 * get Vibrater Service
 */
fun Context.getVibrator() = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

/**
 * get WiFi Manager
 */
fun Context.getWifiManager() = getApplicationContext().getSystemService(Context.WIFI_SERVICE) as WifiManager

/**
 * get Window Manager
 */
fun Context.getWindowManager() = getSystemService(Context.WINDOW_SERVICE) as WindowManager

/**
 * get InputMethod Manager
 */
fun Context.getInputMethodManager() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

/**
 * get Accessiblity Manager
 */
fun Context.getAccessibilityManager() = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager

/**
 * get Account Manager
 */
fun Context.getAccountManager() = getSystemService(Context.ACCOUNT_SERVICE) as AccountManager

/**
 * get Device Policy manager
 */
fun Context.getDevicePolicyManager() = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager

/**
 * get DropBox Manager
 */
fun Context.getDropBoxManager() = getSystemService(Context.DROPBOX_SERVICE) as DropBoxManager

/**
 * get UiMode Manager
 */
fun Context.getUiModeManager() = getSystemService(Context.UI_MODE_SERVICE) as UiModeManager

/**
 * get Download Manager
 */
fun Context.getDownloadManager() = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

/**
 * get Storage Manager
 */
fun Context.getStorageManager() = getSystemService(Context.STORAGE_SERVICE) as StorageManager

/**
 * get NFC manager
 */
fun Context.getNfcManager() = getSystemService(Context.NFC_SERVICE) as NfcManager

/**
 * get USB Manager
 */
fun Context.getUsbManager() = getSystemService(Context.USB_SERVICE) as UsbManager

/**
 * get TextService Manager
 */
fun Context.getTextServicesManager() = getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE) as TextServicesManager

/**
 * get WiFI P2P Manager
 */
fun Context.getWifiP2pManager() = getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager

/**
 * get Input Manager
 */
fun Context.getInputManager() = getSystemService(Context.INPUT_SERVICE) as InputManager

/**
 * get Media Router
 */
fun Context.getMediaRouter() = getSystemService(Context.MEDIA_ROUTER_SERVICE) as MediaRouter

/**
 * get MSD Manager
 */
fun Context.getNsdManager() = getSystemService(Context.NSD_SERVICE) as NsdManager

/**
 * get Display manager
 */
fun Context.getDisplayManager() = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager

/**
 * get UserManager
 */
fun Context.getUserManager() = getSystemService(Context.USER_SERVICE) as UserManager

/**
 * get BlueTooth Manager
 */
fun Context.getBluetoothManager() = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
