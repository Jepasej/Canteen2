package org.example.canteen2.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Order
{
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
