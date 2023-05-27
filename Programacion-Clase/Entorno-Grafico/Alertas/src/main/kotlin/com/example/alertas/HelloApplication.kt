package com.example.alertas

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

import javafx.scene.control.Alert
import javafx.scene.control.ButtonType


class HelloApplication : Application() {
    override fun start(primaryStage: Stage) {
        val alert = Alert(Alert.AlertType.CONFIRMATION)
        alert.title = "Confirmation Dialog"
        alert.headerText = "Look, a Confirmation Dialog"
        alert.contentText = "Are you sure you want to do this?"

        // Tipos de Alertas:
        alert.alertType = Alert.AlertType.CONFIRMATION // Confirmación
        alert.alertType = Alert.AlertType.ERROR // Error
        alert.alertType = Alert.AlertType.INFORMATION // Información
        alert.alertType = Alert.AlertType.WARNING // Advertencia
        alert.alertType = Alert.AlertType.NONE // Ninguna

        // Agregando botones personalizados
        val buttonTypeOne = ButtonType("One")
        val buttonTypeTwo = ButtonType("Two")
        val buttonTypeCancel = ButtonType.CANCEL
        alert.buttonTypes.setAll(buttonTypeOne, buttonTypeTwo, buttonTypeCancel)

        // Mostrando la alerta y procesando la respuesta
        val result = alert.showAndWait()
        if (result.get() == buttonTypeOne) {
            println("Button One clicked")
        } else if (result.get() == buttonTypeTwo) {
            println("Button Two clicked")
        } else {
            println("Dialog canceled")
        }
    }


}

fun main() {
    Application.launch(HelloApplication::class.java)
}




