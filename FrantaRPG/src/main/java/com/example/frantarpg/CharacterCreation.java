package com.example.frantarpg;

import com.example.frantarpg.entity.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CharacterCreation implements Initializable {
    public TextArea classInfo;
    public ImageView characterMainImageTyler;
    public ImageView characterMainImageArcher;
    public ImageView characterMainImageMage;
    public TextField ChosenName;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public AnchorPane mainLayout;
    public ImageView imageView;
    public String ChossenCharacter;
    public Player player;

public void tyler1Chosen(ActionEvent event){
    characterMainImageTyler.setVisible(true);
    characterMainImageArcher.setVisible(false);
    characterMainImageMage.setVisible(false);
    classInfo.setText(
           "Class name:Tyler1\n" +
           "HP:150\n" +
           "STR:10\n" +
           "AGI:5\n" +
           "INT:5\n" );
        ChossenCharacter = "tyler1";
    }


    public void ArcherChosen(ActionEvent event){
        characterMainImageArcher.setVisible(true);
        characterMainImageTyler.setVisible(false);
        characterMainImageMage.setVisible(false);
        classInfo.setText(
                "Class name:Archer\n" +
                        "HP:100\n" +
                        "STR:5\n" +
                        "AGI:10\n" +
                        "INT:5\n" );
        ChossenCharacter = "archer";
    }

    public void MageChosen(ActionEvent event){
       characterMainImageMage.setVisible(true);
        characterMainImageArcher.setVisible(false);
        characterMainImageTyler.setVisible(false);
        classInfo.setText(
                "Class name:Mage\n" +
                        "HP:80\n" +
                        "STR:5\n" +
                        "AGI:5\n" +
                        "INT:10" );
        ChossenCharacter = "mage";
    }

    public void goBack(MouseEvent event) throws IOException {
        System.out.println("I am going back to the menu");
        root = FXMLLoader.load(getClass().getResource("main-menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaxHeight(480);
        stage.setMaxWidth(720);
        stage.setMinHeight(480);
        stage.setMinWidth(720);
        stage.setResizable(true);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageView.fitHeightProperty().bind(mainLayout.heightProperty());
        imageView.fitWidthProperty().bind(mainLayout.widthProperty());
    }

    public void CreateCharacter(ActionEvent actionEvent) {

        String name="Bezejmeny";
        int HP = 0;
        int Strength = 0;
        int Agility = 0;
        int Inteligence = 0;
        int Gold = 0;
     if (ChossenCharacter == "tyler1"){
        name = ChosenName.getText();
        HP = 100;
        Strength= 12;
        Agility= 5 ;
        Inteligence = 1;
        Gold = 50;

        }
     if(ChossenCharacter == "mage"){
         name = ChosenName.getText();
         HP = 70;
         Strength= 5;
         Agility= 6 ;
         Inteligence = 10;
         Gold = 70;
    }
     if(ChossenCharacter == "archer"){
         name = ChosenName.getText();
         HP = 70;
         Strength= 4;
         Agility= 10 ;
         Inteligence = 4;
         Gold = 20;
     }

        utills.Save.save( name,  HP,  Strength,  Agility,  Inteligence,  Gold);


    }


}
