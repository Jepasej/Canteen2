package org.example.canteen2.Service;

import org.example.canteen2.Models.MenuItem;
import java.util.List;

/**
 * This class is responsible for calculating the total price of menu items.
 */

public class CostCalculator
{
    /**
     * Calculates the total price of the list of menu items
     * @param menuItems A List of MenuItem objects representing the items to be priced
     * @return The total price of all the menu items in the list.
     */
    public double calcPrice(List<MenuItem> menuItems)
    {
        //Variable to hold the cumulative total price
        double total = 0;

        //Loop through each menu item and add its price to the total price
        for (MenuItem menuItem : menuItems)
        {
            total += menuItem.getPrice();
        }

        //Return the calculated total price
        return total;
    }


}
