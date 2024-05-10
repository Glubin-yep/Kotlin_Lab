package com.example.kotlin_lab

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class StudentsActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout from XML
        val contentText = getString(R.string.tab1_content)

        // Create a TextView programmatically
        val textView = TextView(this)
        textView.text = contentText

        // Set the TextView as the content view
        setContentView(textView)
    }
}