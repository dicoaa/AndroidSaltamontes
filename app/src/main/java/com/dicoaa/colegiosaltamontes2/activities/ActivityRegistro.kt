package com.dicoaa.colegiosaltamontes2.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.dicoaa.colegiosaltamontes2.R
import com.dicoaa.colegiosaltamontes2.clases.Estudiante
import com.dicoaa.colegiosaltamontes2.clases.Globals
import com.dicoaa.colegiosaltamontes2.clases.Operaciones

class ActivityRegistro : AppCompatActivity() {

    var campoNombre: EditText? = null
    var campoDocumento: EditText? = null
    var campoEdad: EditText? = null
    var campoTelefono: EditText? = null
    var campoDireccion: EditText? = null

    var campoMateria1: EditText? = null
    var campoMateria2: EditText? = null
    var campoMateria3: EditText? = null
    var campoMateria4: EditText? = null
    var campoMateria5: EditText? = null

    var campoUno: EditText? = null
    var campoDos: EditText? = null
    var campoTres: EditText? = null
    var campoCuatro: EditText? = null
    var campoCinco: EditText? = null

    var estudiante: Estudiante? = null
    var operaciones: Operaciones? = null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


        operaciones = Globals.operaciones

        campoNombre = findViewById(R.id.txtNombre)
        campoDocumento = findViewById(R.id.txtDocumento)
        campoEdad = findViewById(R.id.txtEdad)
        campoTelefono = findViewById(R.id.txtTelefono)
        campoDireccion = findViewById(R.id.txtDireccion)

        campoMateria1 = findViewById(R.id.txtPrimeraMateria)
        campoMateria2 = findViewById(R.id.txtSegundaMateria)
        campoMateria3 = findViewById(R.id.txtTerceraMateria)
        campoMateria4 = findViewById(R.id.txtCuartaMateria)
        campoMateria5 = findViewById(R.id.txtQuintaMateria)

        campoUno = findViewById(R.id.txtPrimeraMateriaNota)
        campoDos = findViewById(R.id.txtSegundaMateriaNota)
        campoTres = findViewById(R.id.txtTerceraMateriaNota)
        campoCuatro = findViewById(R.id.txtCuartaMateriaNota)
        campoCinco = findViewById(R.id.txtQuintaMateriaNota)


