package com.example.entornograficobbdd

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("videoSocAlq-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 622.0,434.0)
        stage.title = "Videojuegos"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}