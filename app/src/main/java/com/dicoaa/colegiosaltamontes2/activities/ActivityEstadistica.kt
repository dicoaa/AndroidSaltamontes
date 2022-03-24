package com.dicoaa.colegiosaltamontes2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dicoaa.colegiosaltamontes2.R

class ActivityEstadistica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadistica)

        val btnSalirEstadistica: Button = findViewById(R.id.btnSalirEstadistica)
        btnSalirEstadistica.setOnClickListener { salir() }
    }

    private fun salir() {
        finish()
    }
}