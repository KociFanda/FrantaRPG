package utills;

import com.example.frantarpg.entity.Player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Save {

    public static void save(String name, String ClassNAME, int HP, int Strength, int Agility, int Inteligence, int Gold){
        try {
            String kontrola;
            Player player = new Player();
            FileWriter myWriter = new FileWriter("save.txt");
            BufferedReader br = new BufferedReader((new FileReader("save.txt")));
            myWriter.write(name + " " + ClassNAME + " " + HP + " " + Strength + " " + Agility + " " + Inteligence + " " + Gold );
            myWriter.close();
            kontrola = br.readLine();
            System.out.println("Zapisuji: " + kontrola);

            player.setName(name);
            player.setPlayer_class(ClassNAME);
            player.setHp(Integer.parseInt(String.valueOf(HP)));
            player.setStrength(Integer.parseInt(String.valueOf(Strength)));
            player.setAgility(Integer.parseInt(String.valueOf(Agility)));
            player.setInteligence(Integer.parseInt(String.valueOf(Inteligence)));
            player.setGold(Integer.parseInt(String.valueOf(Gold)));

            System.out.println("A co ma objekt PLAYER je  :-) = " +
                    player.getName() + " " +
                    player.getPlayer_class() + " " +
                    player.getHp() + " " +
                    player.getStrength() + " " +
                    player.getAgility() + " " +
                    player.getInteligence() + " " +
                    player.getGold()
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
