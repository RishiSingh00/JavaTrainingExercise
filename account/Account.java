package com.edu.account;

public class Account {
	private String accountId, accountName, address;
	private int depositAmount;
	
	public Account(String id, String name, String addr, int amount) {
		
		//check whether id is valid or not
		if(!isValidID(id)) throw new IllegalArgumentException("Invalid ID Format");
		accountId = id;
		accountName = name;
		address = addr;
		depositAmount = amount;
	}
	
	public static boolean isValidID(String id) {
        // Check if the id length is 12 characters
        if (id.length() != 12)
            return false;

        // Check if the first 7 characters are digits
        for (int i = 0; i < 7; i++) {
            if (!Character.isDigit(id.charAt(i)))
                return false;
        }

        // Check if the 8th character is a hyphen
        if (id.charAt(7) != '-')
            return false;

        // Check if the last 4 characters are letters
        for (int i = 8; i < 12; i++) {
            if (!Character.isLetter(id.charAt(i)))
                return false;
        }

        return true;
    }
	
	public String getDetails() {
		return "Id: "+accountId+"\nName: "+accountName+"\nAddress: "+address+"\nBalance: "+depositAmount ;
		
	}
	
	public void showDetails() {
		System.out.print("Id: "+accountId+"\nName: "+accountName+"\nAddress: "+address+"\nBalance: "+depositAmount);
	}
	
}
