package com.edu.task;

public class convertCase {
	public static void main(String args[]) {
        String input = "Rishi"; 
        String output ="";
		for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	           if (c >= 'a' && c <= 'z') {
	                    c = (char)(c - 32);
	           }
	           else if (c >= 'A' && c <= 'Z') {
                   c = (char)(c + 32);
               }
	            output+=c;
	   }
		System.out.println(output);
	}
}
