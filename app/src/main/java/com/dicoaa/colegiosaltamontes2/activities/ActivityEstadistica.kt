
package com.dicoaa.colegiosaltamontes2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.dicoaa.colegiosaltamontes2.R
import com.dicoaa.colegiosaltamontes2.clases.Globals

class ActivityEstadistica : AppCompatActivity() {
    var campoProcesados: TextView?= null
    var campoAprobados: TextView?= null
    var campoReprobados: TextView?= null
    var campoRecuperar: TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadistica)

        campoProcesados=findViewById(R.id.txtViewProcesados)
        campoAprobados=findViewById(R.id.txtViewGanan)
        campoRecuperar=findViewById(R.id.txtViewRecuperan)
        campoReprobados=findViewById(R.id.txtViewPierden)

        val btnSalirEstadistica: Button = findViewById(R.id.btnSalirEstadistica)
        btnSalirEstadistica.setOnClickListener { salir() }

        campoProcesados?.setText("${Globals.operaciones.listaEstudiantes.size}")

        var aprobados:Int = 0
        for (i in Globals.operaciones.listaEstudiantes){
            if(i.estado=="Aprobado"){
                aprobados += 1
            }
        }
        campoAprobados?.setText("${aprobados.toString()}")

        var reprobados: Int = 0
        for (i in Globals.operaciones.listaEstudiantes){
            if(i.estado=="Reprobado"){
                reprobados += 1
            }
        }
        campoReprobados?.setText("${reprobados.toString()}")

        var estPoRecuperar: Int = 0
        for(i in Globals.operaciones.listaEstudiantes){
            if(i.poRecuperar == true){
                estPoRecuperar += 1
            }
        }
        campoRecuperar?.setText("Estudiantes con posibilidad de recuperar: ${estPoRecuperar.toString()}")
    }

    private fun salir() {
        finish()
    }
}