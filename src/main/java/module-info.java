module com.example.novanta {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.novanta to javafx.fxml;
    exports com.example.novanta;
}