        val btnRegistrar: Button = findViewById(R.id.btnRegistrar)
        btnRegistrar.setOnClickListener { validarDatos() }
    }

    private fun validarDatos() {

        // Para hacer validaciones y pasar datos a string

        var campoPrimeraNota = findViewById<EditText>(R.id.txtPrimeraMateriaNota).text.toString()
        var campoSegundaNota = findViewById<EditText>(R.id.txtSegundaMateriaNota).text.toString()
        var campoTerceraNota = findViewById<EditText>(R.id.txtTerceraMateriaNota).text.toString()
        var campoCuartaNota = findViewById<EditText>(R.id.txtCuartaMateriaNota).text.toString()
        var campoQuintaNota = findViewById<EditText>(R.id.txtQuintaMateriaNota).text.toString()


        var nombre = findViewById<EditText>(R.id.txtNombre).text.toString()

        var edad = findViewById<EditText>(R.id.txtEdad).text.toString()

        var materiaUno =  findViewById<EditText>(R.id.txtPrimeraMateria).text.toString()
        var materiaDos =  findViewById<EditText>(R.id.txtSegundaMateria).text.toString()
        var materiaTres =  findViewById<EditText>(R.id.txtTerceraMateria).text.toString()
        var materiaCuatro =  findViewById<EditText>(R.id.txtCuartaMateria).text.toString()
        var materiaCinco =  findViewById<EditText>(R.id.txtQuintaMateria).text.toString()

        // Se validan primero las notas, de lo contrario se cae el programa

        if(nombre.equals(null) || nombre.equals("")){
            campoNombre?.error = "Ingrese un nombre"
        }

        if(edad.equals(null) ||edad.equals("")){
            campoEdad?.error = "Ingrese la edad"
        }

        if((campoPrimeraNota.equals(null)) || (campoPrimeraNota.equals("")) || campoPrimeraNota.equals(".")) {
            campoUno?.error = "Ingrese una nota"
            if (materiaUno.equals(null) || materiaUno.equals("")){
                campoMateria1?.error = "Ingrese una materia"
            } else {
                campoMateria1?.setError(null)
            }
        } else if ((campoSegundaNota.equals(null)) || (campoSegundaNota.equals("")) || campoSegundaNota.equals(".")) {
            campoUno?.setError(null)
            campoDos?.error = "Ingrese una nota"
            if (materiaDos.equals(null) || materiaDos.equals("")){
                campoMateria2?.error = "Ingrese una materia"
            } else {
                campoMateria2?.setError(null)
            }
        } else if ((campoTerceraNota.equals(null)) || (campoTerceraNota.equals("")) || campoTerceraNota.equals(".")) {
            campoDos?.setError(null)
            campoTres?.error = "Ingrese una nota"
            if (materiaTres.equals(null) || materiaTres.equals("")){
                campoMateria3?.error = "Ingrese una materia"
            } else {
                campoMateria3?.setError(null)
            }
        } else if ((campoCuartaNota.equals(null)) || (campoCuartaNota.equals("")) || campoCuartaNota.equals(".")) {
            campoTres?.setError(null)
            campoCuatro?.error = "Ingrese una nota"
            if (materiaCuatro.equals(null) || materiaCuatro.equals("")){
                campoMateria4?.error = "Ingrese una materia"
            } else {
                campoMateria4?.setError(null)
            }
        } else if ((campoQuintaNota.equals(null)) || (campoQuintaNota.equals("")) || campoQuintaNota.equals(".")) {
            campoCuatro?.setError(null)
            campoCinco?.error = "Ingrese una nota"
            if (materiaCinco.equals(null) || materiaCinco.equals("")){
                campoMateria5?.error = "Ingrese una materia"
            } else {
                campoMateria5?.setError(null)
            }
        }
        else {
            campoMateria5?.setError(null)

//            var promedio: Double = 0.0

            var notaUno: Double = campoPrimeraNota.toDouble()
            var notaDos: Double = campoSegundaNota.toDouble()
            var notaTres: Double = campoTerceraNota.toDouble()
            var notaCuatro: Double = campoCuartaNota.toDouble()
            var notaCinco: Double = campoQuintaNota.toDouble()

//            promedio = (notaUno + notaDos + notaTres + notaCuatro + notaCinco) / 5
//            enviarDatos(promedio, notaUno, notaDos, notaTres, notaCuatro, notaCinco)


            // Validaciones numeros entre 0 y 5

            if (notaUno > 5 || notaUno < 0){
                campoUno?.error = "Escriba un numero entre 0 y 5"
            } else if (notaDos > 5 || notaDos < 0){
                campoUno?.setError(null)
                campoDos?.error = "Escriba un numero entre 0 y 5"
            } else if (notaTres > 5 || notaTres < 0){
                campoDos?.setError(null)
                campoTres?.error = "Escriba un numero entre 0 y 5"
            }
            else if (notaCuatro > 5 || notaCuatro < 0){
                campoTres?.setError(null)
                campoCuatro?.error = "Escriba un numero entre 0 y 5"
            }
            else if (notaCinco > 5 || notaCinco < 0){
                campoCuatro?.setError(null)
                campoCinco?.error = "Escriba un numero entre 0 y 5"
            } else {
                campoCinco?.setError(null)
                enviarDatos(notaUno, notaDos, notaTres, notaCuatro, notaCinco)
            }
        }
    }

    private fun enviarDatos(
        notaUno: Double,
        notaDos: Double,
        notaTres: Double,
        notaCuatro: Double,
        notaCinco: Double
    ) {
        estudiante = Estudiante()

        estudiante?.documento= campoDocumento?.text.toString()
        estudiante?.nombre= campoNombre?.text.toString()
        estudiante?.edad= campoEdad?.text.toString().toInt()
        estudiante?.direccion= campoDireccion?.text.toString()
        estudiante?.telefono= campoTelefono?.text.toString()

        estudiante?.materia1= campoMateria1?.text.toString()
        estudiante?.materia2= campoMateria2?.text.toString()
        estudiante?.materia3= campoMateria3?.text.toString()
        estudiante?.materia4= campoMateria4?.text.toString()
        estudiante?.materia5= campoMateria5?.text.toString()

        estudiante?.nota1=notaUno
        estudiante?.nota2=notaDos
        estudiante?.nota3=notaTres
        estudiante?.nota4=notaCuatro
        estudiante?.nota5=notaCinco

        estudiante?.promedio = operaciones!!.calcularPromedio(estudiante!!)

        if((estudiante!!.promedio) >= 3.5){
            estudiante?.estado = "Aprobado"
        } else {
            estudiante?.estado = "Reprobado"
        }

        if (estudiante!!.promedio >= 2.5){
            if (estudiante!!.promedio >= 3.5) {
                estudiante?.poRecuperar = false
            } else {
                estudiante?.poRecuperar = true
            }
        } else {
            estudiante?.poRecuperar = false
        }

        operaciones?.registrarEstudiante(estudiante!!)
        operaciones?.imprimirListaEstudiantes()

        val miBundle: Bundle = Bundle()
        miBundle.putString("estado", estudiante?.estado)
        miBundle.putBoolean("poRecuperar", estudiante!!.poRecuperar)
        miBundle.putSerializable("est", estudiante)
        val intent = Intent (this, ActivityImpresion::class.java)
        intent.putExtras(miBundle)
        startActivity(intent)

    }

}