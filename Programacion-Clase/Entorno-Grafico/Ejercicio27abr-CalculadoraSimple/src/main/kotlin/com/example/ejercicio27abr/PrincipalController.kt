package com.example.ejercicio27abr

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField

class PrincipalController {
    @FXML
    private lateinit var txtNumero1: TextField

    @FXML
    private lateinit var txtNumero2: TextField

    @FXML
    private lateinit var txtSolucion: TextField

    @FXML
    private fun sumar() {
        val x = (txtNumero1.text).toInt()
        val y = (txtNumero2.text).toInt()

        val sol = x + y
        txtSolucion.text = sol.toString()

        //! Para hacerlo en una sola línea
        //! txtSolucion.text = ((txtNumero1.text).toInt() + (txtNumero2.text).toInt()).toString()
    }

    @FXML
    private fun restar() {
        txtSolucion.text = ((txtNumero1.text).toInt() - (txtNumero2.text).toInt()).toString()
    }

    @FXML
    private fun multiplicar() {
        txtSolucion.text = ((txtNumero1.text).toInt() * (txtNumero2.text).toInt()).toString()
    }

    @FXML
    private fun dividir() {
        txtSolucion.text = ((txtNumero1.text).toInt() / (txtNumero2.text).toInt()).toString()
    }
}