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

package com.amnix.xtension.extras

import android.app.Activity
import android.graphics.PorterDuff
import android.os.Handler
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.core.view.ViewCompat
import com.amnix.xtension.R
import com.amnix.xtension.extensions.castTo
import com.amnix.xtension.extensions.getRootView

internal class AmniXSnack(activity: Activity) {

    private var snackView: View? = null
    private var rlvHost: RelativeLayout? = null
    private var btnAction: Button? = null
    private var txtMessage: TextView? = null

    init {
        this.initializeKSnackBar(activity)
    }


    private fun initializeKSnackBar(activity: Activity) {

        snackView = activity.layoutInflater.inflate(R.layout.layout_snack, null)
        snackView?.let { snackView ->
            snackView.alpha = 0f
            ViewCompat.setTranslationZ(snackView, 999f)
            activity.getRootView()?.castTo(ViewGroup::class.java)?.addView(
                snackView,
                1,
                ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            )
            rlvHost = snackView.findViewById(R.id.normal_snack_bar_rlv)
            txtMessage = snackView.findViewById(R.id.snack_bar_txt_message)
            btnAction = snackView.findViewById(R.id.snack_bar_btn_action)
            btnAction?.setOnClickListener {
                dismiss()
            }
        }


    }

    internal fun setMessage(message: String): AmniXSnack {
        txtMessage!!.text = message
        return this
    }

    internal fun setDuration(millisecond: Long): AmniXSnack {
        Handler().postDelayed({ dismiss() }, millisecond)
        return this
    }

    internal fun setAction(buttonText: String, clickListener: (View?) -> Unit): AmniXSnack {
        btnAction!!.text = buttonText
        btnAction!!.setOnClickListener {
            dismiss()
            clickListener.invoke(it)
        }
        return this
    }

    internal fun setBackColor(@ColorInt colorInt: Int): AmniXSnack {
        rlvHost!!.background.setColorFilter(colorInt, PorterDuff.Mode.SRC)
        return this
    }

    internal fun setTextColor(@ColorInt colorInt: Int): AmniXSnack {
        txtMessage!!.setTextColor(colorInt)
        return this
    }

    internal fun show() {
        snackView?.animate()?.alpha(1f)?.interpolator = AccelerateInterpolator()
    }

    private fun dismiss() {
        snackView?.animate()?.alpha(0f)?.interpolator = AccelerateInterpolator()
    }
}