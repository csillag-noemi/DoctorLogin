package com.example.doctorlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat_Light_NoActionBar)
        setContentView(R.layout.activity_signup)

        val mainSignupBtn = findViewById<Button>(R.id.mainSignupBtn)
        mainSignupBtn.setOnClickListener {
            Toast.makeText(this@SignupActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }


}