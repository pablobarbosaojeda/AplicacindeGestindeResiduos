package com.example.aplicacindegestinderesiduos

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class MapActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.puntolimpiovillanueva)

    }
}