package com.example.aplicacindegestinderesiduos

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StatisticsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        val tvRecycled: TextView = findViewById(R.id.tvRecycled)
        val tvNonRecycled: TextView = findViewById(R.id.tvNonRecycled)

        // Sample data
        val recycled = 40f
        val nonRecycled = 60f

        tvRecycled.text = "Residuos reciclados: $recycled kg"
        tvNonRecycled.text = "Residuos no reciclados: $nonRecycled kg"
    }
}
