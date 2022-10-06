package com.yash.training.exception;

import java.util.Scanner;

public class IndexTest {

	public static void main(String[] args) {
		

		String[] arrNames = {"Shubham","Rupali","Gaurav","Dheeraj","Tanay","Divyansh","Kritika","Priyanka","Rahul","Snehal"};
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter the index position to display name - ");
			
			int inputIdx = sc.nextInt();
			
			System.out.println(arrNames[inputIdx]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please enter input between 0 to 9");
		}
		
	}

}
