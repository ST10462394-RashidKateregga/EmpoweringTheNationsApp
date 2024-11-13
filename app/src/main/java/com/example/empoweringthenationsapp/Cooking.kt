package com.example.empoweringthenationsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cooking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking)

        val backButtonCooking = findViewById<Button>(R.id.backButtonCooking)
        backButtonCooking.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val enrollButtonCooking= findViewById<Button>(R.id.enrollButtonCooking)
        enrollButtonCooking.setOnClickListener {
            val intent = Intent(this, CalculateTotalFees::class.java)
            startActivity(intent)
        }



    }


}