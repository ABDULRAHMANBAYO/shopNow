package com.example.shopnow

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
        val signUpText :TextView = findViewById(R.id.dontHaveAccount)
        signUpText.setOnClickListener {
        startActivity(Intent(this,SignUpActivity::class.java))
        }

    }
}