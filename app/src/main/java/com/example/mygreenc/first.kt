package com.example.mygreenc

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Handler().postDelayed({ setContentView(R.layout.activity_main) }, 5000)
    }
}