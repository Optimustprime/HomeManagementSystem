package com.example.homemanagementsystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class WelcomeController implements Initializable {




    @FXML
    private Button registerButton;

    @FXML
    private Button registerHouse;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                registerButton.getScene().getWindow().hide();
                Stage main = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("fxml_register.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root);
                main.setScene(scene);
                main.setTitle("Register");
                main.show();
                main.setResizable(false);
            }
        });

        registerHouse.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                registerHouse.getScene().getWindow().hide();
                Stage main = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("fxml_properties.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root);
                main.setScene(scene);
                main.setTitle("Properties");
                main.show();
//                main.setResizable(false);
            }
        });

    }
}
