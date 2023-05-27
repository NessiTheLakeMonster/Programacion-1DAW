package com.example.git_interfaz

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.stage.Modality
import javafx.stage.Stage

class InicioController {
   @FXML
   private lateinit var btnRegistrarse: Button

   @FXML
   private lateinit var btnIniciar: Button


   @FXML
   private fun pulsarRegistro() {
      val fxmlLoader = FXMLLoader(InicioController::class.java.getResource("registro-view.fxml"))
      val scene = Scene(fxmlLoader.load(), 600.0, 400.0)
      //val detailController = fxmlLoader.getController<verDatosController>()
      //detailController.transpaso(this.persona)
      //detailController.inicializoConDatos()
      var stage = Stage()
      stage.title = "Registrate"
      stage.initModality(Modality.APPLICATION_MODAL)
      stage.scene = scene
      stage.show()
      var  st=btnRegistrarse.scene.window as Stage
      st.close()

   }

   @FXML
   private fun pulsarIniciar() {
      val fxmlLoader = FXMLLoader(InicioController::class.java.getResource("iniciar-view.fxml"))
      val scene = Scene(fxmlLoader.load(), 600.0, 400.0)
      var stage = Stage()
      stage.title = "Inicie sesion"
      stage.initModality(Modality.APPLICATION_MODAL)
      stage.scene = scene
      stage.show()
      var  st=btnIniciar.scene.window as Stage
      st.close()
   }

}