package com.dicoaa.colegiosaltamontes2.activities

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

           campoMensaje.text = "${miBundle.getSerializable("est")}"

//            campoMensaje.text = "Nombre: ${miBundle.getString("Nombre")} \n" +
//                "Promedio: ${miBundle.getDouble("Promedio")} \n \n" +
//
//                    "Primera materia: ${miBundle.getString("Materia_1")} \n" +
//                    "Nota primera materia: ${miBundle.getDouble("NotaMateria1")} \n \n" +
//
//                    "Segunda materia: ${miBundle.getString("Materia_2")} \n" +
//                    "Nota segunda materia: ${miBundle.getDouble("NotaMateria2")} \n \n" +
//
//                    "Tercera Materia: ${miBundle.getString("Materia_3")} \n" +
//                    "Nota tercera materia: ${miBundle.getDouble("NotaMateria3")} \n \n" +
//
//                    "Cuarta Materia: ${miBundle.getString("Materia_4")} \n" +
//                    "Nota cuarte materia: ${miBundle.getDouble("NotaMateria4")} \n \n" +
//
//                    "Quinta Materia: ${miBundle.getString("Materia_5")} \n" +
//                    "Nota quinta materia: ${miBundle.getDouble("NotaMateria5")} \n \n \n" +
//
//                    "Situacion: ${miBundle.getString("Mensaje")} \n \n \n \n" +
//
//                    "Cantidad ganadores: ${miBundle.getInt("Ganadores")} \n" +
//                    "Cantidad recuperadores: ${miBundle.getInt("Recuperadores")} \n" +
//                    "Cantidad perdedores: ${miBundle.getInt("Perdedores")}"


        }

        val botonSalir: Button = findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener { onClick() }

    }

    private fun onClick() {
        finish()
    }
}