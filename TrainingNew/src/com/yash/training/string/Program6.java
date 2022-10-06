package com.yash.training.string;

import java.util.Scanner;

public class Program6 {
		
// WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.
	
public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		
		String s3 = new String("Java");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if (s1 == s2) {      // == operator is use to check reference
	        System.out.println("Both s1 and s2 refering same address");
		}
		if(s1 != s3) {
			System.out.println("s1 and s3 referring different location");
		}
		 System.out.println(s1.equals(s3));     //equals method is use to check value

		 s2 = "Java New";      // updated s2 value
		 if (s1 == s2) {      // == operator is use to check reference
		     System.out.println("Both s1 and s2 refering same address");
		     
		 }
		 else {                
			 System.out.println("Both s1 and s2 not refering same address");
			 
			 System.out.println(s1.hashCode());
			 System.out.println(s2.hashCode());
		 }
	 
	}

}
