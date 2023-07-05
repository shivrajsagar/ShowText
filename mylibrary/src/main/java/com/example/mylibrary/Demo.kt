package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast


class Demo : Activity() {
    lateinit var context: Context
    companion object {

        fun  showText(context: Context?, Message: String?) {
            // create LinearLayout
            val ll = LinearLayout(context!!.applicationContext)
            ll.orientation = LinearLayout.VERTICAL
            ll.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
            ll.gravity = LinearLayout.TEXT_ALIGNMENT_CENTER


            // add TextView
            val showTextInput = TextView(context!!.applicationContext)
            showTextInput.text = Message

            val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
            showTextInput.layoutParams = layoutParams
            layoutParams.setMargins(20, 20, 20, 20)
            layoutParams.gravity = LinearLayout.VERTICAL
            showTextInput.textSize = 16f
            showTextInput.setPadding(5, 3, 0, 3)
            ll.addView(showTextInput)
        }
    }
}