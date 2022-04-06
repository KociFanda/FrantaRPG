package com.example.frantarpg;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CharacterCreation implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public AnchorPane mainLayout;
    public ImageView imageView;


    public void goBack(MouseEvent event) throws IOException {
        System.out.println("I am going back to the menu");
        root = FXMLLoader.load(getClass().getResource("main-menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageView.fitHeightProperty().bind(mainLayout.heightProperty());
        imageView.fitWidthProperty().bind(mainLayout.widthProperty());
    }

}
