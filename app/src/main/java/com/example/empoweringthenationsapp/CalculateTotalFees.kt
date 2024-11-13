package com.example.empoweringthenationsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculateTotalFees : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_total_fees)

        // Define the checkboxes
        val checkboxSewing = findViewById<CheckBox>(R.id.checkbox_sewing)
        val checkboxLandscaping = findViewById<CheckBox>(R.id.checkbox_landscaping)
        val checkboxLifeSkills = findViewById<CheckBox>(R.id.checkbox_life_skills)
        val checkboxFirstAid = findViewById<CheckBox>(R.id.checkbox_first_aid)
        val checkboxCooking = findViewById<CheckBox>(R.id.checkbox_cooking)
        val checkboxGardenMaintenance = findViewById<CheckBox>(R.id.checkbox_garden_maintenance)
        val checkboxChildMinding = findViewById<CheckBox>(R.id.checkbox_child_minding)

        // Define the TextView for displaying fees
        val feesTextView = findViewById<TextView>(R.id.fees)

        // Define the EditTexts for user inputs
        val nameEditText = findViewById<EditText>(R.id.editTextText)
        val phoneEditText = findViewById<EditText>(R.id.editTextText2)
        val emailEditText = findViewById<EditText>(R.id.editTextText4)

        // Define the button to calculate fees
        val calculateButton = findViewById<Button>(R.id.button9)

        calculateButton.setOnClickListener {
            // Check for empty fields
            var valid = true

            if (nameEditText.text.isEmpty()) {
                nameEditText.error = "Please enter your name"
                valid = false
            }

            if (phoneEditText.text.isEmpty()) {
                phoneEditText.error = "Please enter your phone number"
                valid = false
            }

            if (emailEditText.text.isEmpty()) {
                emailEditText.error = "Please enter your email address"
                valid = false
            }

            // Only calculate fees if all fields are filled
            if (valid) {
                var totalFees = 0

                // Check which courses are selected and add their fees
                if (checkboxSewing.isChecked) totalFees += 1500
                if (checkboxLandscaping.isChecked) totalFees += 1500
                if (checkboxLifeSkills.isChecked) totalFees += 1500
                if (checkboxFirstAid.isChecked) totalFees += 1500
                if (checkboxCooking.isChecked) totalFees += 750
                if (checkboxGardenMaintenance.isChecked) totalFees += 750
                if (checkboxChildMinding.isChecked) totalFees += 750

                // Display the total fees in the TextView
                feesTextView.text = "Total Fees: R$totalFees"
            }
        }

        val backButton = findViewById<Button>(R.id.button10)

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
