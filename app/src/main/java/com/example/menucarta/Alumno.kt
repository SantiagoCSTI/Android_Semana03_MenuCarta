package com.example.menucarta

public class Alumno {
    var Nombres: String = ""
    var Apellidos: String = ""
    var Curso: String = ""
    var Nota1: Double = 0.0
    var Nota2: Double = 0.0
    var Nota3: Double = 0.0
    var Nota4: Double = 0.0

    constructor(pNombres: String, pApellidos: String, pCurso: String) { // Constructor

        this.Nombres = pNombres
        this.Apellidos = pApellidos
        this.Curso = pCurso
        this.Nota1 = 0.0
        this.Nota2 = 0.0
        this.Nota3 = 0.0
        this.Nota4 = 0.0
    }

    fun NombresCompleto():String
    {
        return "${this.Nombres} ${this.Apellidos}"
    }

    fun Promedio():Double
    {
        var Prom: Double = 0.0
        Prom = (this.Nota1 + this.Nota2 + this.Nota3 + this.Nota4) / 4
        return Prom
    }
}