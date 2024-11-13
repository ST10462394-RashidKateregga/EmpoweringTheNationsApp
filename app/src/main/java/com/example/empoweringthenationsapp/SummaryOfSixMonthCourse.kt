package com.example.empoweringthenationsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SummaryOfSixMonthCourse: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_summary_of_six_month_course)


        val firstAidHomepageButton = findViewById<Button>(R.id.firstAidHomepageButton)
        firstAidHomepageButton.setOnClickListener {
            val intent = Intent(this,FirstAid::class.java)
            startActivity(intent)
        }

        val sewingHomepageButton = findViewById<Button>(R.id.sewingHomepageButton)
        sewingHomepageButton.setOnClickListener {
            val intent = Intent(this, Sewing::class.java)
            startActivity(intent)
        }

        val landscapingHomepageButton = findViewById<Button>(R.id.landscapingHomepageButton)
        landscapingHomepageButton.setOnClickListener {
            val intent = Intent(this,LandScaping::class.java)
            startActivity(intent)
        }

        val lifeSkillsHomepageButton = findViewById<Button>(R.id.lifeSkillsHomepageButton)
        lifeSkillsHomepageButton.setOnClickListener {
            val intent = Intent(this, LifeSkill::class.java)
            startActivity(intent)
        }

        val homePageBackButton = findViewById<Button>(R.id.homePageBackButton)
        homePageBackButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}