package com.example.proyecto_smartsalud

import ExerciseActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Crear un botón para abrir la pantalla de registro de ejercicios
        val button = findViewById<Button>(R.id.register_exercise_button)
        button.setOnClickListener {
            // Abrir la pantalla de registro de ejercicios
            startActivity(Intent(this, ExerciseActivity::class.java))
        }
    }
}
