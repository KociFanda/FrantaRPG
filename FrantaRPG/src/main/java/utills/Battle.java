package utills;

import com.example.frantarpg.entity.Enemy;
import com.example.frantarpg.entity.Player;

public class Battle {

    public static void playerAttack(int playerDMG, int enemyHP, Enemy enemy){
        enemyHP = enemyHP - playerDMG;
        enemy.setHp(enemyHP);
    }

    public static void playerDefend(int playerHP, int enemyDMG, String enemyChoice, Player player) {
        if (enemyChoice == "attack"){
            playerHP = playerHP - (enemyDMG/2);
        }
        player.setHp(playerHP);

    }

    public static void enemyAttack(int playerHP, int enemyDMG, Player player){
        playerHP = playerHP - enemyDMG;

        player.setHp(playerHP);

    }
    public static void enemyDefend(int enemyHP, int playerDMG, String playerChoice, Enemy enemy) {
        if (playerChoice == "attack"){
            enemyHP = enemyHP - (playerDMG/2);
        }
        enemy.setHp(enemyHP);


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
