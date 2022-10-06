package com.yash.training.assignment.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * WAP to store elements in List and remove all duplicates value from it. (Numbers
   should be inserted). When duplicates are removed print all elements in ascending
   order.
 * @author shubham.yadav
 *
 */
public class Program3 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you wants to enter");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Inserted list is - " + list);
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for(int i : list) {
			set.add(i);
		}
		
		System.out.println("Unique list is - " + set);
		
		
	}

}
