package com.example.empoweringthenationsapp

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Reference the dropdown menu (Spinner)
        val optionsSpinner: Spinner = findViewById(R.id.optionsSpinner)

        // List of options for the dropdown
        val options = arrayOf(
            "Select an Option",
            "Six Week Course",
            "Six Month Course",
            "Contact Details"
        )

        // Create an ArrayAdapter for the Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        optionsSpinner.adapter = adapter

        // Set a listener for item selection
        optionsSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) {
                when (position) {
                    1 -> { // Six Week Course
                        val intent = Intent(this@MainActivity, SummaryOfSixWeek::class.java)
                        startActivity(intent)
                    }
                    2 -> { // Six Month Course
                        val intent = Intent(this@MainActivity, SummaryOfSixMonthCourse::class.java)
                        startActivity(intent)
                    }
                    3 -> { // Contact Details
                        val intent = Intent(this@MainActivity, Contact::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }
    }
}
