module com.example.prueba1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.prueba1 to javafx.fxml;
    exports com.example.prueba1;
}