package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val ll = LinearLayout(this)
//        ll.orientation = LinearLayout.VERTICAL
//        ll.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
//            LinearLayout.LayoutParams.MATCH_PARENT)
//        ll.gravity = LinearLayout.TEXT_ALIGNMENT_CENTER
//
//
//        // add TextView
//        val showTextInput = TextView(this)
//        showTextInput.text = "Hello Guys"
//
//        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
//            LinearLayout.LayoutParams.WRAP_CONTENT)
//        showTextInput.layoutParams = layoutParams
//        layoutParams.setMargins(20, 20, 20, 20)
//        layoutParams.gravity = LinearLayout.VERTICAL
//        showTextInput.textSize = 16f
//        showTextInput.setPadding(5, 3, 0, 3)
//        ll.addView(showTextInput)


        val layout = findViewById<RelativeLayout>(R.id.root)

        // Create TextView programmatically.
        val textView = TextView(this)

        // setting height and width
        textView.layoutParams= RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        // setting text
        textView.setText("GEEKSFORGEEKS")
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
        textView.setTextColor(Color.MAGENTA)
        // onClick the text a message will be displayed "HELLO GEEK"
        textView.setOnClickListener()
        {
            Toast.makeText(this@MainActivity, "HELLO GEEK",
                Toast.LENGTH_LONG).show()
        }

        // Add TextView to LinearLayout
        layout ?.addView(textView)
    }
}