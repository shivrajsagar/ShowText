package com.example.mylibrary

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CustomTextView(context: Context) : AppCompatTextView(context) {
    companion object {
        private const val DEFAULT_TEXT_SIZE_SP = 14f
        private const val DEFAULT_TEXT_COLOR = android.R.color.holo_red_dark
    }

    init {
        // Set default text size
        setText("Hello")
        setTextSize(DEFAULT_TEXT_SIZE_SP)

        // Set default text color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            setTextColor(context.getColor(DEFAULT_TEXT_COLOR))
        }
    }

}