package com.dicoaa.colegiosaltamontes2.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.dicoaa.colegiosaltamontes2.R

class ActivityImpresion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_impresion)

        val campoMensaje = findViewById<TextView>(R.id.txtResultado)
        var miBundle:Bundle?=this.intent.extras

        if(miBundle!=null){

           campoMensaje.text = "${miBundle.getSerializable("est")}\n" +
           "Ganadores: ${miBundle.getInt("ganadores")}\n" +
                   "Recuperadores: ${miBundle.getInt("recuperadores")}\n" +
                   "Perdedores: ${miBundle.getInt("perdedores")}"

        }

        val botonSalir: Button = findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener { onClick() }

    }

    private fun onClick() {
        var miBundle: Bundle? = this.intent.extras
        var intent = Intent(this, ActivityRegistro::class.java)
        intent.putExtra("gana", miBundle?.getInt("ganadores"))
        intent.putExtra("recupera", miBundle?.getInt("recuperadores"))
        intent.putExtra("pierde", miBundle?.getInt("perdedores"))

        startActivity(intent)

    }
}