package com.yash.training.assignment.java8;

import java.util.Scanner;

/**
 * WAP to check the given no is palindrome or not. Don’t use divide
   method.
 * @author shubham.yadav
 *
 */
@FunctionalInterface
interface MyInterface{
	boolean isPallindrome(int n);
}
public class Program1{
	     
	
	
	public static void main(String[] args) {
		
		MyInterface obj = (n) -> {
			
			int r,sum=0,temp;      
			  
			  temp=n;    
			  
			  while(n>0){    
			   r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
				 return true; 
			  else    
				 return false;
			}; 
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(obj.isPallindrome(n));
	}

	
}
