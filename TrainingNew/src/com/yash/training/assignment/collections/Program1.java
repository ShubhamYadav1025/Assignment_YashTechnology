package com.yash.training.assignment.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program1 {

	/**
	 * WAP to sort Collection elements in ascending order.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i=10; i>=1; i--) {
			intList.add(i);
		}
		System.out.println("original list - " + intList);
		
		Collections.sort(intList);
		
		System.out.println("Sortted list is - " + intList);

	}

}
