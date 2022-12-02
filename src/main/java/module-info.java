module com.example.lab_assesment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lab_assesment to javafx.fxml;
    exports com.example.lab_assesment;
}