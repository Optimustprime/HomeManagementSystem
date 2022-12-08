package com.example.homemanagementsystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ErrorController implements Initializable {

    @FXML
    private Button errrorCancel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errrorCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                errrorCancel.getScene().getWindow().hide();
            }
        });

    }

}
