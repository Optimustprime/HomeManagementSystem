package com.example.homemanagementsystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PropertiesController /*implements Initializable*/ {


    @FXML
    private TableColumn<?, ?> listed;

    @FXML
    private TableColumn<?, ?> bedroom;

    @FXML
    private TableColumn<?, ?> bathroom;

    @FXML
    private TableColumn<?, ?> rent;

    @FXML
    private TableColumn<?, ?> size;

    @FXML
    private TableColumn<?, ?> post;

    @FXML
    private TableColumn<?, ?> latitude;

    @FXML
    private TableColumn<?, ?> furniture;

    @FXML
    private TableColumn<?, ?> type;

    @FXML
    private TableColumn<?, ?> garden;

    @FXML
    private TextField listedInput;

    @FXML
    private TextField gardenInput;

    @FXML
    private TextField typeInput;

    @FXML
    private TextField sizeInput;

    @FXML
    private TextField rentInput;

    @FXML
    private TextField bathroomInput;

    @FXML
    private TextField bedroomInput;

    @FXML
    private TextField latitudeInpud;

    @FXML
    private TextField postcodeInput;

    @FXML
    private TextField furnishingInput;

    @FXML
    private Button addPro;

    @FXML
    private Button editPro;

    @FXML
    private Button deletePro;



//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        registerButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                registerButton.getScene().getWindow().hide();
//                Stage main = new Stage();
//                Parent root = null;
//                try {
//                    root = FXMLLoader.load(getClass().getResource("fxml_register.fxml"));
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                Scene scene = new Scene(root);
//                main.setScene(scene);
//                main.setTitle("Register");
//                main.show();
//                main.setResizable(false);
//            }
//        });
//
//    }
}
