package com.yash.training.assignment.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program2 {

	/**
	 * WAP to store all Collection elements in Array and perform the Binary Search
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(8);
		list.add(50);
		list.add(5);
		list.add(20);
		
		Collections.sort(list);
		System.out.println("Sorted Array is - " + list);
		System.out.println("You want to find the index of which number in list?");
		Scanner sc = new Scanner(System.in);
		
		int searchNo = sc.nextInt();
		
		if(list.contains(searchNo)) {
			int findIdx = Collections.binarySearch(list, searchNo);
			System.out.println("Element found at index - " + findIdx);
		}
		else {
			System.out.println("Numbr does not exist in list");
		}
		
		
		
		
	}

}
