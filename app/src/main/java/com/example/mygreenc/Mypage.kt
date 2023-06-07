package com.example.mygreenc

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Mypage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        val Home = findViewById<ImageButton>(R.id.Home)

        Home.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}