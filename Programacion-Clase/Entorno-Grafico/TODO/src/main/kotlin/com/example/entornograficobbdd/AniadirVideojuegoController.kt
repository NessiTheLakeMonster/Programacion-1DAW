package com.example.entornograficobbdd

import BBDD.Videojuego
import Servicio.VideojuegoServicio
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.DatePicker
import javafx.scene.control.TextField
import java.net.URL
import java.util.*

class AniadirVideojuegoController {
    @FXML
    private lateinit var txtID: TextField

    @FXML
    private lateinit var txtTitulo: TextField

    @FXML
    private lateinit var txtSaga: TextField

    @FXML
    private lateinit var txtDistribuidora: TextField

    @FXML
    private lateinit var dpFecha: DatePicker

    @FXML
    private lateinit var txtGenero: TextField

    @FXML
    private val vda = VideojuegoServicio()

    @FXML
    fun btnAniadirPulsado() {

        val ID = txtID.text.toInt()
        val titulo = txtTitulo.text
        val saga = txtSaga.text
        val distribuidora = txtDistribuidora.text
        val fecha = dpFecha.value
        val genero = txtGenero.text

        val videojuego = Videojuego(ID, titulo, saga, distribuidora, fecha, genero)

        vda.insertarVideojuego(videojuego.id, videojuego.titulo, videojuego.saga, videojuego.distribuidora,
            videojuego.lanzamiento, videojuego.genero)

        //vda.insertar(videojuego)
    }
}