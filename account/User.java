package com.edu.account;
import com.edu.account.Account;
public class User {

	public static void main(String args[]) {
		Account[] acc = new Account[10];
		acc[0] = new Account("1234567-ASDF","rishi","gwalior",2300);
		acc[1] = new Account("1234568-ASDF","ritik","delhi",2100);
		acc[2] = new Account("1234569-ASDF","ram","mumbai",83999);
		acc[3] = new Account("1234570-ASDF","shyam","rameshwaram",63777);
		acc[4] = new Account("1234571-ASDF","sita","ludhiana",53663);
		acc[5] = new Account("1234572-ASDF","gita","bhopal",76443);
		acc[6] = new Account("1234573-ASDF","ramesh","ratlam",8383);
		acc[7] = new Account("1234574-ASDF","suresh","chennai",444);
		acc[8] = new Account("1234575-ASDF","aditya","kanpur",4443);
		acc[9] = new Account("1234576-ASDF","rohit","indore",8282);
		
	//	System.out.println(acc[0].getDetails());
		Loan loan1 = new Loan(acc[0],"101","car",1000);
		
		Transaction tc = new Transaction(acc[0],loan1,500);
		tc.depositAmount(3000);	
		System.out.println("_______________");
		tc.showAccountDetails();
		System.out.println("________________");
		tc.withdrawAmount(2000);
		System.out.println("________________");
		tc.payLoan(500);		
		System.out.println("________________");
		tc.showAccountDetails();
		
		
		
		
		
		
		
	} 
}
