package com.example.empoweringthenationsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LandScaping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_land_scaping)

        val landscapingBackButton = findViewById<Button>(R.id.landscapingBackButton)
        landscapingBackButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

            val enrollButtonLandscaping = findViewById<Button>(R.id.enrollButtonLandscaping)
            enrollButtonLandscaping.setOnClickListener {
                val intent = Intent(this, CalculateTotalFees::class.java)
                startActivity(intent)
            }
        }
    }

