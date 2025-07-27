package com.marfelin.rescon.controladores;

import java.io.IOException;

import com.marfelin.rescon.App;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}