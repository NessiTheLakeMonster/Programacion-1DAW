package com.example.entornograficobbdd

import BBDD.Videojuego
import Servicio.VideojuegoServicio
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.ComboBox
import javafx.scene.control.Label
import java.net.URL
import java.util.*
import kotlin.collections.ArrayList

class ElegirVideojuegoController : Initializable {

    @FXML
    private lateinit var lblTitulo: Label

    @FXML
    private lateinit var  lblSaga: Label

    @FXML
    private lateinit var cbVideojuego: ComboBox<Videojuego>

    @FXML
    private lateinit var obLista: ObservableList<Videojuego>

    @FXML
    private val videoService = VideojuegoServicio()

    @FXML
    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        obLista = FXCollections.observableArrayList<Videojuego>()

        for (i in videoService.seleccionarVideojuego()) {
            obLista.add(i)
        }

        cbVideojuego.items = obLista
    }

    @FXML
    private fun elegirVideojuego() {
        lblTitulo.text = (cbVideojuego.value.titulo).toString()
        lblSaga.text = (cbVideojuego.value.saga).toString()
    }

}