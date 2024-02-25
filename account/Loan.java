package com.edu.account;

public class Loan extends Account {
    private String loanId, loanType;
    private int loanAmount;

    public Loan(String id, String name, String addr, int amount, String loanId, String loanType, int loanAmount) {
        super(id, name, addr, amount);
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

    public String showLoanDetails() {
        return getDetails() + "\n" + "Loan ID: " + loanId + "\nLoan Type: " + loanType + "\nLoan Amount: " + loanAmount;
    }
}
