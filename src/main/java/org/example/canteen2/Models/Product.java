package org.example.canteen2.Models;

public class Product {
    private int productID;
    private String productName;
    private int productStockQt;
    private ProductSupplier supplier;

    public Product(int id, String name, ProductSupplier supplier) {
        this.productID = id;
        this.productName = name;
        this.supplier = supplier;
    }

}