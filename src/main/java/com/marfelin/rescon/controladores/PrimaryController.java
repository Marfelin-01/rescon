package com.marfelin.rescon.controladores;

import java.io.IOException;

import com.marfelin.rescon.App;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
