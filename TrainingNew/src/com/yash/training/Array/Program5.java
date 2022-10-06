package com.yash.training.Array;

/**
 * An Array Contain different numbers you have to find how many are even, odd,
 * perfect and prime
 * 
 * @author shubham.yadav
 *
 */
public class Program5 {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		int even = 0;
		int odd = 0;
		int prime = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even++;
			} else if (num[i] % 2 != 0) {
				odd++;
			}
			boolean isPrime = num[i] % 2 == 1;
			for (int j = 3; j < num[i] / 2; j++) {
				if (num[i] % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime && num[i] > 1) {
				prime++;
			}
		}
		System.out.println("count of even number is =" + even);
		System.out.println("count of odd number is =" + odd);
		System.out.println("count of prime number is =" + prime);
	}

}
