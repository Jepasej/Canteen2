package org.example.canteen2.Models;

public class Payment {

    Account account = new Account(1111, 1111);

    /**
     * Sends a double to account to withdraw money from user account balance
     * @param amount
     * @return
     */
    public double paymentBalance(Double amount) {

        if(account.checkBalance()>amount)
        {
            account.updateBalance(amount);
        }
        return 0;
    }

}
