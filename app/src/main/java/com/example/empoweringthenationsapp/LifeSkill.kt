package com.example.empoweringthenationsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LifeSkill : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_life_skill)

        val lifeSkillsBackButton = findViewById<Button>(R.id.lifeSkillsBackButton)
        lifeSkillsBackButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val enrollButtonLifeSkills = findViewById<Button>(R.id.enrollButtonLifeSkills)
        enrollButtonLifeSkills.setOnClickListener {
            val intent = Intent(this, CalculateTotalFees::class.java)
            startActivity(intent)

        }
    }
}