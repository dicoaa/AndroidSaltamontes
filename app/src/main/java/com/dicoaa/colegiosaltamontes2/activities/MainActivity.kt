package com.dicoaa.colegiosaltamontes2.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.dicoaa.colegiosaltamontes2.R
import com.dicoaa.colegiosaltamontes2.clases.Operaciones

class MainActivity : AppCompatActivity() {
    var operaciones: Operaciones? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operaciones = Operaciones()
        iniciarComponentes()

    }

    private val response=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ valor ->
        if (valor.resultCode== RESULT_OK){
            //resp y resp 2 almacenan el mismo dato, solo se muestran 2 formas como podria capturarse el dato
            val resp=valor?.data?.extras?.get("resultado") as String
            val resp2=valor?.data?.getStringExtra("resultado")
            println("Valor respuesta=$resp y la resps2=$resp2")
            //capturamos el objeto nuevo y lo asignamos a operaciones
            operaciones= valor?.data?.extras?.get("objetoOperaciones") as Operaciones?
            operaciones?.imprimirListaEstudiantes()
        }
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
            1 -> {
                val intent = Intent(this, ActivityRegistro::class.java)
                var miBundle:Bundle = Bundle()
                miBundle.putSerializable("operaciones", operaciones)
                startActivity(intent)

                intent.putExtras(miBundle)
                intent.putExtra("Objeto",operaciones)
                // startActivity(miIntent)
                response.launch(intent)
            }

            2 -> {
                val intent = Intent(this, ActivityEstadistica::class.java)
                startActivity(intent)
            }

            3 -> {
                val intent = Intent(this, ActivityAyuda::class.java)
                startActivity(intent)
            }
        }

    }
}