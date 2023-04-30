module com.example.prueba2 {
    requires javafx.controls;
    requires javafx.fxml;
                requires kotlin.stdlib;
    
                            
    opens com.example.prueba2 to javafx.fxml;
    exports com.example.prueba2;
}