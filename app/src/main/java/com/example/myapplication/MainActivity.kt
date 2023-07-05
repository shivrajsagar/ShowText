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

        val layout = findViewById<RelativeLayout>(R.id.root)

        // Create TextView programmatically.
        val llay1 = LinearLayout(this)
        llay1.layoutParams= LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        val rlp2 = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT)


        val textView = TextView(this)
        textView.layoutParams= rlp2;
        // setting text
        textView.setText("Hello")
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
        textView.setTextColor(Color.BLACK)
        llay1.addView(textView)
    }
}