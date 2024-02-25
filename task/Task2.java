package com.edu.task;

public class Task2 {
	
	public static void main(String[] args) {
		String input = "a b c d e f";
		int num = (int)(input.length()+1) / 2 ;
		
		String output = "";
		for(int i = input.length()-1 ; i >= 0 ; i-=2) {
			output += input.charAt(i)+""+(num--);
			if(i!=0)
				output+=" ";
		}
		System.out.println(output);
	}
}