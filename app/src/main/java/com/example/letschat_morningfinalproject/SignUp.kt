package com.example.letschat_morningfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    lateinit var buttonlogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        buttonlogin = findViewById(R.id.btn_login)

        buttonlogin.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)

            startActivity(intent)
        }
    }
}