package org.example.canteen2.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ChoosePaymentViewController {
    private static String selectedPayment = null;

    @FXML
    private Button accountBtn;


    public static String getSelectedPayment() {
        return selectedPayment;
    }

    /**
     * Used when selcted payment method is account.
     */
    @FXML
    private void accountPayment() {
        selectedPayment = "account";
    }
}
