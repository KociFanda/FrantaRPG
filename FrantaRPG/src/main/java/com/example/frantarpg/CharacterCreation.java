package com.example.frantarpg;

import com.example.frantarpg.entity.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
    public ImageView questionMark;
    public Label warning;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public AnchorPane mainLayout;
    public ImageView imageView;
    public String ChossenCharacter = "no";
    Object object;
    public Player player;

public void tyler1Chosen(ActionEvent event){
    questionMark.setVisible(false);
    characterMainImageTyler.setVisible(true);
    characterMainImageArcher.setVisible(false);
    characterMainImageMage.setVisible(false);
    classInfo.setText(
           "Class name:Tyler1\n" +
           "HP:100\n" +
           "STR:12\n" +
           "AGI:5\n" +
           "INT:1\n" );
        ChossenCharacter = "tyler1";
    }


    public void ArcherChosen(ActionEvent event){
        questionMark.setVisible(false);
        characterMainImageArcher.setVisible(true);
        characterMainImageTyler.setVisible(false);
        characterMainImageMage.setVisible(false);
        classInfo.setText(
                "Class name:Archer\n" +
                        "HP:70\n" +
                        "STR:5\n" +
                        "AGI:10\n" +
                        "INT:5\n" );
        ChossenCharacter = "archer";
    }

    public void MageChosen(ActionEvent event){
        questionMark.setVisible(false);
       characterMainImageMage.setVisible(true);
        characterMainImageArcher.setVisible(false);
        characterMainImageTyler.setVisible(false);
        classInfo.setText(
                "Class name:Mage\n" +
                        "HP:70\n" +
                        "STR:5\n" +
                        "AGI:5\n" +
                        "INT:10" );
        ChossenCharacter = "mage";
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageView.fitHeightProperty().bind(mainLayout.heightProperty());
        imageView.fitWidthProperty().bind(mainLayout.widthProperty());
    }

    public void CreateCharacter(ActionEvent actionEvent) throws IOException {

        String name="Bezejmeny";
        String ClassNAME= "nodata";
        int HP = 0;
        int Strength = 0;
        int Agility = 0;
        int Inteligence = 0;
        int Gold = 0;

        if (ChossenCharacter == "no") {
            warning.setVisible(true);
        }
        else{
     if (ChossenCharacter == "tyler1"){
        name = ChosenName.getText();
         name = name.replace(" ", "");
        ClassNAME = "Tyler1";
        HP = 100;
        Strength= 12;
        Agility= 5 ;
        Inteligence = 1;
        Gold = 50;
         ChossenCharacter = "no";

        }
     if(ChossenCharacter == "mage"){
         name = ChosenName.getText();
         name = name.replace(" ", "");
         ClassNAME = "Mage";
         HP = 70;
         Strength= 5;
         Agility= 5 ;
         Inteligence = 10;
         Gold = 70;
         ChossenCharacter = "no";
    }
     if(ChossenCharacter == "archer"){
         name = ChosenName.getText();
         name = name.replace(" ", "");
         ClassNAME = "Archer";
         HP = 70;
         Strength= 5;
         Agility= 10 ;
         Inteligence = 5;
         Gold = 20;
         ChossenCharacter = "no";
     }
     if(name == "" ){ name = "NoName" ;}

        utills.Save.save( name,  ClassNAME, HP,  Strength,  Agility,  Inteligence,  Gold);




        System.out.println("\n" + "***************" + "Creating new game" + "***************");
            utills.CreateWindow.Create(actionEvent, object = getClass().getResource("overview.fxml"),
                    805 , 625, true  );

        }
}

    public void goBack(ActionEvent actionEvent) throws IOException {
        System.out.println("I am going back to the menu");
        utills.CreateWindow.Create(actionEvent, object = getClass().getResource("main-menu.fxml"),
                720 , 480, true  );
    }
}
