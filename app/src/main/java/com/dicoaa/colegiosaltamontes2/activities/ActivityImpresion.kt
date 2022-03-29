package com.dicoaa.colegiosaltamontes2.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.dicoaa.colegiosaltamontes2.R

class ActivityImpresion : AppCompatActivity() {
    var btnInicio: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_impresion)

        val campoMensaje = findViewById<TextView>(R.id.txtResultado)
        val campoEstado = findViewById<TextView>(R.id.txtEstado)
        var miBundle:Bundle?=this.intent.extras

         btnInicio = findViewById(R.id.btnSalir)

        if(miBundle!=null){
           campoMensaje.text = "${miBundle.getSerializable("est")}"

            if(miBundle.getString("estado")=="Aprobado"){

            } else {
                when (miBundle.getBoolean("poRecuperar")){
                    true -> campoEstado?.setText("Tiene posibilidades de recuperar la materia")
                    false -> campoEstado?.setText("No tiene posibilidades de recuperar la materia")
                }
            }
        }
        btnInicio?.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
    }
}