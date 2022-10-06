package com.yash.training.string;

import java.util.Scanner;

public class Program1 {

	/*
	 * Create a program in which two string is input by the user and after that user
	 * will enter index in first string where we want to insert the second string
	 * and insert the second string at that index and create a new string.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream

		String originalString = sc.nextLine();
		String stringToBeInserted = sc.nextLine();
		String newString = new String();
		int indexOfSecondString = sc.nextInt();

		for (int i = 0; i < originalString.length(); i++) {

			newString += originalString.charAt(i);

			if (i == indexOfSecondString)
				newString += stringToBeInserted;
		}

		System.out.println(newString);

	}

}
