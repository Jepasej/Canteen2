package org.example.canteen2.Models;

public class Supplier implements ProductSupplier{
    int ProductSupplierID;
    String ProductSupplierName;
    String ProductSupplierPhoneNo;

    @Override
    public int getProductSupplierID() {
        return ProductSupplierID;
    }

    @Override
    public void setProductSupplierID(int supplierID) {

    }

    @Override
    public String getProductSupplierName() {
        return ProductSupplierName;
    }

    @Override
    public void setProductSupplierName(String productSupplierName) {

    }

    @Override
    public String getProductSupplierPhoneNo() {
        return ProductSupplierPhoneNo;
    }

    @Override
    public void setProductSupplierPhoneNo(String productSupplierPhoneNo) {

    }
}
