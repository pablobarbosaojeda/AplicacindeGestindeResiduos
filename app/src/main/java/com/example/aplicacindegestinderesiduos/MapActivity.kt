package com.example.aplicacindegestinderesiduos

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        // Imagen del mapa
        val imageView: ImageView = findViewById(R.id.myImageView)
        imageView.setImageResource(R.drawable.puntolimpiovillanueva) // Asegúrate de tener esta imagen en la carpeta drawable
    }
}
