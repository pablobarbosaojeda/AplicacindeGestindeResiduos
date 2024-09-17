package com.example.aplicacindegestinderesiduos

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.aplicacindegestinderesiduos.R.*
import com.example.aplicacindegestinderesiduos.ui.theme.StatisticsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val buttonRecycle: Button = findViewById(id.btnMap)
        val buttonCalendar: Button = findViewById(id.btnCalendar)
        val buttonStatistics: Button = findViewById(id.btnStatistics)

        buttonRecycle.setOnClickListener {
            //val intent = Intent(this, RecycleActivity::class.java)
            //startActivity(intent)
        }

        buttonCalendar.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        buttonStatistics.setOnClickListener {
            //val intent = Intent(this, StatisticsActivity::class.java)
            //startActivity(intent)
            }
        }
}