module com.example.apicomida {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apicomida to javafx.fxml;
    exports com.example.apicomida;
}