package com.example.frantarpg;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenu implements Initializable {
    public Button NewGameButton;
    public AnchorPane mainLayout;
    public ImageView imageView;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void onNewGameClick(ActionEvent event) throws IOException {
        System.out.println("Creating new window ;] :]");
        root = FXMLLoader.load(getClass().getResource("character-creation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);;
        stage.setScene(scene);
        stage.show();

    }

    public void LoadGame(ActionEvent actionEvent) {
        utills.LoadSave.load();
    }

    public void END(ActionEvent actionEvent) {
        System.out.println("Ending the application :]");
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageView.fitWidthProperty().bind(mainLayout.widthProperty());
        imageView.fitHeightProperty().bind(mainLayout.heightProperty());

    }

    public void Credits(ActionEvent actionEvent) {
        System.out.println("Credits are not finished yet ;( sry");
    }

}
