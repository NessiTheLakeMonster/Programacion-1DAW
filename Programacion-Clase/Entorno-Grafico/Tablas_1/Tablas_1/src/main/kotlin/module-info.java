module com.example.tablas_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.tablas_1 to javafx.fxml;
    exports com.example.tablas_1;
}