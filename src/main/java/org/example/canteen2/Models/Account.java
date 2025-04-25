package org.example.canteen2.Models;

import org.example.canteen2.Foundation.DatabaseConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Account {
    private double balance;
    private int employeeId;

    public Account(double balance, int employeeId) {
        this.balance = balance;
        this.employeeId = employeeId;
    }

    public Account() {
    }

    public void checkBalance() {
        switch (employeeId) {
            case 1234:
                this.balance = 1000.0;
                break;
            case 2341:
                this.balance = 1500.0;
                break;
            default:
                this.balance = 0.0;
                break;
        }

        System.out.println("Balance for employee ID " + this.employeeId + ": " + this.balance);
    }

    public void updateBalance(double amount) {
        this.balance += amount;
        System.out.println("Updated balance for employee ID " + this.employeeId + ": " + this.balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
