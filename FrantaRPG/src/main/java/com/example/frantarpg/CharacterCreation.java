package com.example.frantarpg;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CharacterCreation implements Initializable {
    public TextArea classInfo;
    public ImageView characterMainImageTyler;
    public ImageView characterMainImageArcher;
    public ImageView characterMainImageMage;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public AnchorPane mainLayout;
    public ImageView imageView;

public void tyler1Choosen(ActionEvent event){
       /* File file = new File("src/main/resources/img/tyler1-main-image.jpg");
        Image image = new Image(file.toURI().toString());
        characterMainImage.setImage(image); */
   characterMainImageTyler.setVisible(true);
characterMainImageArcher.setVisible(false);
characterMainImageMage.setVisible(false);
   classInfo.setText(
           "Class name:Tyler1\n" +
           "HP:150\n" +
           "STR:10\n" +
           "AGI:5\n" +
           "INT:5\n" );

    }

    public void ArcherChoosen(ActionEvent event){
        characterMainImageArcher.setVisible(true);
        characterMainImageTyler.setVisible(false);
        characterMainImageMage.setVisible(false);
        classInfo.setText(
                "Class name:Archer\n" +
                        "HP:100\n" +
                        "STR:5\n" +
                        "AGI:10\n" +
                        "INT:5\n" );

    }

    public void MageChoosen(ActionEvent event){
       characterMainImageMage.setVisible(true);
        characterMainImageArcher.setVisible(false);
        characterMainImageTyler.setVisible(false);
        classInfo.setText(
                "Class name:Mage\n" +
                        "HP:80\n" +
                        "STR:5\n" +
                        "AGI:5\n" +
                        "INT:10" );

    }

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
