package org.example.canteen2.Models;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    private String itemName;
    private Image itemPicture;
    public double priceItemSalad = 35.00;
    public double priceItemSandwich = 50.00;
    public double priceItemBurger = 200.00;


    public static List<MenuItem> menuItems = new ArrayList<>();

    static {
        double priceItemSalad = 35.00;
        double priceItemSandwich = 50.00;
        double priceItemBurger = 200.00;

        menuItems.add(new MenuItem("Salad", priceItemSalad));
        menuItems.add(new MenuItem("Sandwich", priceItemSandwich));
        menuItems.add(new MenuItem("Burger", priceItemBurger));
    }

    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
