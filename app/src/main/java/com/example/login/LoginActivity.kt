package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val galleryButton = findViewById<Button>(R.id.L_btn_1)
        galleryButton.setOnClickListener{
            startActivity(Intent(this, GalleryActivity::class.java))
        }

    }
}
