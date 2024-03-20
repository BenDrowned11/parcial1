package com.example.applicationcitas
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CitaReservadaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cita_reservada2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        btnAceptar.setOnClickListener {
            gotoAceptar()
        }
        val btncancelar = findViewById<Button>(R.id.btnCancelar)
        btncancelar.setOnClickListener {
            gotoCancelar()
        }

        val selectedSpecialty = intent.getStringExtra("selectedSpecialty")
        val selectedDoctor = intent.getStringExtra("selectedDoctor")
        val selectedDate = intent.getStringExtra("selectedDate")
        findViewById<TextView>(R.id.textViewEspecialidadValue)?.text = selectedSpecialty
        findViewById<TextView>(R.id.textViewMedicoValue)?.text = selectedDoctor
        findViewById<TextView>(R.id.fecha)?.text = selectedDate
    }

    private fun gotoAceptar() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
    private fun gotoCancelar() {
        val intent = Intent(this, CitacanceladaActivity::class.java)
        startActivity(intent)
    }
}
