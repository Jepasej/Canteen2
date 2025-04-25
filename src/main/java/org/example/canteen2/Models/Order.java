package org.example.canteen2.Models;

import org.example.canteen2.Controllers.MenuViewController;

public class Order {


    double totalPrice = 0;

    /**
     * Receives an order from menuview and returns a boolean specifying whether transaction was succesful
     * @param payableOrder
     * @return true = payment successful. false = payment unsuccessful
     */
    public double orderToPayment(Order payableOrder){
        Order order = payableOrder;
        double orderPaid;

        Double payableBalance = payableOrder.getTotalPrice();
        orderPaid = MenuViewController.getPayment().paymentBalance(payableBalance);
    }

    public double getTotalPrice(){
        return totalPrice;
    }
}
