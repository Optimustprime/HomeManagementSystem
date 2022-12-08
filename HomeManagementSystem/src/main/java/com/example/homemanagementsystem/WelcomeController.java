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

import java.net.URL;
import java.util.ResourceBundle;


public class WelcomeController implements Initializable {




    @FXML
    private Button register;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        register.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                register.getScene().getWindow().hide();
                Stage main = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("fxml_main.fxml"));
                Scene scene = new Scene(root);
                main.setScene(scene);
                main.setTitle("Rent Manager");
                main.show();
                main.setResizable(false);
            }
        });

    }
}
