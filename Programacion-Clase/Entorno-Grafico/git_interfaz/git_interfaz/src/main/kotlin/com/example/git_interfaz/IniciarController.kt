package com.example.git_interfaz

import Administradores.admin
import Servicio.AdminServices
import Servicio.SocioServices
import Socios.Socio
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField

class IniciarController() {

    @FXML
    private lateinit var tf_Id_usu : TextField
    @FXML
    private lateinit var tf_nombre_user : TextField
    @FXML
    private lateinit var btn_iniciar : Button
    @FXML
    private lateinit var btn_ver : Button


    @FXML
    private fun pulsar_iniciar(){
        var socio = Socio(tf_Id_usu.text.toInt(), tf_nombre_user.text.toString().lowercase())
        if (SocioServices.loginSocio(socio)){
            if (socio.id_socio/2 == 0){
                // abre ventana de administrador
            }else{
                //abre ventana de usuario normal
            }
        }else {Alertas.usuario_incorrect()}
    }

    @FXML
    private fun pulsar_ver(){

    }
}