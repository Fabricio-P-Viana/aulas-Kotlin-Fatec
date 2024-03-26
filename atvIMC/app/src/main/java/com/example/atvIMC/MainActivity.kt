package com.example.socorroalguemexcluaandroidstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var editTextPeso: EditText

    private lateinit var editTextAltura: EditText

    private lateinit var buttonCalcular: Button

    private lateinit var textViewResultado: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        editTextPeso = findViewById(R.id.peso)

        editTextAltura = findViewById(R.id.altura)

        buttonCalcular = findViewById(R.id.button)

        textViewResultado = findViewById(R.id.resultado)

        buttonCalcular.setOnClickListener {

            val pesoText = editTextPeso.text.toString()

            val alturaText = editTextAltura.text.toString()

            val Peso = pesoText.toDouble()

            val Altura = alturaText.toDouble()

            val IMC = calcuIarIMC(Peso, Altura)
            val imcFormatted = String.format("%.2f", IMC)
            textViewResultado.text = "Seu IMC é: $imcFormatted"

        }

    }

    private fun calcuIarIMC(peso: Double, altura: Double): Double {
        return peso / (altura * altura)
    }
}