package com.example.frantarpg;

import com.example.frantarpg.entity.Enemy;
import com.example.frantarpg.entity.Player;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Fight implements Initializable {
    public TextArea fightTextArea;
    public ImageView playerImage;
    public Label enemyName;
    public Label playerName;
    public ImageView enemyrImage;

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
                break;
        }

        Image image2;
        try {
            inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/orc.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Enemy enemy = new Enemy("Orc", 100, 10);
        image2 = new Image(inputstream);
        enemyrImage.setImage(image2);
         enemyName.setText(enemy.getName());
    }

}
