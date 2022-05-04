package utills;

import com.example.frantarpg.entity.Player;
import java.io.BufferedReader;
import java.io.FileReader;

public class LoadSave {
    public static void load(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("save.txt"));
            Player player = new Player();
            player.setName(br.readLine());
            player.setHp(Integer.parseInt(br.readLine()));
            player.setGold(Integer.parseInt(br.readLine()));


            System.out.println();
            System.out.println(player.getName());
            System.out.println(player.getHp());
            System.out.println(player.getGold());

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
