module com.example.ejemplomenus {
    requires javafx.controls;
    requires javafx.fxml;
                requires kotlin.stdlib;
    
                            
    opens com.example.ejemplomenus to javafx.fxml;
    exports com.example.ejemplomenus;
}