package com.example.frantarpg;

import com.example.frantarpg.entity.Player;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Overview implements Initializable {
    public ImageView playerImage;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FileInputStream inputstream = null;
        Player player = new Player();
        Image image;

        String test2 = player.getPlayer_class();
        System.out.println("TEST: " + test2);


        switch (test2){

            case "Archer":
                System.out.println("Vidíš Archer");
                try {
                    inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/archer-main-image.jpg");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                 image = new Image(inputstream);
                playerImage.setImage(image);
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
                break;
        }


    }
}

