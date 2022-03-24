package com.dicoaa.colegiosaltamontes2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dicoaa.colegiosaltamontes2.R

class ActivityAyuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)

        val btnSalirAyuda: Button = findViewById(R.id.btnSalirAyuda)
        btnSalirAyuda.setOnClickListener { salir() }
    }

    private fun salir() {
        finish()
    }
}