package utills;

import com.example.frantarpg.entity.Player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Save {
    public static void save(String name /*objekt CLass s hodnotou bud Tyler1/Archer/Mage a ty classy by v sobe meli info o atributech  */){
        try {
            Player player = new Player("testNamdsadasdasdasdasdasdas");
            FileWriter myWriter = new FileWriter("src/main/java/utills/save.txt");
            myWriter.write("franta\n100\n150\n456" );
            myWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
