package com.example.mygreenc

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Mypage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        val Home = findViewById<ImageButton>(R.id.Home)
        val uni = findViewById<Button>(R.id.uni)
        val save = findViewById<Button>(R.id.save)
        val count = findViewById<TextView>(R.id.count)
        var counter = 8600

        uni.setOnClickListener {
            //토글 메세지 띄우기
            Toast.makeText(this, " 1000원 기부하셨습니다.", Toast.LENGTH_SHORT).show()
            counter-=1000

            count.text = counter.toString()

        }
        save.setOnClickListener {

            Toast.makeText(this, " 1000원 기부하셨습니다.", Toast.LENGTH_SHORT).show()
            counter-=1000
            count.text = counter.toString()

        }


        Home.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}