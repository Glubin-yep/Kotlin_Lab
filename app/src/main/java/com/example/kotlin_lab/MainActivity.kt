package com.example.kotlin_lab

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

private val PREFS_NAME = "MetroPickerPrefs"
private val SELECTED_STATION_KEY = "selectedStation"

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        Toast.makeText(applicationContext, intent.toString(), Toast.LENGTH_SHORT).show()
        val textView = findViewById<TextView>(R.id.textView)
        //textView.text = getSelectedStation()

       // val selectedText = intent.getStringExtra("selectedText")
       // textView.text = selectedText
    }
    fun onButtonClicked(view: View) {
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }
    private fun getSelectedStation(): String {
        val prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getString(SELECTED_STATION_KEY, "") ?: ""
    }

}