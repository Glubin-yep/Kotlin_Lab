package com.example.kotlin_lab

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import java.util.Locale


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flagLayout = findViewById<LinearLayout>(R.id.flag_layout)
        val deviceLanguage = Locale.getDefault().language

        if (deviceLanguage == "fr") {
            layoutInflater.inflate(R.layout.france_flag, flagLayout)
        }
    }
}
