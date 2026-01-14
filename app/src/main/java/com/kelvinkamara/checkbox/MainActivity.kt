package com.kelvinkamara.checkbox

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var checkBoxKotlin: CheckBox
    private lateinit var checkBoxJava: CheckBox
    private lateinit var checkBoxPython: CheckBox
    private lateinit var textViewChoice: TextView
    private lateinit var showButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        checkBoxKotlin = findViewById(R.id.checkBoxKotlin)
        checkBoxJava = findViewById(R.id.checkBoxJava)
        checkBoxPython = findViewById(R.id.checkBoxPython)
        textViewChoice = findViewById(R.id.textViewChoice)
        showButton = findViewById(R.id.showButton)

        showButton.setOnClickListener {
            val sb = StringBuilder()
            sb.append(checkBoxKotlin.text.toString() + " status is: " +
                checkBoxKotlin.isChecked + "\n")
            sb.append(checkBoxJava.text.toString() + " status is: " +
                checkBoxJava.isChecked + "\n")
            sb.append(checkBoxPython.text.toString() + " status is: " +
                checkBoxPython.isChecked + "\n")

            textViewChoice.text = sb.toString()
        }
    }
}