package org.example.canteen2.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.canteen2.Models.Payment;

import java.io.IOException;

public class MenuViewController {
    @FXML
    private Button paymentBtn;

    Payment payment;
    /**
     * A popup window that sits atop the MenuView window. Here the user can choose how to make the payment.
     * @throws IOException If the file can't be found
     */
    @FXML
    private void choosePayment() throws IOException {
        try {
            FXMLLoader loadPopUp = new FXMLLoader(getClass().getResource("/org/example/canteen2/ChoosePaymentView.fxml"));
            System.out.println("Loader URL: " + getClass().getResource("ChoosePaymentView.fxml"));

            Parent popUpRoot = loadPopUp.load();

            Stage popUpStage = new Stage();
            popUpStage.setTitle("Vælg betalingsform");
            popUpStage.initModality(Modality.APPLICATION_MODAL); //Makes sure the user can't press the scene behind the popup before making a choice in the popup.
            popUpStage.initOwner(paymentBtn.getScene().getWindow());
            popUpStage.setScene(new Scene(popUpRoot));
            popUpStage.showAndWait(); //Awaits the user's choice
        }
        catch (IOException e) {
            System.out.println("Fil \"ChoosePaymentView.fxml\" ikke fundet");
        }
    }

    public static Payment getPayment() {
        return payment;
    }
}
