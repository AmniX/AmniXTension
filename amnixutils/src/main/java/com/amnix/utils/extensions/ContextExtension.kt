package com.amnix.utils.extensions

import android.Manifest
import android.accounts.AccountManager
import android.app.*
import android.app.admin.DevicePolicyManager
import android.bluetooth.BluetoothManager
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
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
import android.os.DropBoxManager
import android.os.PowerManager
import android.os.UserManager
import android.os.Vibrator
import android.os.storage.StorageManager
import android.provider.MediaStore
import android.provider.Settings
import android.support.annotation.RequiresPermission
import android.support.v4.content.ContextCompat
import android.telephony.TelephonyManager
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager
import android.widget.Toast
import com.amnix.utils.enums.ContentColumns
import com.amnix.utils.enums.ContentOrder
import java.io.File

inline val Context.screenWidth: Int
    get() = resources.displayMetrics.widthPixels

inline val Context.screenHeight: Int
    get() = resources.displayMetrics.heightPixels

fun Context.showToast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

fun Context.showToastHard(msg: String) = AlertDialog.Builder(this).setMessage(msg).show()

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

fun Context.showSinglePicker(choices: Array<String>, onResponse: (index: Int) -> Unit, checkedItemIndex: Int = -1) =
    AlertDialog.Builder(this).setSingleChoiceItems(choices, checkedItemIndex) { dialog, which ->
        onResponse(which)
        dialog.dismiss()
    }.show()

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

fun Context.isGPSEnable(): Boolean = getLocationManager().isProviderEnabled(LocationManager.GPS_PROVIDER)

@RequiresPermission(Manifest.permission.ACCESS_NETWORK_STATE)
fun Context.isNetworkAvailable(): Boolean {
    val info = getConnectivityManager().activeNetworkInfo
    return info != null && info.isConnected
}

fun Context.requestMediaScanner(url: String) {
    val mediaScanIntent = Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE)
    val contentUri = Uri.fromFile(File(url))
    mediaScanIntent.data = contentUri
    this.sendBroadcast(mediaScanIntent)
}

@RequiresPermission(Manifest.permission.VIBRATE)
fun Context.vibrate(millis: Long) = getVibrator().vibrate(millis)

fun Context.checkSelfPermissions(vararg permissions: String): Boolean {
    permissions.forEach {
        if (ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED)
            return false
    }
    return true
}

fun Context.isIntentResolvable(intent: Intent) =
    packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY).isNotEmpty()

fun Context.startApp(pName: String) =
    if (isAppInstalled(pName)) startActivity(packageManager.getLaunchIntentForPackage(pName)) else {
    }

fun Context.isAppInstalled(packageName: String): Boolean {
    return try {
        packageManager.getApplicationInfo(packageName, 0)
        true
    } catch (ignore: Exception) {
        false
    }
}

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

fun Context.getAndroidID() = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
fun Context.getDeviceID() = getAndroidID()
@RequiresPermission(Manifest.permission.READ_PHONE_STATE)
fun Context.getIMEI(slot: Int = -1) = getTelephonyManager().deviceId

fun Context.startActivity(cls: Class<out Activity>) = startActivity(Intent(this, cls))
fun Context.startService(cls: Class<out Service>) = startService(Intent(this, cls))
fun Context.getActivityManager() = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
fun Context.getAlarmManager() = getSystemService(Context.ALARM_SERVICE) as AlarmManager
fun Context.getAudioManager() = getSystemService(Context.AUDIO_SERVICE) as AudioManager
fun Context.getClipboardManager() = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
fun Context.getConnectivityManager() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
fun Context.getKeyguardManager() = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager
fun Context.getLayoutInflater() = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
fun Context.getLocationManager() = getSystemService(Context.LOCATION_SERVICE) as LocationManager
fun Context.getNotificationManager() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
fun Context.getPowerManager() = getSystemService(Context.POWER_SERVICE) as PowerManager
fun Context.getSearchManager() = getSystemService(Context.SEARCH_SERVICE) as SearchManager
fun Context.getSensorManager() = getSystemService(Context.SENSOR_SERVICE) as SensorManager
fun Context.getTelephonyManager() = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
fun Context.getVibrator() = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
fun Context.getWifiManager() = getApplicationContext().getSystemService(Context.WIFI_SERVICE) as WifiManager
fun Context.getWindowManager() = getSystemService(Context.WINDOW_SERVICE) as WindowManager
fun Context.getInputMethodManager() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
fun Context.getAccessibilityManager() = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
fun Context.getAccountManager() = getSystemService(Context.ACCOUNT_SERVICE) as AccountManager
fun Context.getDevicePolicyManager() = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
fun Context.getDropBoxManager() = getSystemService(Context.DROPBOX_SERVICE) as DropBoxManager
fun Context.getUiModeManager() = getSystemService(Context.UI_MODE_SERVICE) as UiModeManager
fun Context.getDownloadManager() = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
fun Context.getStorageManager() = getSystemService(Context.STORAGE_SERVICE) as StorageManager
fun Context.getNfcManager() = getSystemService(Context.NFC_SERVICE) as NfcManager
fun Context.getUsbManager() = getSystemService(Context.USB_SERVICE) as UsbManager
fun Context.getTextServicesManager() = getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE) as TextServicesManager
fun Context.getWifiP2pManager() = getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager
fun Context.getInputManager() = getSystemService(Context.INPUT_SERVICE) as InputManager
fun Context.getMediaRouter() = getSystemService(Context.MEDIA_ROUTER_SERVICE) as MediaRouter
fun Context.getNsdManager() = getSystemService(Context.NSD_SERVICE) as NsdManager
fun Context.getDisplayManager() = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
fun Context.getUserManager() = getSystemService(Context.USER_SERVICE) as UserManager
fun Context.getBluetoothManager() = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
