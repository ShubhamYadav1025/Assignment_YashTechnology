package com.yash.training.assignment.java8;

import java.util.Scanner;

/**
 * WAP to insert one string into another string. Also perform garbage
   collection when insertion is done
 * @author shubham.yadav
 *
 */
interface Myinterface4{
	String  concatString(String str,String str2);
}
public class Program4{
	
	static String newString;
	
	public static void main(String[] args) {
		
		
		Myinterface4 obj = (String str,String str2)->{
		    newString = str.concat(str2);
			return newString;
		};
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(obj.concatString(str, str2));
		newString = null;
		System.gc();
		
	}
	@Override
		protected void finalize() throws Throwable {
			System.out.println("coming");
		}

	

}
