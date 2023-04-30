module com.example.generadoraleatorios {
    requires javafx.controls;
    requires javafx.fxml;
                requires kotlin.stdlib;
    
                            
    opens com.example.generadoraleatorios to javafx.fxml;
    exports com.example.generadoraleatorios;
}