package com.dicoaa.colegiosaltamontes2.clases

import java.io.Serializable

class Estudiante : Serializable {

    var documento: String=""
    var nombre: String=""
    var edad: Int=0
    var telefono: String=""
    var direccion: String=""

    var materia1: String=""
    var materia2: String=""
    var materia3: String=""
    var materia4: String=""
    var materia5: String=""

    var nota1: Double=0.0
    var nota2: Double=0.0
    var nota3: Double=0.0
    var nota4: Double=0.0
    var nota5: Double=0.0

    var pierde: Int = 0
    var recupera: Int = 0
    var gana: Int = 0
    var conclusion: String = ""

    //Este mapa es opcional, es un ejemplo por si se va a gestionar las notas de forma independiente
//    var mapaMaterias= mutableMapOf<String,Materia>()

    var promedio:Double=0.0

    override fun toString(): String {
        return "Estudiante(documento='$documento, \n nombre='$nombre',\n" +
                " edad=$edad,\n telefono='$telefono',\n direccion='$direccion',\n" +
                " materia1='$materia1',\n materia2='$materia2',\n " +
                "materia3='$materia3', materia4='$materia4', materia5='$materia5'," +
                " nota1=$nota1,\n nota2=$nota2,\n nota3=$nota3,\n nota4=$nota4,\n " +
                "nota5=$nota5,\n promedio=$promedio, \n Conclusion=$conclusion\")"+

                "Ganadores=$gana"+
                "Recuperadores=$recupera"+
                "Pierden=$pierde"
    }


}