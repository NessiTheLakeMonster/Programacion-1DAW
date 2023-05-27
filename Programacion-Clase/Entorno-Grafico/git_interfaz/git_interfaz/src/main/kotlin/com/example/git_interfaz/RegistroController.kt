package com.example.git_interfaz

import Servicio.SocioServices
import Socios.Socio
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.DatePicker
import javafx.scene.control.TextField
import javafx.stage.Modality
import javafx.stage.Stage
import kotlin.Exception as Exception1

class RegistroController {
    @FXML
    private lateinit var tf_dni : TextField
    @FXML
    private lateinit var tf_nombre : TextField
    @FXML
    private lateinit var tf_apellido : TextField
    @FXML
    private lateinit var dp_fechanac : DatePicker
    @FXML
    private lateinit var btnVolver : Button

    @FXML
    private fun pulsarRegistro(){
        var fecha = dp_fechanac.value.toString()
        var nSocio = Socio(SocioServices.id(),
            tf_dni.text.toString(),
            tf_nombre.text.toString(),
            tf_apellido.text.toString(),
            fecha
        )
        try {
            SocioServices.insertnewSocio(nSocio)
        }catch (ex: Exception){
            Alertas.error_insert_socio(nSocio)
        }finally {
            Alertas.confirm_insert_socio(nSocio)
        }

    }

    @FXML
    private fun pulsarVolver(){
        val fxmlLoader = FXMLLoader(RegistroController::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 600.0, 400.0)
        var stage = Stage()
        stage.title = "Bienvenido a nuestro videoclub!"
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.scene = scene
        stage.show()
        var  st = btnVolver.scene.window as Stage
        st.close()
    }
}