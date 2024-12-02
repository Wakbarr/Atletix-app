package com.example.bangkittugas2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("title")
        val imageRes = intent.getIntExtra("imageRes", 0)
        val description = intent.getStringExtra("description")

        val imageView: ImageView = findViewById(R.id.ivDetailImage)
        val titleView: TextView = findViewById(R.id.tvDetailTitle)
        val descriptionView: TextView = findViewById(R.id.tvDetailDescription)

        imageView.setImageResource(imageRes)
        titleView.text = title
        descriptionView.text = description
    }
}