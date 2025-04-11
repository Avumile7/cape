package com.example.mymovieapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeInput = findViewById<EditText>(R.id.editText)
        val mealSuggestion = findViewById<TextView>(R.id.entertimeoftheday)
        val suggestButton = findViewById<Button>(R.id.getmealsuggestion)
        val resetButton = findViewById<Button>(R.id.reset)

        suggestButton.setOnClickListener {
            val timeOfDay = timeInput.text.toString().trim().lowercase()

            val suggestion = when (timeOfDay) {
                "morning" -> "Oats or Weetbix"
                "mid-morning" -> "Fruit"
                "afternoon" -> "Bread and butter"
                "mid-afternoon" -> "Snacks"
                "dinner" -> "Samp and tomatoes"
                else -> "Invalid input! Please enter a valid meal time"
            }

            mealSuggestion.text = suggestion
        }

        resetButton.setOnClickListener {
            timeInput.text.clear()
            mealSuggestion.text = ""
        }
    }
}







