package utills;

import com.example.frantarpg.entity.Player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Save {
    public static void save(String name, String ClassNAME, int HP, int Strength, int Agility, int Inteligence, int Gold){
        try {
            String kontrola ;
            Player player = new Player();
            FileWriter myWriter = new FileWriter("save.txt");
            BufferedReader br = new BufferedReader((new FileReader("save.txt")));
            myWriter.write(name + "\n " + ClassNAME + "\n " + HP + "\n " + Strength + "\n " + Agility + "\n " + Inteligence + "\n " + Gold );
            myWriter.close();
            kontrola = br.lines();
            System.out.println(kontrola);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
