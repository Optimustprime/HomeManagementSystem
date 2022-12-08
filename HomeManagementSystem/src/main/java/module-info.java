module com.example.homemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires validatorfx;

    opens com.example.homemanagementsystem to javafx.fxml;
    exports com.example.homemanagementsystem;
}