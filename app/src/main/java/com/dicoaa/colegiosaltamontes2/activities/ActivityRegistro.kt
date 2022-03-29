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

    var operaciones: Operaciones? = null

//    var pierde: Int = 0
//    var gana: Int = 0
//    var recupera: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

//        var operaciones: Operaciones? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


//        Esta linea se reemplaza por las dos siguientes para que pueda atarapar el bundle
//        operaciones = Operaciones()

        var bundle: Bundle? =this.intent.extras
        operaciones= bundle?.getSerializable("operaciones") as Operaciones?


        //Para atrapar el campo

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


        val btnInicio : Button = findViewById(R.id.btnSalirRegistro)
        btnInicio.setOnClickListener { salir() }

        val btnRegistrar: Button = findViewById(R.id.btnRegistrar)
        btnRegistrar.setOnClickListener { validarDatos() }

    }

    private fun salir() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun validarDatos() {

        operaciones = Operaciones()
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
        var est: Estudiante = Estudiante()

//        con este bundle se juega al ping pong con la funcion onClick de la clase ActivityImpresion
        var bundle: Bundle? = this.intent.extras

        est.documento= campoDocumento?.text.toString()
        est.nombre= campoNombre?.text.toString()
        est.edad= campoEdad?.text.toString().toInt()
        est.direccion= campoDireccion?.text.toString()
        est.telefono= campoTelefono?.text.toString()

        est.materia1= campoMateria1?.text.toString()
        est.materia2= campoMateria2?.text.toString()
        est.materia3= campoMateria3?.text.toString()
        est.materia4= campoMateria4?.text.toString()
        est.materia5= campoMateria5?.text.toString()

        est.nota1=notaUno
        est.nota2=notaDos
        est.nota3=notaTres
        est.nota4=notaCuatro
        est.nota5=notaCinco


        var contPierde: Int = 0
        var contGana: Int = 0
        var contRecupera: Int = 0
        var mensaje: String = ""

        var prom=(est.nota1+est.nota2+est.nota3+est.nota4+est.nota5)/5
        est.promedio = prom

        if(prom <= 2.5){
            contPierde += 1
            mensaje = "Usted mi pierde el periodo"
            Log.i("Recupera", bundle?.getInt("perdedores").toString())
        } else if (prom < 3.5) {
            contRecupera += 1
            mensaje = "Usted puede recuperar periodo"
//            Log.i("Pierde", "$contRecupera")
            Log.i("Recupera", bundle?.getInt("ganadores").toString())
        } else {
            contGana += 1
            mensaje = "Usted gana la materia"
            Log.i("Gana", bundle?.getInt("gana").toString())
        }


        contGana += bundle?.getInt("gana")!!.toInt()
        contRecupera += bundle?.getInt("recupera")!!.toInt()
        contPierde += bundle?.getInt("pierde")!!.toInt()


        est.pierde = contPierde
        est.recupera = contRecupera
        est.gana = contGana
        est.conclusion = mensaje

//        return prom
//        est.promedio = operaciones!!.calcularPromedio(est)
        operaciones?.registrarEstudiante(est)
        operaciones?.imprimirListaEstudiantes()
//        limpiarCampos()

        //putSerializable es para enviar objetos

//        val miBundle:Bundle=Bundle()
//        miBundle.putSerializable("est", est)
//        intent.putExtras(miBundle)
        intent = Intent(this, ActivityImpresion::class.java)
        intent.putExtra("ganadores", contGana)
        intent.putExtra("recuperadores", contRecupera)
        intent.putExtra("perdedores", contPierde)
        startActivity(intent)
    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode==KeyEvent.KEYCODE_BACK){

            Toast.makeText(this, "Se cierra el registro Activity", Toast.LENGTH_SHORT).show()
            devolverResultados()
//            No se finaliza para no tener que darle tanto atras, me tiene q cerrar muchas
        //            veces dependiendo de la cantidad de estudiantes que se hayan registrado
//            finish()
            startActivity(Intent(this, MainActivity::class.java))
        }
        return super.onKeyDown(keyCode, event)
    }

    private fun devolverResultados(){
        var miIntent: Intent = Intent()
        miIntent.putExtra("resultado","Registro exitoso")
        var miBundle:Bundle= Bundle()
        miBundle.putSerializable("objetoOperaciones",operaciones)
        miIntent.putExtras(miBundle)
        //miIntent.putExtra("obj",operaciones)
        setResult(RESULT_OK,miIntent)
    }


//    private fun limpiarCampos() {
//
//        campoNombre?.setText("")
//        campoDocumento?.setText("")
//        campoEdad?.setText("")
//        campoTelefono?.setText("")
//        campoDireccion?.setText("")
//
//        campoMateria1?.setText("")
//        campoMateria2?.setText("")
//        campoMateria3?.setText("")
//        campoMateria4?.setText("")
//        campoMateria5?.setText("")
//
//        campoUno?.setText("")
//        campoDos?.setText("")
//        campoTres?.setText("")
//        campoCuatro?.setText("")
//        campoCinco?.setText("")
//    }

}