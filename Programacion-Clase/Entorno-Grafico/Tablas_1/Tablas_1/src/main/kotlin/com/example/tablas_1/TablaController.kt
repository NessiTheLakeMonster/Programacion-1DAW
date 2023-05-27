package com.example.tablas_1

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.*

import java.net.URL
import java.util.*

class TablaController:Initializable {
    @FXML
    private lateinit var colNombre: TableColumn<Persona,String>
    @FXML
    private lateinit var  colEdad: TableColumn<Persona,Int>
    @FXML
    private lateinit var colTelefono: TableColumn<Persona,String>
    @FXML
    private lateinit var tablaPersona: TableView<Persona>
    @FXML private lateinit var btnBorrar: Button
    @FXML private lateinit var btnMostrar: Button
    @FXML private lateinit var btnAgregar: Button

    private lateinit var obLista: ObservableList<Persona>

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        //asociamos los elementos de la clase persona con cada una de las columnas, por medio de una funcion lambda
        colNombre.setCellValueFactory { cellData ->
            SimpleStringProperty(cellData.value.nombre)
        }
        colEdad.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.edad)
        }

        colTelefono.setCellValueFactory { cellData ->
            SimpleStringProperty(cellData.value.telefono)
        }


        // Método 1 inicializar la tabla con dos registros
        //tablaPersona.items = FXCollections.observableArrayList(
        //    Persona("Juan", 25, "1234567890"),
        //    Persona("María", 30, "0987654321")
        //)

        //Método 2
        obLista = FXCollections.observableArrayList()
        obLista.add(Persona("Juan", 25, "1234567890"))
        obLista.add(Persona("María", 30, "0987654321"))

        tablaPersona.items=obLista //el items de la tabla es el que necesita la conversion de String --> SimpleStringProperty para poder representarlos internamente
    }

    @FXML
    private fun btnBorrarPulsado() {
        val personaSeleccionada = tablaPersona.selectionModel.selectedItem
        if (personaSeleccionada != null) {
            tablaPersona.items.remove(personaSeleccionada)
            tablaPersona.refresh() //actualiza la tabla, en este caso no se necesita, pero por si acaso
        }
    }

    @FXML
    private fun btnMostrarPulsado() {
        val personaSeleccionada = tablaPersona.selectionModel.selectedItem
        val indice = tablaPersona.selectionModel.selectedIndex
        if (personaSeleccionada != null) {
            val alert = Alert(Alert.AlertType.INFORMATION)
            alert.title = "Información de persona"
            alert.headerText = "Datos de la persona seleccionada"
            alert.contentText = "Nombre: ${personaSeleccionada.nombre}\n" +
                    "Edad: ${personaSeleccionada.edad}\n" +
                    "Teléfono: ${personaSeleccionada.telefono}\n" +
                    "Fila: ${indice}"
            alert.showAndWait()
        }
    }

    @FXML
    private fun btnAgregarPulsado() {
        tablaPersona.items.addAll(
            Persona("Pedro", 40, "4561237890"),
            Persona("Ana", 20, "9876543210")
        )
    }
}