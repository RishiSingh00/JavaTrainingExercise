package com.bank.abcd.AbcdBank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

class BankAccount {
	private Integer accountNo;
	private String name;
	private Double balance;
	private Date openingDate;
	private Connection con;
	//assumption start account no. from 1 and only for test
	//else some complex tech. could be used to generate larger
	//unique numbers
	// Constructor
	public BankAccount(Connection con) {
		this.con = con;
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT MAX(accountNo) as maxAc FROM bankaccount");
			if(rs.next()) {
				this.accountNo=rs.getInt("maxAc")+1;
				System.out.println("here");
			}
			this.openNewAccount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Account Creation Failed");
			e.printStackTrace();
			return;
		}
		this.processMenu();
	}
	
	public BankAccount(Connection con, Integer accountNo,String password) {
        try {
        	this.con = con;
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM BankAccount WHERE accountNo = ? and password = ?");
            pstmt.setInt(1, accountNo);
            pstmt.setString(2,password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                this.accountNo = accountNo;
                this.name = rs.getString("name");
                this.balance = rs.getDouble("balance");
                this.openingDate = rs.getDate("openingDate");
                this.processMenu();
            } else {
                throw new SQLException("Account not found.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to retrieve account details from database.");
            e.printStackTrace();
        }
    }
	// Methods
	public void modifyPersonalDetails(String newName) {
		try {
			PreparedStatement pstmt = con.prepareStatement(
					"update bankaccount set name = ? where accountno=?");			
			pstmt.setString(1, newName);
			pstmt.setInt(2, this.accountNo);
			
			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted > 0) {
				this.name = newName;
				System.out.println("Personal details modified successfully.");
			}
		}
		catch(SQLException e) {
			System.out.println("Personal details modification failed.");
		}
		
	}

	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}

	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNo);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("Opening Date: " + openingDate);
	}

	public void openNewAccount() throws Exception {
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Enter name: ");
			String name = scanner.nextLine();
			System.out.print("Enter initial balance: ");
			double balance = scanner.nextDouble();
			System.out.print("Enter Password: ");
			String password = scanner.next();
			
			PreparedStatement pstmt = con.prepareStatement(
					"INSERT INTO BankAccount(accountNo, password, name, balance, openingDate) VALUES (?, ?,?, ?, ?)");
			pstmt.setInt(1, this.accountNo);
			pstmt.setString(2,password);
			pstmt.setString(3, name);
			pstmt.setDouble(4, balance);
			pstmt.setDate(5, new java.sql.Date(new Date().getTime()));
			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted > 0) {
				this.name = name;
				this.balance = balance;
				this.openingDate = new Date();
				System.out.println("New account with account number: "+this.accountNo+" opened successfully.");
				
			}
		
	}

	public void closeAccount() {
		long days = (new Date().getTime() - openingDate.getTime()) / (1000 * 60 * 60 * 24);
		if (days <= 60) {
			System.out.println("You are not allowed to close account within 60 days of opening.");
		} else {
			try {
				Statement stmt = con.createStatement();
				stmt.executeUpdate("DELETE FROM BankAccount WHERE accountNo = '" + this.accountNo + "'");
				System.out.println("Account closed successfully.");
			} catch (SQLException e) {
				System.out.println("Failed to close account.");
				e.printStackTrace();
			}
		}
	}

	public void processMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Modify Personal Details");
			System.out.println("2. Check Balance");
			System.out.println("3. Display Account Information");
			System.out.println("4. Close Account");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter new name: ");
				String newName = scanner.next();
				modifyPersonalDetails(newName);
				break;
			case 2:
				checkBalance();
				break;
			case 3:
				displayAccountInfo();
				break;
			case 4:
				closeAccount();
				return;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please enter again.");
			}
		} while (choice != 5);
	}
}
