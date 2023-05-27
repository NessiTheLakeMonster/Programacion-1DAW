module com.example.ejerciciomenubbddtabla {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.ejerciciomenubbddtabla to javafx.fxml;
    exports com.example.ejerciciomenubbddtabla;
}