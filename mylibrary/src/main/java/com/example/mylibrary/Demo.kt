package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast


class Demo : Activity() {
    lateinit var context: Context
    companion object {

        fun  showText(context: Context?, Message: String?) {
            // create LinearLayout
//            val layout = findViewById<RelativeLayout>(R.id.root)

            // Create TextView programmatically.
            val textView = TextView(context)

            // setting height and width
            textView.layoutParams= RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
            // setting text
            textView.setText("GEEKSFORGEEKS")
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
            textView.setTextColor(Color.MAGENTA)
            // onClick the text a message will be displayed "HELLO GEEK"
//            textView.setOnClickListener()
//            {
//                Toast.makeText(context, "HELLO GEEK",
//                    Toast.LENGTH_LONG).show()
//            }

            // Add TextView to LinearLayout
//            layout ?.addView(textView)
        }
    }
}