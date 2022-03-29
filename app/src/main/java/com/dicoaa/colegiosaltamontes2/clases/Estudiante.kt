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

    var promedio:Double=0.0
    var estado: String = ""
    var poRecuperar: Boolean = false

    override fun toString(): String {
        return "Documento: $documento \n" +
                "Nombre: $nombre \n" +
                "Edad: $edad \n " +
                "Telefono: $telefono \n" +
                "Direccion: $direccion \n" +
                "Materia 1: $materia1 - Nota 1: $nota1 \n" +
                "Materia 1: $materia2 - Nota 1: $nota2 \n" +
                "Materia 1: $materia3 - Nota 1: $nota3 \n" +
                "Materia 1: $materia4 - Nota 1: $nota4 \n" +
                "Materia 1: $materia5 - Nota 1: $nota5 \n" +
                "Promedio: $promedio \n \n" +
                "Estado: $estado"
    }
}