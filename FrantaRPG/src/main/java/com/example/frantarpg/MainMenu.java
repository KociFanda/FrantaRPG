package com.example.frantarpg;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utills.LoadSave;

import java.io.IOException;

public class MainMenu {
    public Button NewGameButton;
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

    public void END(ActionEvent actionEvent) {
        Platform.exit();
    }
/*
    private double baseHeight;
    private double baseWidht;
    public void AnimationStart(MouseEvent mouseEvent) {
        System.out.println("animation start");
        Button button = (Button) mouseEvent.getSource();
        double baseHeight = button.getMaxHeight();
        double baseWidth = button.getMaxWidth();

        button.setMaxWidth(baseWidth*0.7);
        button.setMaxHeight(baseHeight*0.7);
    }
    public void AnimationEnd(MouseEvent mouseEvent) {
        System.out.println("animation end");
        Button button = (Button) mouseEvent.getSource();
        this.baseHeight = baseHeight;
        this.baseWidht  = baseWidht;

        button.setMaxHeight(baseHeight);
       button.setMaxWidth(baseWidht);
       }
       */
}
