package com.yash.training.assignment.java8;

import java.util.Scanner;

/**
 *  WAP to check the given sequence of character in given string. Suppose
	that you are given following string “Taj is situated in Agra.” And you
	have to find following sequence ast. ast should be one after another. If
	you found sta, or tas, or tsa it should print string not found. 
 * @author shubham.yadav
 *
 */
@FunctionalInterface
interface MyInterface2{
	String isSubStringPresent(String str,String sub);
}


public class Program2{

	
	public static void main(String[] args) {
		
		MyInterface2 obj = (str,sub) ->{
			
			if(str.contains(sub)) {
				return "String is present";
			}else {
				return "String not found";
			}
		};
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String sub = sc.next();
		
		System.out.println(obj.isSubStringPresent(str, sub));
		

	}


}
