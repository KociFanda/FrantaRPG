package utills;

import com.example.frantarpg.entity.Enemy;
import com.example.frantarpg.entity.Player;

import java.util.Random;

public class Battle {
    //Pracuji s tim jenom tady
    private static String enemyChoice;

    public static void playerAttack(int playerDMG, int enemyHP, Enemy enemy){
        enemyHP = enemyHP - playerDMG;
        enemy.setHp(enemyHP);
    }

    public static void playerDefend(int playerHP, int enemyDMG, Player player) {
        if (enemyChoice == "attack"){
            playerHP = playerHP  + (enemyDMG/2);
        }
        player.setHp(playerHP);
    }

    public  static void enemyResponse(int playerHP,int playerDMG, int enemyDMG,  int enemyHP, Enemy enemy, Player player, String playerChoice){
        Random random= new Random();
        int response = random.nextInt(2);
        switch (response){
            //Nepřítel zaútočí
            case 0:
                enemyChoice="attack";
                playerHP = playerHP - enemyDMG;
                player.setHp(playerHP);
                break;
                //Nepřítel se brání
            case 1:
                enemyChoice="defend";
                if (playerChoice == "attack"){
                    enemyHP = enemyHP + (playerDMG/2);
                }
                enemy.setHp(enemyHP);
        }

    }

}
