module com.example.roman {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.roman to javafx.fxml;
    exports com.example.roman;
}