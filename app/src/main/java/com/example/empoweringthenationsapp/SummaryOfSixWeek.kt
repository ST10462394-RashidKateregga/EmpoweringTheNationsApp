package com.example.empoweringthenationsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SummaryOfSixWeek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_summary_of_six_week)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val childMinding: Button = findViewById(R.id.ChildMindingButton)
        val cooking: Button = findViewById(R.id.CookingButton)
        val GardenButton: Button = findViewById(R.id.GardenButton)
        val HomeButton2: Button = findViewById(R.id.HomeButton2)

        childMinding.setOnClickListener {
            val intent = Intent(this, ChildMinding::class.java)
            startActivity(intent)
        }

        cooking.setOnClickListener {
            val intent = Intent(this, Cooking::class.java)
            startActivity(intent)
        }

        GardenButton.setOnClickListener {
            val intent = Intent(this, GardenMaintenance::class.java)
            startActivity(intent)
        }

        HomeButton2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}