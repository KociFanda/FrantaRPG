package com.example.frantarpg;

import com.example.frantarpg.entity.Player;
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
    Object object;
    Player player;

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageView.fitWidthProperty().bind(mainLayout.widthProperty());
        imageView.fitHeightProperty().bind(mainLayout.heightProperty());

    }

    public void onNewGameClick(ActionEvent event) throws IOException {
        System.out.println("Creating new window ;] :]");
        utills.CreateWindow.Create(event, object = getClass().getResource("character-creation.fxml"),
                920 , 680, false  );
    }

    public void LoadGame(ActionEvent actionEvent) throws IOException {
        utills.LoadSave.load();
        System.out.println("\n" + "***************" + "Loading game" + "***************");
        utills.CreateWindow.Create(actionEvent, object = getClass().getResource("overview.fxml"),
                805 , 625, true  );
    }

    public void END(ActionEvent actionEvent) {
        System.out.println("Ending the application :]");
        Platform.exit();
    }



    public void Credits(ActionEvent actionEvent) {
        System.out.println("Credits are not finished yet ;( sry");
    }

}
