package com.example.mylibrary

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.example.mylibrary.MyTextView.Companion.DEFAULT_TEXT_SIZE_SP


class MyTextView : AppCompatTextView {
    companion object {
        private const val DEFAULT_TEXT_SIZE_SP = 20f
        private const val DEFAULT_TEXT_COLOR = android.R.color.holo_red_dark
    }
    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(context!!,
        attrs,
        defStyle) {
        init()
    }



    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs) {
        init()
    }

    constructor(context: Context?) : super(context!!) {
        init()
    }

    private fun init() {
        text = "This is a textView from Package"
        textSize = MyTextView.DEFAULT_TEXT_SIZE_SP

        // Set default text color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            setTextColor(context.getColor(MyTextView.DEFAULT_TEXT_COLOR))
        }
    }
}