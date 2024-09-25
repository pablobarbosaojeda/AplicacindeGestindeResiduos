package com.example.aplicacindegestinderesiduos

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MapActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_map)

        val imageView: ImageView = findViewById(R.id.myImageView)
        imageView.setImageResource(R.drawable.puntolimpiovillanueva)

    }
}