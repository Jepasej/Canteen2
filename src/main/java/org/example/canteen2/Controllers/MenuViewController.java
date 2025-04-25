package org.example.canteen2.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.canteen2.Models.MenuItem;
import org.example.canteen2.Models.Payment;
import org.example.canteen2.Service.CostCalculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenuViewController {
    @FXML
    private Button paymentBtn;

    static Payment payment;
    private CostCalculator costCalculator;
    private List<MenuItem> menuItems = new ArrayList<>();


    /**
     * A popup window that sits atop the MenuView window. Here the user can choose how to make the payment.
     * @throws IOException If the file can't be found
     */
    @FXML
    private void choosePayment() throws IOException {
        try {
            FXMLLoader loadPopUp = new FXMLLoader(getClass().getResource("/org/example/canteen2/ChoosePaymentView.fxml"));

            Parent popUpRoot = loadPopUp.load();

            Stage popUpStage = new Stage();
            popUpStage.setTitle("Vælg betalingsform");
            popUpStage.initModality(Modality.APPLICATION_MODAL); //Makes sure the user can't press the scene behind the popup before making a choice in the popup.
            popUpStage.initOwner(paymentBtn.getScene().getWindow());
            popUpStage.setScene(new Scene(popUpRoot));
            popUpStage.showAndWait(); //Awaits the user's choice

            // Chosen payment method is retrieved from the popup.
            // The user selects "account", a new Payment object is created to proceed with account payment.
            String valgt = ChoosePaymentViewController.getSelectedPayment();
            if (valgt != null && valgt.equals("account")) {
                payment = new Payment();
            }
        }
        catch (IOException e) {
            System.out.println("File \"ChoosePaymentView.fxml\" not found");
        }
    }

    /**
     * Shows the order overview with chosen menu items and the total price.
     */
    public void confirmOrder(){
        double total = costCalculator.calcPrice(menuItems);
        //To check if the method shows the correct menuitems and total price. Only for development use
        System.out.println("Du har valgt: " + menuItems);
        System.out.printf("\nTotalprisen er: %2f DKK%n", total);
    }

    public static Payment getPayment() {
        return payment;
    }
}
