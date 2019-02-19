package com.amnix.utils.extensions

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

/**
 * Add TextChangedListener Instead Of Full TextWatcher to get Callback OnTextChange
 */
fun EditText.setOnTextChangedListener(listener: (String) -> (Unit)) {

    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {}

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            listener(s.toString())
        }
    })
}
/**
 * Add AfterTextChangedListener Instead Of Full TextWatcher to get Callback After OnTextChange
 */
fun EditText.setAfterTextChangedListener(listener: (String) -> (Unit)) {
    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            listener(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    })
}
/**
 * Add BeforeTextChangedListener Instead Of Full TextWatcher to get Callback Before OnTextChange
 */
fun EditText.setBeforeTextChangedListener(listener: (String) -> (Unit)) {
    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {}

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            listener(s.toString())
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    })
}