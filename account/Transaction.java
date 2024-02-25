package com.edu.account;

public class Transaction extends Loan {
    private int amount;
   
    public boolean depositAmount() {
    	return true;
    }

    public int withdrawAmount() {
         return 0;
    }

    public int payLoan() {
       return 0;
    }

    public String showAccountDetails() {
        return getDetails();
    }
}
