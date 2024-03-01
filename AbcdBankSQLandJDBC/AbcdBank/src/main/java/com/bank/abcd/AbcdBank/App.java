package com.bank.abcd.AbcdBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
        Connection con = null;
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "rishi2001");
            Scanner scanner = new Scanner(System.in);
            System.out.println("----->Welcome to Abcd Bank<--------");
            System.out.println("1. Create New Account");
            System.out.println("2. Open Existing Account");            
            System.out.println("3. Exit");

            
            BankAccount account;
            int choice;
			do {
            	System.out.println("----->Welcome to Abcd Bank<--------");
                System.out.println("1. Create New Account");
                System.out.println("2. Open Existing Account");            
                System.out.println("3. Exit");

                choice = scanner.nextInt();
            	switch(choice) {
	            case 1:
	            	account = new BankAccount(con);
	            	break;
	            case 2:
	            	System.out.print("Account No.: ");
	            	int acNo = scanner.nextInt();
	            	System.out.print("Password: ");
	            	String password=scanner.next();
	            	account = new BankAccount(con,acNo,password);
	            	break;
	            case 3:
	            	choice = 3;
	            	break;
	            default:
					System.out.println("Invalid choice. Please enter again.");
            	}
            	
            } while(choice!=3);
            
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
