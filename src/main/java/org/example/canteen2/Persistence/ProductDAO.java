package org.example.canteen2.Persistence;

import org.example.canteen2.Models.Product;

import java.util.List;

public interface ProductDAO
{
    // CRUD support med 5 metoder.

    public boolean addProduct(Product p) throws Exception;// Tilføje eller skrive et produkt eller Create i CRUD

    public Product readProduct(Product p) throws Exception; // Læse et enkelt produkt eller Read i CRUD

    public List<Product> readAllProducts() throws Exception;// Læse alle produkter eller Read i CRUD

    public void updateProduct(Product p) throws Exception;

    public void deleteProduct(Product p) throws Exception;
}