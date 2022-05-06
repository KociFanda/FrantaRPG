package com.example.frantarpg;

import com.example.frantarpg.entity.Player;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

        String test2 = player.getPlayer_class();
        String test3 = player.getName();
        System.out.println("TEST: " + test2 + test3 + " test ");


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
                playerName.setText(player.getName());
                playerStats.setText(String.valueOf(player.getHp() + "\n" + player.getStrength() + "\n" + player.getAgility() + "\n" + player.getInteligence()));
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


    }

    public void buttonClick(ActionEvent actionEvent) throws IOException {
        Player player = new Player();
        String test2 = player.getPlayer_class();
        String test3 = player.getName();
        System.out.println("TEST: " + test2 + test3 + " test ");
    }
}

