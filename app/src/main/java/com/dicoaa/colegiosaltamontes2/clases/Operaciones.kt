package com.dicoaa.colegiosaltamontes2.clases

import java.io.Serializable

class Operaciones : Serializable {

    var listaEstudiantes =arrayListOf<Estudiante>()

    fun registrarEstudiante(estudiante: Estudiante){

        listaEstudiantes.add(estudiante)
    }

    fun imprimirListaEstudiantes(){
        for(est in listaEstudiantes){
            println(est)
        }
    }

//    fun calcularPromedio(est: Estudiante): Double {
//
//        var contPierde: Int = 0
//        var contGana: Int = 0
//        var contRecupera: Int = 0
//        var mensaje: String = ""
//
//        var prom=(est.nota1+est.nota2+est.nota3+est.nota4+est.nota5)/5
//        est.promedio = prom
//
//        if(prom <= 2.5){
//            contPierde = contPierde + 1
//            mensaje = "Usted mi pierde el periodo"
//        } else if (prom < 3.5) {
//            contRecupera = contRecupera + 1
//            mensaje = "Usted puede recuperar periodo"
//        } else {
//            contGana = contGana + 1
//            mensaje = "Usted gana la materia"
//        }
//
//        est.pierde = contPierde
//        est.recupera = contRecupera
//        est.gana = contGana
//        est.conclusion = mensaje
//
//        return prom
//    }
}