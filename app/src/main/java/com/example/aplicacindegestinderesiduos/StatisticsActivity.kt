package com.example.aplicacindegestinderesiduos

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StatisticsActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        val pieChartView: PieChartView = findViewById(R.id.viewPieChart)
        val tvRecycled: TextView = findViewById(R.id.tvRecycled)
        val tvNonRecycled: TextView = findViewById(R.id.tvNonRecycled)

        // Sample data
        val recycled = 40f
        val nonRecycled = 60f

        pieChartView.setData(recycled, nonRecycled)
        tvRecycled.text = "Residuos reciclados: $recycled kg"
        tvNonRecycled.text = "Residuos no reciclados: $nonRecycled kg"
    }
}
