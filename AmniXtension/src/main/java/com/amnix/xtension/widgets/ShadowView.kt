package com.amnix.xtension.widgets

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.View
import com.amnix.xtension.R

class ShadowView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        parseAttr(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        parseAttr(context, attrs)
    }

    private fun parseAttr(context: Context, attributeSet: AttributeSet) {
        val a = context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.ShadowView,
            0, 0
        )
        init(
            GradientDrawable.Orientation.values()[a.getInteger(R.styleable.ShadowView_angle, 0)],
            a.getColor(R.styleable.ShadowView_startColor, Color.TRANSPARENT),
            a.getColor(R.styleable.ShadowView_endColor, Color.TRANSPARENT)
        )
        a.recycle()
    }

    private fun init(orientation: GradientDrawable.Orientation, startColor: Int, endColor: Int) {
        val oldBackground = background
        if (oldBackground == null)
            background = GradientDrawable(orientation, intArrayOf(startColor, endColor))
        else if (oldBackground is GradientDrawable) {
            oldBackground.colors = intArrayOf(startColor, endColor)
            oldBackground.orientation = orientation
        }
    }
}