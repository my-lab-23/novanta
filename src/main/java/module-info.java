module com.example.novanta {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires kotlin.csv.jvm;
    //requires MyOS.assembly;

    opens com.example.novanta to javafx.fxml;
    exports com.example.novanta;
}