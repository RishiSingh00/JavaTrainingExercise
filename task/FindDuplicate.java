package com.edu.task;

import java.util.ArrayList;

public class FindDuplicate {
public static ArrayList<Integer> findDuplicate(int[] arr) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i = 0 ; i <arr.length-1;i++) {
			if(arr[i] == arr[i+1]){
				result.add(arr[i]);
			}
			while(i < arr.length-1 && arr[i] == arr[i+1]) {
				i++;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		int[] arr = {20,20,30,40,50,50,50};
		
		
		//In case duplicates are not together
		//Arrays.sort(arr);
		
		//findDuplicate
		System.out.println("duplicate elements : "+findDuplicate(arr));
		
		
	}
}
