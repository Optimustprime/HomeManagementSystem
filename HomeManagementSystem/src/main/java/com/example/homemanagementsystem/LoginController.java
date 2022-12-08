package com.example.homemanagementsystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button clickButton;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clickButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    validation();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
    private void validation() throws IOException {
        String usernameText = username.getText();
        String passwordText = password.getText();
        clickButton.getScene().getWindow().hide();
        if(usernameText.equals("") && passwordText.equals("")){
            Stage main = new Stage();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml_main.fxml")));
            Scene scene = new Scene(root);
            main.setScene(scene);
            main.setTitle("Rent Manager");
            main.show();
            main.setResizable(false);
        }
        else{
            Stage main = new Stage();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml_error.fxml")));
            Scene scene = new Scene(root);
            main.setScene(scene);
            main.setTitle("Error Validation");
            main.show();
        }
    }
}
