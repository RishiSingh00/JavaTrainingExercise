package com.edu.task;
import java.util.ArrayList;

public class removeDuplicate {
	
	
	public static int removeDuplicate(int[] arr) {
		
		int uniqueIndexCounter = 0;
		
		for(int i = 0 ; i <arr.length;i++) {
			arr[uniqueIndexCounter++] = arr[i];
			while(i < arr.length-1 && arr[i] == arr[i+1]) {
				i++;
			}
		}
		return uniqueIndexCounter;
	}
	
	
	public static void main(String args[]) {
		int[] arr = {20,20,30,40,50,50,50};
		
		
		//In case duplicates are not together
		//Arrays.sort(arr);
		
		//removeDuplicate
		System.out.println("unique elements : "+removeDuplicate(arr));
		
	}
}
