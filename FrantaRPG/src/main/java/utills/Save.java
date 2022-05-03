package utills;

import com.example.frantarpg.entity.Player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Save {
    public static void save(String name, int HP, int Strength, int Agility, int Inteligence, int Gold){
        try {
            Player player = new Player();
            FileWriter myWriter = new FileWriter("src/main/java/utills/save.txt");
            myWriter.write(name + HP + Strength + Agility + Inteligence + Gold );
            myWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
