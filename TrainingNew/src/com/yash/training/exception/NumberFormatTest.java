package com.yash.training.exception;

import java.util.Scanner;

public class NumberFormatTest {

	public static void main(String[] args) {

	
		try {
			System.out.print("Please enter any number - ");
			
			Scanner sc = new Scanner(System.in);
			String inputString = sc.next();
			
			double stringToDouble = Double.parseDouble(inputString);
			
			System.out.println("Correct Input ::: Thankyou");
			
			
		}
		catch(NumberFormatException ne) {
			
			System.out.println("Kindly enter the number");
			
		}
		

	}

}
