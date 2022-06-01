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
    public int maxPlayerHP = player.getHp();
    Enemy enemy = new Enemy("Orc", 100,11 );
    public int maxEnemyHP = enemy.getHp();


    public void initialize(URL url, ResourceBundle resourceBundle) {
        setFightImageAndName();
        playerHP.setText(String.valueOf(player.getHp()));
        enemyHP.setText(String.valueOf(enemy.getHp()));
    }

    public void setFightImageAndName() {
        System.out.println("Vidis " + player.getPlayer_class());
        playerImage.setImage(player.getPlayer_avatar());
        playerName.setText(player.getName());

        FileInputStream inputstream = null;
        Image image2;
        try {
            inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/orc.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        image2 = new Image(inputstream);
        enemyImage.setImage(image2);
        enemyName.setText(enemy.getName());
    }

    public void attack(ActionEvent actionEvent) throws IOException {
        playerChoice="attack";
        utills.Battle.playerAttack(player.getStrength(),enemy.getHp(),enemy);
        utills.Battle.enemyResponse(player.getHp(),player.getStrength(),enemy.getDmg(),enemy.getHp(),enemy,player,playerChoice);
//Aktualizace životů
        playerHP.setText(String.valueOf(player.getHp()));
        playerHPbar.setProgress(Double.valueOf(player.getHp())/maxPlayerHP);
        enemyHP.setText(String.valueOf(enemy.getHp()));
        enemyHPbar.setProgress(Double.valueOf(enemy.getHp())/maxEnemyHP);
        object = getClass().getResource("overview.fxml");
        //kontrola jestli někdo umřel
        utills.IsDead.check(player.getHp(),enemy.getHp(), actionEvent, object);
    }


    public void defend(ActionEvent actionEvent) throws IOException {

        playerChoice="defend";
        utills.Battle.enemyResponse(player.getHp(),player.getStrength(),enemy.getDmg(),enemy.getHp(),enemy,player,playerChoice);
        utills.Battle.playerDefend(player.getHp(),enemy.getDmg(),player);
        //Aktualizace životů
        playerHP.setText(String.valueOf(player.getHp()));
        playerHPbar.setProgress(Double.valueOf(player.getHp())/maxPlayerHP);
        enemyHP.setText(String.valueOf(enemy.getHp()));
        enemyHPbar.setProgress(Double.valueOf(enemy.getHp())/maxEnemyHP);
        object = getClass().getResource("overview.fxml");
        //kontrola jestli někdo umřel
        utills.IsDead.check(player.getHp(),enemy.getHp(), actionEvent, object);
    }
}
