import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import com.example.proyecto_smartsalud.R


//package com.example.proyecto_smartsalud

class ExerciseActivity : AppCompatActivity() {

    private lateinit var typeEditText: EditText
    private lateinit var durationEditText: EditText
    private lateinit var distanceEditText: EditText
    private lateinit var intensityEditText: EditText
    private lateinit var commentsEditText: EditText
    private lateinit var saveButton: Button
    private lateinit var cancelButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        // Vincular los campos de texto a las variables
        typeEditText = findViewById(R.id.type_edit_text)
        durationEditText = findViewById(R.id.duration_edit_text)
        distanceEditText = findViewById(R.id.distance_edit_text)
        intensityEditText = findViewById(R.id.intensity_edit_text)
        commentsEditText = findViewById(R.id.comments_edit_text)

        // Obtener los botones
        saveButton = findViewById(R.id.save_button)
        cancelButton = findViewById(R.id.cancel_button)

        // Agregar un escuchador de clic al botón Guardar
        saveButton.setOnClickListener {
            // Obtener los datos del ejercicio
            val type = typeEditText.text.toString()
            val duration = durationEditText.text.toString().toLong()
            val distance = distanceEditText.text.toString().toDouble()
            val intensity = intensityEditText.text.toString()
            val comments = commentsEditText.text.toString()

            // Guardar el ejercicio en la base de datos
            // TODO: Implementar el guardado del ejercicio en la base de datos

            // Cerrar la actividad
            finish()
        }

        // Agregar un escuchador de clic al botón Cancelar
        cancelButton.setOnClickListener {
            finish()
        }
    }
}