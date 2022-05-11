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
import utills.LoadSave;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Overview implements Initializable {
    public ImageView playerImage;
    public Label playerName;
    public TextArea playerStats;
    private Stage stage;
    private Scene scene;
    private Parent root;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FileInputStream inputstream = null;
        Player player = null;
        try {
            player = new Player();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image image;
        String pomocnaPromena = player.getPlayer_class();
        System.out.println("TEST: " + " " +
                player.getName() + " " +
                player.getPlayer_class() + " " +
                player.getHp() + " " +
                player.getStrength() + " " +
                player.getAgility() + " " +
                player.getInteligence() + " " +
                player.getGold() + " " +
                " test ");
        switch (pomocnaPromena) {
            case "Archer":
                System.out.println("Vidíš Archer");
                try {
                    inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/archer-main-image.jpg");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                image = new Image(inputstream);

                playerImage.setImage(image);
                playerName.setText(player.getName());
                playerStats.setText(String.valueOf(
                        "HP: " + player.getHp() + "\n" +
                                "Strength: " + player.getStrength() + "\n" +
                                "Agility: " + player.getAgility() + "\n" +
                                "Inteligence:" + player.getInteligence()));
                break;
            case "Mage":
                System.out.println("Vidíš Mage");
                try {
                    inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/mage-main-image.jpg");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                image = new Image(inputstream);

                playerImage.setImage(image);
                playerName.setText(player.getName());
                playerStats.setText(String.valueOf(
                        "HP: " + player.getHp() + "\n" +
                                "Strength: " + player.getStrength() + "\n" +
                                "Agility: " + player.getAgility() + "\n" +
                                "Inteligence:" + player.getInteligence()));
                break;
            case "Tyler1":
                System.out.println("Vidíš Tyler1");
                try {
                    inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/tyler1-main-image.jpg");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                image = new Image(inputstream);

                playerImage.setImage(image);
                playerName.setText(player.getName());
                playerStats.setText(String.valueOf(
                        "HP: " + player.getHp() + "\n" +
                                "Strength: " + player.getStrength() + "\n" +
                                "Agility: " + player.getAgility() + "\n" +
                                "Inteligence:" + player.getInteligence()));
                break;
        }
    }


    public void goback(ActionEvent actionEvent) throws IOException {
        System.out.println("I am going back to the menu");
        root = FXMLLoader.load(getClass().getResource("main-menu.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaxHeight(480);
        stage.setMaxWidth(720);
        stage.setMinHeight(480);
        stage.setMinWidth(720);
        stage.setResizable(true);
        stage.show();
    }
}

