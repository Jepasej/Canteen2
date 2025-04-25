package org.example.canteen2.Models;

public class Order {


    double totalPrice = 0;

    public void orderToPayment(Order payableOrder){

        Order order = payableOrder;

        Double payableBalance = order.getTotalPrice();
        //paymentnamegetfromLouise.paymentBalance(payableBalance);

    }

    public double getTotalPrice(){
        return totalPrice;
    }
}
