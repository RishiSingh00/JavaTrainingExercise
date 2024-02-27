package com.edu.MavenTest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {

	public static void performAction(ArrayList<String> arr,int option) {
		Scanner scan = new Scanner(System.in);
		String data="";
		if(option == 1 || option ==2) {
			System.out.println("Enter data");
			data = scan.nextLine();
		}
		switch(option) {
		case 1:
		{
			arr.add(data);
			break;
		}
		case 2:{
			arr.remove(data);
			break;
		}
		case 3:{
			System.out.println(arr);
			break;
		}
		case 4:{
			Collections.sort(arr);
			System.out.print(" [");
			for(int i = 0 ; i <arr.size()-1;i++) {
				if(arr.get(i).equals(arr.get(i+1))){
					System.out.print(arr.get(i)+" ");
				}
				while(i<arr.size()-1 && arr.get(i) == arr.get(i+1)) i++;
			}
			System.out.print("]\n");
		}
		}
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		
		boolean flag = true;
		while(flag) {
				System.out.println("Enter \n1. add\n2. delete\n3. display\n4. display duplicate");
				
				int option = scan.nextInt();
				performAction(arr,option);
				
				System.out.println("Do you want to repeat?");
				flag = scan.nextBoolean();
				
		}
	
	}
}
