package com.example.mygreenc

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val img1 = findViewById<ImageView>(R.id.bicycle)

        img1.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


        val img2 = findViewById<ImageView>(R.id.recycle)

        img2.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val img3 = findViewById<ImageView>(R.id.lunch)

        img3.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val img4 = findViewById<ImageView>(R.id.ecobag)

        img4.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val img5 = findViewById<ImageView>(R.id.bus)

        img5.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val img6 = findViewById<ImageView>(R.id.tum)

        img6.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val img7 = findViewById<ImageView>(R.id.tran)

        img7.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val img8 = findViewById<ImageView>(R.id.recycle)

        img8.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}