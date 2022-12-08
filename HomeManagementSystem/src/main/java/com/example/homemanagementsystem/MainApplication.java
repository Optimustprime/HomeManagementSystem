package com.example.homemanagementsystem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    private Label mylabel;
    private TextField name;
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml_main.fxml"));
        stage.setTitle("Welcome");
        stage.setScene(new Scene(root, 700, 400));
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}