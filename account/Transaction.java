package com.edu.account;

public class Transaction extends Loan {
    private int amount;
   
    
    public Transaction(Account ac,Loan ln,Integer amt) {
    	super(ac,ln);
    	if(amt<=0) return;
    	amount = amt;
    }
    
    public void depositAmount(int amount) {
    	depositAmount += amount;
    	System.out.println("New Balance : "+depositAmount);
    }

    public void withdrawAmount(int amount) {
    	 if(amount > depositAmount) {
    		 System.out.println("amount limit exceeds");
    		 return;
    	 }
    	 depositAmount -= amount;
         System.out.println("remaining balance : "+depositAmount);
    }

    public void payLoan(int amount) {
       
       
       loanAmount = amount;
       System.out.println("Remaining Loan Amount: "+loanAmount);

    }

    public void showAccountDetails() {
    	showLoanDetails();
    }
}
