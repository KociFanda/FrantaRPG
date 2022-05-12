package com.example.frantarpg;

import com.example.frantarpg.entity.Enemy;
import com.example.frantarpg.entity.Player;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Fight implements Initializable {
    public TextArea fightTextArea;
    public ImageView playerImage;
    public Label enemyName;
    public Label playerName;
    public ImageView enemyImage;
    public ProgressBar enemyHPbar;
    public ProgressBar playerHPbar;
    public Label enemyHP;
    public Label playerHP;
    Object object;
    String playerChoice;
    //Tvorba hráče a nepřítele
    Player player;
    {
        try {
            player = new Player();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    Enemy enemy = new Enemy("Orc", 100,10);

    public void initialize(URL url, ResourceBundle resourceBundle) {
        FileInputStream inputstream = null;
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

        image2 = new Image(inputstream);
        enemyImage.setImage(image2);
        enemyName.setText(enemy.getName());

        playerHP.setText(String.valueOf(player.getHp()));
        enemyHP.setText(String.valueOf(enemy.getHp()));
    }

    public void attack(ActionEvent actionEvent) throws IOException {
        playerChoice="attack";
        utills.Battle.playerAttack(player.getStrength(),enemy.getHp(),enemy);
        utills.Battle.enemyResponse(player.getHp(),player.getStrength(),enemy.getDmg(),enemy.getHp(),enemy,player,playerChoice);

        playerHP.setText(String.valueOf(player.getHp()));
        enemyHP.setText(String.valueOf(enemy.getHp()));


        if (enemy.getHp() <= 0){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("END");
            alert.setContentText("You have WON. What a chad");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object = getClass().getResource("overview.fxml"),
                        805 , 625, true  );
            } else {
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object = getClass().getResource("overview.fxml"),
                        805 , 625, true  );
            }
        }
        if (player.getHp() <= 0) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("THE END");
            alert.setContentText("You have lost to the orc. Comeback stronger");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object = getClass().getResource("overview.fxml"),
                        805 , 625, true  );
            } else {
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object = getClass().getResource("overview.fxml"),
                        805 , 625, true  );
            }
        }
    }

}
