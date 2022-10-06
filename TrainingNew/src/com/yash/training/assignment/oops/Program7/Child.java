package com.yash.training.assignment.oops.Program7;

import java.util.Scanner;

public class Child extends Parent{
	
	@Override
	public void stringCompareParent(String str1,String str2) {
		if(str1.length() == str2.length()) {
            char[] strarr1 = new char[str1.length()];
            char[] strarr2 = new char[str2.length()];
            boolean status = true;
            for (int i = 0; i < str1.length(); i++) {
                if(strarr1[i]!=strarr2[i]) {
                    System.out.println("String Not Matched");
                    status= false;
                    break;
                }
             }
            if(status) {
            	System.out.println("Matched");
            }
		}
		else {
			System.out.println("String Not Matched");
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String - ");
		String str1 = sc.next();
		System.out.println("Enter 2nd String- ");
		String str2 = sc.next();
		
		Child c = new Child();
		c.stringCompareParent(str1, str2);
		
		
		
	}

}
