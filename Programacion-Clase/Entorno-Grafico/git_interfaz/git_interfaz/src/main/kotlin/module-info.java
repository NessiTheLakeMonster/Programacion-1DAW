module com.example.git_interfaz {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.git_interfaz to javafx.fxml;
    exports com.example.git_interfaz;
}