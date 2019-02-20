[amnixutils](../../index.md) / [com.amnix.utils.extensions](../index.md) / [android.app.Activity](./index.md)

### Extensions for android.app.Activity

| Name | Summary |
|---|---|
| [getNavigationBarSize](get-navigation-bar-size.md) | `fun Activity.getNavigationBarSize(context: Context): Point`<br>Returns the NavigationBar Height in Pixels |
| [getRootView](get-root-view.md) | `fun Activity.getRootView(): View?`<br>get #rootVIew of the Activity |
| [getStatusBarHeight](get-status-bar-height.md) | `fun Activity.getStatusBarHeight(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the StatusBarHeight in Pixels |
| [onViewInflated](on-view-inflated.md) | `fun Activity.onViewInflated(onInflated: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>add an Callback to ViewTreeObserver which let the developer know when contentView is inflated to the Activity Content |
| [setNavigationBarColor](set-navigation-bar-color.md) | `fun Activity.setNavigationBarColor(color: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set Navigation Bar Color if Build.VERSION.SDK_INT &gt;= Build.VERSION_CODES.LOLLIPOP |
| [setNavigationBarDividerColor](set-navigation-bar-divider-color.md) | `fun Activity.setNavigationBarDividerColor(color: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set Navigation Bar Divider Color if Build.VERSION.SDK_INT &gt;= Build.VERSION_CODES.P |
| [setStatusBarColor](set-status-bar-color.md) | `fun Activity.setStatusBarColor(color: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set Status Bar Color if Build.VERSION.SDK_INT &gt;= Build.VERSION_CODES.LOLLIPOP |
| [startActivityForResults](start-activity-for-results.md) | `fun Activity.startActivityForResults(cls: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<out Activity>, requestCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, extra: Bundle? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>startsActivityForResult With a Class Name and Extra Data Followed by RequestCode |
