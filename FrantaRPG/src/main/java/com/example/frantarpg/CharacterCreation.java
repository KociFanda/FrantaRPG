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
        stage.setResizable(true);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageView.fitHeightProperty().bind(mainLayout.heightProperty());
        imageView.fitWidthProperty().bind(mainLayout.widthProperty());
    }

    public void CreateCharacter(ActionEvent actionEvent) {
        player.setName(ChosenName.getText());

     if (ChossenCharacter == "tyler1"){
         player.setHp(150);
         player.setStrength(10);
         player.setAgility(5);
         player.setInteligence(5);
        }
        else if(ChossenCharacter == "mage"){
         player.setHp(80);
         player.setStrength(5);
         player.setAgility(5);
         player.setInteligence(10);

    }
     else if(ChossenCharacter == "archer"){
         player.setHp(100);
         player.setStrength(5);
         player.setAgility(10);
         player.setInteligence(5);
     }

        utills.Save.save(player.getName(),
                player.getHp(),
                player.getStrength(),
                player.getAgility(),
                player.getInteligence(),
                player.getGold());


    }


}
