package com.juan.practicandoventanas.servicios

import javafx.scene.control.Alert
import javafx.scene.control.TextInputDialog

class Alerts {
    companion object {
        fun showErrorMessage(title: String, message: String) {
            var alert = Alert(Alert.AlertType.ERROR)
            alert.title = title
            alert.contentText = message
            alert.showAndWait()
        }

        fun showConfirmMessage(title: String, message: String) {
            var alert = Alert(Alert.AlertType.CONFIRMATION)
            alert.title = title
            alert.contentText = message
            alert.showAndWait()
        }

        fun showWarningMessage(title: String, message: String) {
            var alert = Alert(Alert.AlertType.WARNING)
            alert.title = title
            alert.contentText = message
            alert.showAndWait()
        }

        fun showInfoMessage(title: String, message: String) {
            var alert = Alert(Alert.AlertType.INFORMATION)
            alert.title = title
            alert.contentText = message
            alert.showAndWait()
        }

        fun showInputDialog(title: String, contentText: String) {
            val dialog = TextInputDialog()
            dialog.headerText = title
            dialog.contentText = contentText
            val window = dialog.showAndWait()
            if (window.isPresent) {
                TODO("Esto ocurrirá cuando el usuario le dé a aceptar")
            }
        }
    }
}