package com.yash.training.assignment.collections;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 * WAP to store data related to item in Vector and after that sort the data. 
 * @author shubham.yadav
 *
 */
public class Program5 {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you wants to enter");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			vector.add(sc.next());
		}
		System.out.println("Inserted Vector is - " + vector);
		
		Collections.sort(vector);
		
		System.out.println(vector);
		

	}

}
