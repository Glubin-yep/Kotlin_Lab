package com.example.kotlin_lab

import android.app.Activity
import android.app.ListActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
private val PREFS_NAME = "MetroPickerPrefs"
private val SELECTED_STATION_KEY = "selectedStation"

class ListActivity : ListActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(applicationContext, intent.toString(), Toast.LENGTH_SHORT).show()

        val r = resources
        val stationsArray = r.getStringArray(R.array.stations)
        val aa = ArrayAdapter<String>(
            this,
            R.layout.list_item, stationsArray
        )
        listAdapter = aa
        val lv = getListView()

        lv.setOnItemClickListener { parent, view, position, id ->
            val selectedText = (view as TextView).text.toString()

            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("selectedText", selectedText)
            }

            startActivity(intent)
            saveSelectedStation(selectedText)
            setResult(Activity.RESULT_OK)
            finish()
        }
    }

    private fun saveSelectedStation(selectedStation: String) {
        val prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = prefs.edit()
        editor.putString(SELECTED_STATION_KEY, selectedStation)
        editor.apply()
    }
}