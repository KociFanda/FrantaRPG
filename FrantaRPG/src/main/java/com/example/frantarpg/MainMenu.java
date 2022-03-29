package com.example.frantarpg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import utills.LoadSave;

import java.io.IOException;

public class MainMenu {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void onNewGameClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("character-creation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void LoadGame(ActionEvent actionEvent) {
        utills.LoadSave.load();
    }
    
}