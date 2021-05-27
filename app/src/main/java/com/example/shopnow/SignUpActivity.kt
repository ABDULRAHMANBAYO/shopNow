package com.example.shopnow

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val backButton: ImageButton = findViewById(R.id.signUpBackButton)
        backButton.setOnClickListener {
            finish()
        }
        val signUpText : TextView = findViewById(R.id.alredyHaveAnAccount)
        signUpText.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
    }
}