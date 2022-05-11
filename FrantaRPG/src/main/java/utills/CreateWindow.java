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

    public static void Create(ActionEvent event, Object object, int width, int height, boolean resizable) throws IOException {

        root = FXMLLoader.load((URL) object);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaxHeight(height);
        stage.setMaxWidth(width);
        stage.setMinHeight(height);
        stage.setMinWidth(width);
        stage.setResizable(true);
        stage.show();
    }
}
