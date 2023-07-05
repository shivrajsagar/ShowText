package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.util.TypedValue
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast


class Demo : Activity() {
    lateinit var context: Context
    companion object {

        fun  showText(context: Context?, Message: String?) {
         Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();
        }

        fun  showText1(context: Context?, view: View) {
            val llay1 = LinearLayout(context)

            val rlp2 = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT)
            rlp2.addRule(RelativeLayout.ALIGN_PARENT_TOP)
            rlp2.addRule(RelativeLayout.ALIGN_PARENT_LEFT)



            val textView = TextView(context)
            textView.layoutParams= rlp2;
            // setting text
            textView.setText("Hello")
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
            textView.setTextColor(Color.BLACK)
            llay1.addView(textView)





        }
    }
}