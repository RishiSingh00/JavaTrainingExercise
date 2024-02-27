package com.edu.task;

public class Task3 {

	 private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	    public static String convertToWords(int num) {
	        if (num == 0) {
	            return "zero";
	        }
	        return convert(num);
	    }

	    private static String convert(int num) {
	        if (num < 10) {
	            return units[num];
	        } else if (num < 20) {
	            return teens[num - 10];
	        } else if (num < 100) {
	            return tens[num / 10] + " " + convert(num % 10);
	        } else if (num < 1000) {
	            return units[num / 100] + " hundred " + convert(num % 100);
	        } else if (num < 1000000) {
	            return convert(num / 1000) + " thousand " + convert(num % 1000);
	        }
	        return ""; // Limited to numbers up to 999,999
	    }

	    public static void main(String[] args) {
	        int num = 12334;
	        String result = convertToWords(num);
	        System.out.println(result);
	    }

}


