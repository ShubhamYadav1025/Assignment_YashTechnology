package com.yash.training.Array;

import java.util.Arrays;
/**
 * WAP to find duplicate numbers and there counting from list of numbers
 * @author shubham.yadav
 *
 */
public class  Program2 {
	private int array[];
	private int size;
	private int capacity;

	public  Program2() {
		array = new int[2];
		size = 0;
		capacity = 2;
	}

	public void addElement(int element) {
		if (size == capacity) {
			ensureCapacity(2);
		}
		array[size] = element;
		size++;
	}

	public void ensureCapacity(int minCapacity) {
		int temp[] = new int[capacity * minCapacity];
		for (int i = 0; i < capacity; i++) {
			temp[i] = array[i];
		}
		array = temp;
		capacity = capacity * minCapacity;
	}

	public void printElements() {
		System.out.println("elements in array are :" + Arrays.toString(array));
	}

	public static void main(String args[]) {
		Program2 d = new  Program2();
		d.addElement(1);
		d.addElement(2);
		d.printElements();
	}
}