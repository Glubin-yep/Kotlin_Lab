package com.example.kotlin_lab

import android.app.Activity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import android.widget.ToggleButton


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val userName = findViewById<EditText>(R.id.user_name)
        userName.setOnKeyListener { v, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                Toast.makeText(applicationContext, userName.text, Toast.LENGTH_SHORT).show()
                return@setOnKeyListener true
            }
            false
        }
    }

    fun onButtonClicked(view: View) {
        Toast.makeText(this, "Кнопка нажата", Toast.LENGTH_SHORT).show()
    }

    fun onCheckboxClicked(view: View) {
        if ((view as CheckBox).isChecked) {
            Toast.makeText(this, "Відмічено", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(
                this, "Не відмічено",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
    fun onToggleClicked(view: View) {
        if ((view as ToggleButton).isChecked) {
            Toast.makeText(this, "Ввівккнено", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Вимкнено", Toast.LENGTH_SHORT).show()
        }
    }
    fun onRadioButtonClicked(view: View) {
        val rb = view as RadioButton
        Toast.makeText(
            this, "Вибраний звір: " + rb.getText(),
            Toast.LENGTH_SHORT
        ).show()
    }


    fun onClearButtonClicked(view: View) {
        val userNameEditText = findViewById<EditText>(R.id.user_name)
        userNameEditText.setText("")
    }

}