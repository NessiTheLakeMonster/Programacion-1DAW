package com.example.git_interfaz

import Socios.Socio
import javafx.scene.control.Alert

class Alertas {
    companion object {
        fun confirm_insert_socio(s : Socio){

            val alert = Alert(Alert.AlertType.CONFIRMATION)
            alert.title = "Usuario insertado correctamente"
            alert.headerText = "El usuario ${s.nombre} se ha insertado correctamente"
            alert.showAndWait()
        }
        fun error_insert_socio(s: Socio){
            val alert = Alert(Alert.AlertType.CONFIRMATION)
            alert.title = "Usuario no insertado"
            alert.headerText = "El usuario ${s.nombre} no se ha podido insertar"
            alert.showAndWait()
        }
        fun usuario_incorrect() {
            var alert = Alert(Alert.AlertType.ERROR) // Creo una ventana de alerta de tipo "Error"
            alert.title = "Error"
            alert.contentText = "id o nombre incorrectos"
            alert.showAndWait() // Mostramos la ventana de alerta haciendo que el programa se bloquee hasta que se cierre.
        }
    }
}