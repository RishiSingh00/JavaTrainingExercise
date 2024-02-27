package com.edu.account;

public class Loan extends Account {
    protected String loanId, loanType;
    protected Integer loanAmount;

    public Loan(Account ac,Loan ln) {
    	super(ac);
    	loanId = ln.loanId; loanType = ln.loanType; loanAmount = ln.loanAmount;
    }
    public Loan(Account ac,String loanId, String loanType, Integer loanAmount) {
        super(ac);
        if (!isValidLoanType(loanType)) {
            throw new IllegalArgumentException("Invalid loan type");
        }
        this.loanId = loanId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    
    public static boolean isValidLoanType(String loanType) {
        return loanType.equals("car") || loanType.equals("home");
    }
    
    public void getLoan(int getAmount) {
        loanAmount += getAmount;
    }

    public void showLoanDetails() {
        System.out.println(getDetails() + "\n" + "Loan ID: " + loanId + "\nLoan Type: " + loanType + "\nLoan Amount: " + loanAmount);
    }
}
