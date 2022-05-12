package utills;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CreateWindow {
    private static Stage stage;
    private static Scene scene;
    private static Parent root;
    public static void Create(Object source, ActionEvent event) throws IOException {
        root = FXMLLoader.load((URL) source);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
