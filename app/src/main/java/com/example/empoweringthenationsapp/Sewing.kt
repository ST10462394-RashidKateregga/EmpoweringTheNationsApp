package com.example.empoweringthenationsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sewing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sewing)

        val sewingBackButton = findViewById<Button>(R.id.sewingBackButton)
        sewingBackButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val enrollButtonSewing = findViewById<Button>(R.id.enrollButtonSewing)
        enrollButtonSewing.setOnClickListener {
            val intent = Intent(this, CalculateTotalFees::class.java)
            startActivity(intent)
        }
    }
}