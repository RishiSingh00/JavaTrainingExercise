package com.edu.task;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number, string, or single character: ");
        String input = scanner.nextLine();

        if (isInteger(input)) {
            System.out.println("integer!");
        } else if (isFloat(input)) {
            System.out.println("float!");
        } else if (input.length() == 1) {
            System.out.println("character!");
        } else {
            System.out.println("string!");
        }

    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isFloat(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
