package com.example.login

import ImageAdapter
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class GalleryActivity : AppCompatActivity() {
    private lateinit var gridView: GridView
    private val imageList = arrayOf(
        R.drawable.gambar1,
        R.drawable.onepiece,
        R.drawable.logo
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gallery)

        gridView = findViewById(R.id.gridView)
        val adapter = ImageAdapter(this, imageList)
        gridView.adapter = adapter
    }
}