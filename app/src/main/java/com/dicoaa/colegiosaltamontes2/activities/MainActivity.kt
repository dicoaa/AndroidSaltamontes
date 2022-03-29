package com.dicoaa.colegiosaltamontes2.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.dicoaa.colegiosaltamontes2.R
import com.dicoaa.colegiosaltamontes2.clases.Operaciones

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarComponentes()

    }

    private fun iniciarComponentes() {
        val btnRegistro: Button = findViewById(R.id.btnRegistro)
        btnRegistro.setOnClickListener { onClick(1) }

        val btnEstadistica: Button = findViewById(R.id.btnEstadistica)
        btnEstadistica.setOnClickListener { onClick(2) }

        val btnAyuda: Button = findViewById(R.id.btnAyuda)
        btnAyuda.setOnClickListener { onClick(3) }
    }

    private fun onClick(boton: Int) {
        when(boton){
            1 -> { startActivity(Intent(this, ActivityRegistro::class.java)) }
            2 -> { startActivity(Intent(this, ActivityEstadistica::class.java)) }
            3 -> { startActivity(Intent(this, ActivityAyuda::class.java)) }
        }
    }
}