package utills;

import com.example.frantarpg.entity.Enemy;
import com.example.frantarpg.entity.Player;

import java.util.Random;

public class Battle {

    public static void playerAttack(int playerDMG, int enemyHP, Enemy enemy){
        System.out.println("enemy hp is:" + enemyHP);
        enemyHP = enemyHP - playerDMG;
        System.out.println("player dmg is:" + playerDMG);
        System.out.println("enemy hp is:" + enemyHP);
        enemy.setHp(enemyHP);
    }

    public static void playerDefend(int playerHP, int enemyDMG, String enemyChoice, Player player) {
        if (enemyChoice == "attack"){
            playerHP = playerHP - (enemyDMG/2);
        }
        player.setHp(playerHP);

    }
    public  static void enemyResponse(int playerHP,int playerDMG, int enemyDMG,  int enemyHP, Enemy enemy, Player player, String playerChoice ){
        Random random= new Random();
        int response = random.nextInt(2);
        switch (response){
            //Nepřítel zaútočí
            case 0:
                playerHP = playerHP - enemyDMG;
                player.setHp(playerHP);
                break;
                //Nepřítel se brání
            case 1:
                if (playerChoice == "attack"){
                    enemyHP = enemyHP + (playerDMG/2);
                }
                enemy.setHp(enemyHP);
        }

    }



/*
    public static void start(Enemy enemy) throws IOException {
Player player = new Player();
        int round = 1;
        while (player.getHp() > 0 || enemy.getHP > 0) {
            if (round % 2 == 0){
                if (playerChoice == "attack" ){
                    player.doDamage(enemy.getHP);

                }
                if (playerChoice == "defend" ){
                    player.defend(enemy.getDmg);

                }

                round++;
            }
            if(round % 2 != 0){

            }



        }
    }*/
}
