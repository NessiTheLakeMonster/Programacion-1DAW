module com.example.ejercicio27abr {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.ejercicio27abr to javafx.fxml;
    exports com.example.ejercicio27abr;
}