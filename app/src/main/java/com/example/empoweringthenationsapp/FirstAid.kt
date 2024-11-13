package com.example.empoweringthenationsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FirstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_aid)

        val firstAidBackButton = findViewById<Button>(R.id.firstAidHomepageButton)
        firstAidBackButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

            val enrollButtonFirstAid = findViewById<Button>(R.id.enrollButtonFirstAid)
            enrollButtonFirstAid.setOnClickListener {
                val intent = Intent(this,CalculateTotalFees::class.java)
                startActivity(intent)
            }



        }
    }
