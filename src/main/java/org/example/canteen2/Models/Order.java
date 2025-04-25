package org.example.canteen2.Models;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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
        double orderPrice;

        Double payableBalance = order.getTotalPrice();
        orderPrice = MenuViewController.getPayment().paymentBalance(payableBalance);

        return orderPrice;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    private List<MenuItem> orderItems = new ArrayList<>();

    public void addItem(MenuItem item)
    {
        orderItems.add(item);
        System.out.println(item.getName() + " added to order.");
    }

    public void updateStorage()
        {

            //Takes the items added into the ArrayList and makes subtracts them from the database with
            //the help of Stored Procedures and callable Statements.
        }
}
