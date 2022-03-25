package com.example.lab17_15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button ButtonOne;

    @FXML
    private Button ButtonTwo;

    @FXML
    TextField Number;

    @FXML
    public void ClickButton1(ActionEvent event) {
        int value = Integer.parseInt(Number.getText());
        if (value < 3) {
            value++;
            Number.setText(Integer.toString(value));
        }
    }
    @FXML
    public void ClickButton2 (ActionEvent event){
        int value = Integer.parseInt(Number.getText());
        if (value > -5) {
            value--;
            Number.setText(Integer.toString(value));
        }
    }

}