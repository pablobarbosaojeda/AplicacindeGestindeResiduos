package com.example.aplicacindegestinderesiduos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aplicacindegestinderesiduos.ui.theme.AplicaciónDeGestiónDeResiduosTheme
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {

    private var selectedDate: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val calendarView: CalendarView = findViewById(R.id.calendarView)
        val buttonMarkRecycle: Button = findViewById(R.id.buttonMarkRecycle)
        val buttonAddReminder: Button = findViewById(R.id.buttonAddReminder)

        // Inicializar la fecha seleccionada con la fecha actual del calendario
        selectedDate = getCurrentDateFromCalendarView(calendarView)

        // Capturar la fecha seleccionada
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            selectedDate = "$dayOfMonth/${month + 1}/$year"
            Toast.makeText(this, "Fecha seleccionada: $selectedDate", Toast.LENGTH_SHORT).show()
        }

        // Botón para marcar reciclaje
        buttonMarkRecycle.setOnClickListener {
            Toast.makeText(this, "Reciclaje marcado para el $selectedDate", Toast.LENGTH_SHORT).show()
            // Aquí puedes guardar esta información en una base de datos o preferencia compartida
        }

        // Botón para añadir recordatorio
        buttonAddReminder.setOnClickListener {
            Toast.makeText(this, "Recordatorio añadido para el $selectedDate", Toast.LENGTH_SHORT).show()
            // Aquí puedes implementar la lógica para agregar un recordatorio
        }
    }

    // Función para obtener la fecha actual del CalendarView
    private fun getCurrentDateFromCalendarView(calendarView: CalendarView): String {
        val year = android.text.format.DateFormat.format("yyyy", calendarView.date).toString()
        val month = android.text.format.DateFormat.format("MM", calendarView.date).toString()
        val day = android.text.format.DateFormat.format("dd", calendarView.date).toString()
        return "$day/$month/$year"
    }
}