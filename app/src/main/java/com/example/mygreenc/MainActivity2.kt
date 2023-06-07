package com.example.mygreenc

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore.ACTION_IMAGE_CAPTURE
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    lateinit var bitmap: Bitmap
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageView = findViewById(R.id.imageView2)
        val btn = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        btn.setOnClickListener {
            val intent : Intent = Intent(ACTION_IMAGE_CAPTURE)
            activitResult.launch(intent)
        }
        btn3.setOnClickListener {
            //토글 메세지 띄우기
            Toast.makeText(this, " 200원 적립 성공!", Toast.LENGTH_SHORT).show()

        }

    }
    private val activitResult: ActivityResultLauncher<Intent> = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
        if (result.resultCode == RESULT_OK) {
            bitmap = result.data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(bitmap)
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
        }
    }



}

