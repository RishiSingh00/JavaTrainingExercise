package com.edu.MavenTest;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Collection;

public class HashtableExample2 {
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<>();
		
		String[] arr = {"Srinivas","srinivas","laptop","Laptop","Edu","Tech."};
		int IndexCounter = 0;
		ArrayList<String> strArr = new ArrayList<>();
		
		for(int i=0 ; i < arr.length ; i++ ) {
			ht.put(i,arr[i]);
		}
		
		for(String s:ht.values()) {
			
			if(strArr.contains(s.toLowerCase())) {
				System.out.println("duplicate Index: "+IndexCounter+", value: "+s);
			}
			else {
				strArr.add(s.toLowerCase());
			}
			IndexCounter++;
		}
		
	}
}
