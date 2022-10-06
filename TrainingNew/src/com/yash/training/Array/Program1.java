package com.yash.training.Array;

/**
 * WAP to find third maximum number from list of numbers.
 * 
 * @author shubham.yadav
 *
 */

public class Program1 {

	public static void main(String[] args) {

		int num[] = { 10, 14, 1, 5, 34, 50 };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(num[2]);
	}

}
