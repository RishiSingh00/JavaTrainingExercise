package com.edu.task;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        String email = scanner.nextLine();
        
        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public static boolean isValidEmail(String email) {
        int lastDotIndex = email.lastIndexOf('.');
        int atIndex = email.indexOf('@');
        
        if (lastDotIndex > atIndex && atIndex == email.lastIndexOf('@')) {
            return true;
        } else {
            return false;
        }
    }
}
