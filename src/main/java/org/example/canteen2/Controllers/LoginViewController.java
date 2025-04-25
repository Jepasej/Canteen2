package org.example.canteen2.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.canteen2.HelloApplication;

public class LoginViewController {
    @FXML
    private Button oneButton, loginBtn;
    @FXML
    private TextField fldOne, fldTwo, fldThree, fldFour;

    private StringBuilder userInput = new StringBuilder();

    /**
     * Depending on the user's inputs, numbers are shown in the textFields
     */
    private void fldNumberInput() {
        TextField[] fields = {fldOne, fldTwo, fldThree, fldFour};

        for (int i = 0; i < fields.length; i++) {
            if (i < userInput.length()) {
                fields[i].setText(String.valueOf(userInput.charAt(i)));
            } else {
                fields[i].clear();
            }
        }
    }

    @FXML
    private void clickOne(){
        if (userInput.length() < 4) {
            userInput.append("1");
            fldNumberInput();
        }
    }

    @FXML
    private void clickLogin(){
        if (userInput.length() == 4) {
            HelloApplication.changeScene(ControllerNames.MenuView);
        }
        else {
            System.out.println("Der skal indtastes 4 cifre");
        }
    }

}