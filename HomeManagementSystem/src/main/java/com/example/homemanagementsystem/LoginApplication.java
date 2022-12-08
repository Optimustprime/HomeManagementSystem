package com.example.homemanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class LinkedApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml_linked.fxml"));
        stage.setTitle("LinkedApp");
        stage.setScene(new Scene(root, 700, 400));
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}