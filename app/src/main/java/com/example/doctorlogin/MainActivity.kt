package com.example.doctorlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

        val buttonSignup = findViewById<Button>(R.id.buttonSignup)
        buttonSignup.setOnClickListener {
            //open signup page
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}

