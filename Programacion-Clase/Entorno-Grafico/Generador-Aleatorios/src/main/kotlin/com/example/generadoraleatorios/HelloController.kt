package com.example.generadoraleatorios

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.ProgressBar
import javafx.scene.control.TextField

class HelloController {
    @FXML
    private lateinit var txtSolucion: TextField

    @FXML
    private lateinit var progreso1: ProgressBar
    private lateinit var progreso2: ProgressBar

    @FXML
    private lateinit var lblProgreso1: Label
    private lateinit var lblProgreso2: Label

    // BARRA DE PROGRESO 1
    @FXML
    private fun btnMenosPulsado1() {
        progreso1.progress -= 1
        if (progreso1.progress < 0){
            progreso1.progress= 0.0
        }
        lblProgreso1.text = (progreso1.progress).toString()

    }

    @FXML
    private fun btnMasPulsado1() {
        progreso1.progress += 1
        if (progreso1.progress < 0){
            progreso1.progress= 0.0
        }
        lblProgreso1.text = (progreso1.progress).toString()

    }

    // BARRA DE PROGRESO 2
    @FXML
    private fun btnMenosPulsado2() {
        progreso2.progress -= 1
        if (progreso2.progress < 0){
            progreso2.progress= 0.0
        }
        lblProgreso2.text = (progreso2.progress).toString()

    }

    @FXML
    private fun btnMasPulsado2() {
        progreso2.progress += 1
        if (progreso2.progress < 0){
            progreso2.progress= 0.0
        }
        lblProgreso2.text = (progreso2.progress).toString()

    }

    @FXML
    private fun generarAleatorio() {
        var aleatorio: Int = 0
        var min = (lblProgreso1.text).toInt()
        var max = (lblProgreso2.text).toInt()

        aleatorio = (min..max).random()

        txtSolucion.text = aleatorio.toString()
    }
}