package com.example.demo1

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField

class PrincipalController {
    @FXML
    private lateinit var welcomeText: Label
    @FXML
    private lateinit var txtNombre: TextField

    @FXML
    private fun pulsarBoton() {
        txtNombre.text = "Welcome to JavaFX Application!"
    }
}