package com.example.aplicacindegestinderesiduos

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.aplicacindegestinderesiduos.R.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val buttonRecycle: Button = findViewById(id.btnMap)
        val buttonCalendar: Button = findViewById(id.btnCalendar)
        val buttonStatistics: Button = findViewById(id.btnStatistics)

        // Manejar el clic del botón para abrir el mapa
        buttonRecycle.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }

        // Manejar el clic del botón para abrir el calendario
        buttonCalendar.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        // Manejar el clic del botón para abrir las estadísticas
        buttonStatistics.setOnClickListener {
            val intent = Intent(this, StatisticsActivity::class.java)
            startActivity(intent)
        }
    }
}
