package com.example.kotlin_lab

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView = findViewById<TextView>(R.id.greetingTextView)
        greetingTextView.text = getString(R.string.hello_android)

        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show()
    }
}