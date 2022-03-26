package com.example.frantarpg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import utills.LoadSave;

public class MainMenu {

    @FXML
    public void onNewGameClick(ActionEvent actionEvent) {
        utills.Save.save();
    }

    public void LoadGame(ActionEvent actionEvent) {
        utills.LoadSave.load();
    }
    
}