package org.example.canteen2.Models;

import org.example.canteen2.Foundation.DatabaseConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Class is responsible for storing a value to an ID
 * The Goal was to use stored procedures from our database through callable statements
 */
public class Account {
    private double balance;
    private int employeeId;

    /**
     *
     * @param balance, a value we would store in a database
     * @param employeeId, is to associate a balance to an ID
     */
    public Account(double balance, int employeeId) {
        this.balance = balance;
        this.employeeId = employeeId;
    }

    public Account()
    {

    }

    /**
     * Method checks the balance of an employee
     * @return
     */
    public double checkBalance() {
        //Switch Case to potentially test more employees
        switch (employeeId) {
            case 1111:
                this.balance = 1000.0; //Magic number to test
                break;
            case 2341:
                this.balance = 1500.0;
                break;
            default:
                this.balance = 0.0;
                break;
        }
        // Prints out in console to test the program
        System.out.println("Balance for employee ID " + this.employeeId + ": " + this.balance);
        return 1000.0;
    }

    /**
     * Updates the balance of an account
     * @param amount a double that adds into an existing employee's account
     */
    public double updateBalance(double amount) {
        System.out.println("Updated balance for employee ID " + this.employeeId + ": " + this.balance);
        return this.balance += amount;
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
