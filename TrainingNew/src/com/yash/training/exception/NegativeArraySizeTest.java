package com.yash.training.exception;

import java.util.Scanner;

public class NegativeArraySizeTest {

	public static void main(String[] args) {
		
		try {
			
			System.out.print("Please enter the size of array - ");
			
			Scanner sc = new Scanner(System.in);
			int arraySize = sc.nextInt();
			String[] array = new String[arraySize];
			for(int i=0; i<arraySize; i++) {
				array[i] = sc.next();
			}
			System.out.println("Array created successfully!!");
			
			
		}
		catch(NumberFormatException nf) {
			System.out.println("Please enter only numeric value");
		}
		catch(NegativeArraySizeException nf) {
			System.out.println("Please enter positive number only");
		}

	}

}
