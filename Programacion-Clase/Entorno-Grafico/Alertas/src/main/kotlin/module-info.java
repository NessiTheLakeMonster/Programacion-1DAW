module com.example.alertas {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.alertas to javafx.fxml;
    exports com.example.alertas;
}