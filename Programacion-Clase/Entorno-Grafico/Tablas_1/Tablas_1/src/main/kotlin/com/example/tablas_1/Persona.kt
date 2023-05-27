package com.example.tablas_1

import javafx.beans.property.IntegerProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.beans.property.StringProperty


class Persona {
    var nombre: String = ""
    var edad: Int=0
    var telefono: String = ""

    constructor(n:String,e:Int,t:String){
        this.nombre = n
        edad = e
        telefono = t

    }
}