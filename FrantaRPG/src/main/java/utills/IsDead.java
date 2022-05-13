package utills;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.IOException;
import java.util.Optional;

public class IsDead {


    public static void check(int playerHP, int enemyHP, ActionEvent actionEvent, Object object ) throws IOException {
        if (enemyHP <= 0){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("END");
            alert.setContentText("You have WON. What a chad");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object,
                        805 , 625, true  );
            } else {
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object,
                        805 , 625, true  );
            }
        }
        else if (playerHP <= 0) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("THE END");
            alert.setContentText("You have lost to the orc. Comeback stronger");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object ,
                        805 , 625, true  );
            } else {
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object ,
                        805 , 625, true  );
            }
        }
        else if (playerHP <= 0 && enemyHP <= 0 ) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("THE END");
            alert.setContentText("Its a draw. You have both died. A dead hero cant claim any gold, can he ? ");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object ,
                        805 , 625, true  );
            } else {
                System.out.println("I am going back to the overview");
                utills.CreateWindow.Create(actionEvent, object ,
                        805 , 625, true  );
            }
        }
    }
}
