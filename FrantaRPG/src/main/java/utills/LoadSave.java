package utills;

import com.example.frantarpg.entity.Player;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;

public class LoadSave {
    public static void load(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("save.txt"));
            Player player= new Player();
/*
            String[] pomocnaPoleOrna_a_ValecnaKamo;
            String docasnyString = br.readLine();
            pomocnaPoleOrna_a_ValecnaKamo = docasnyString.split(" ", 7);
  */
           /* System.out.println(pomocnaPoleOrna_a_ValecnaKamo[0]);//Jmeno
            System.out.println(pomocnaPoleOrna_a_ValecnaKamo[1]);//Class
            System.out.println(pomocnaPoleOrna_a_ValecnaKamo[2]);//HP
            System.out.println(pomocnaPoleOrna_a_ValecnaKamo[3]);//Str
            System.out.println(pomocnaPoleOrna_a_ValecnaKamo[4]);//Agi
            System.out.println(pomocnaPoleOrna_a_ValecnaKamo[5]);//Int
            System.out.println(pomocnaPoleOrna_a_ValecnaKamo[6]);//Gold*/
/*
            player.setName(pomocnaPoleOrna_a_ValecnaKamo[0]);
            player.setPlayer_class(pomocnaPoleOrna_a_ValecnaKamo[1]);
            player.setHp(Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[2]));
            player.setStrength(Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[3]));
            player.setAgility(Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[4]));
            player.setInteligence(Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[5]));
            player.setGold(Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[6]));
*/
            System.out.println("A co ma objekt PLAYER je  :-) = " +
                    player.getName() + " " +
                    player.getPlayer_class() + " " +
                    player.getHp() + " " +
                    player.getStrength() + " " +
                    player.getAgility() + " " +
                    player.getInteligence() + " " +
                    player.getGold()
            );
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
