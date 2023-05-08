package com.example.letschat_morningfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogIn : AppCompatActivity() {
    lateinit var buttonsignup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        buttonsignup = findViewById(R.id.btn_signup)

        buttonsignup.setOnClickListener {
            val intent= Intent(this, SignUp::class.java)
            startActivity(intent)
        }

    }
}