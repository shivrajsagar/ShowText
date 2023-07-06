package com.example.mylibrary

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView


class MyTextView : AppCompatTextView {
    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(context!!,
        attrs,
        defStyle) {
        init()
    }

    companion object {
        private const val DEFAULT_TEXT_SIZE_SP = 14f
        private const val DEFAULT_TEXT_COLOR = android.R.color.holo_red_dark
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs) {
        init()
    }

    constructor(context: Context?) : super(context!!) {
        init()
    }

    private fun init() {
        text = "blablabla"
        setTextSize(CustomTextView.DEFAULT_TEXT_SIZE_SP)

        // Set default text color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            setTextColor(context.getColor(CustomTextView.DEFAULT_TEXT_COLOR))
        }
    }
}