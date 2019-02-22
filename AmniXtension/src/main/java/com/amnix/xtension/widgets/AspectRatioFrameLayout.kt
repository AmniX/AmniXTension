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

package com.amnix.xtension.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.amnix.xtension.R

/**
 * Aspect Ratio Frame Layout, Here to Set the Width Height Based on Aspect Ratio
 */
class AspectRatioFrameLayout : FrameLayout {
    var xRatio = DEFAULT_XRATIO
    var yRatio = DEFAULT_YRATIO
    constructor(context: Context) : super(context) {
        init(context, null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(context, attrs, defStyle)
    }

    private fun init(context: Context, attrs: AttributeSet?, defStyle: Int) {
        val a = context.theme.obtainStyledAttributes(attrs, R.styleable.AspectRatioFrameLayout, 0, 0)
        try {
            xRatio = a.getInt(R.styleable.AspectRatioFrameLayout_xRatio, DEFAULT_XRATIO)
            yRatio = a.getInt(R.styleable.AspectRatioFrameLayout_yRatio, DEFAULT_YRATIO)
        } finally {
            a.recycle()
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val widthMode = View.MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = View.MeasureSpec.getMode(heightMeasureSpec)

        val widthSize = View.MeasureSpec.getSize(widthMeasureSpec)
        val heightSize = View.MeasureSpec.getSize(heightMeasureSpec)

        if (widthMode == View.MeasureSpec.EXACTLY && (heightMode == View.MeasureSpec.AT_MOST || heightMode == View.MeasureSpec.UNSPECIFIED)) {
            setMeasuredDimension(widthSize, (widthSize.toDouble() / xRatio * yRatio).toInt())
        } else if (heightMode == View.MeasureSpec.EXACTLY && (widthMode == View.MeasureSpec.AT_MOST || widthMode == View.MeasureSpec.UNSPECIFIED)) {
            setMeasuredDimension((heightSize.toDouble() / yRatio * xRatio).toInt(), heightSize)
        } else {
            super.setMeasuredDimension(widthMeasureSpec, heightMeasureSpec)
        }
    }

    companion object {

        private val DEFAULT_XRATIO = 1

        private val DEFAULT_YRATIO = 1
    }
}