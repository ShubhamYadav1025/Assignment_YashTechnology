package com.yash.training.assignment.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * WAP to store elements in List and remove all duplicates names of items. After
   duplicates are removed print all elements in descending order. 
 *  
 * @author shubham.yadav
 *
 */
public class Program4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you wants to enter");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Inserted list is - " + list);
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : list) {
			set.add(i);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse list is - " + list);
	}

}
