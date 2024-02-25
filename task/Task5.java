package com.edu.task;

public class Task5 {
	public static void main(String[] args) {
        String input = "Computer";
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
            if(i != 0) 
            	output +=" ";
        }
        System.out.println(output);
    }
}
