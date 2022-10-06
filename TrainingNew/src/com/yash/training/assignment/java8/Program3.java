package com.yash.training.assignment.java8;

import java.util.Scanner;

/**
 * User will be asked to enter two integer like 1 34 or 2 44 or 3 151 or 4
   454. 1 to check given no is even, 2 for odd number, 3 for Armstrong
   number, 4 for palindrome number. 
 * @author shubham.yadav
 *
 */
@FunctionalInterface
interface MyInterface3{
	String isEven(int num);
	
	default String isOdd(int num) {
		if(num%2==1) {
			return "Odd";
		}else {
			return "Not Odd";
		}
	}
	default String isArmstrong(int num) {
		int originalNumber = num, remainder, result = 0;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            return "Armstrong number.";    
        else 
            return "Not an Armsrong number."; 
	};
	default String isPalindrome(int num) {
		int r,sum=0,temp;      
		  
		  temp=num;    
		  
		  while(num>0){    
		   r=num%10;  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
			 return "Pallindrome"; 
		  else    
			 return "Not Pallindrome";
	}
}


public class Program3 implements MyInterface3{
	
	@Override
	public String isEven(int num) {
		if(num%2==0) {
			return "Even";
		}else {
			return "Not Even";
		}
	}

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		
		MyInterface3 obj = new Program3();
		if(n==1) {
			System.out.println(obj.isEven(num));
		}else if(n==2){
			System.out.println(obj.isOdd(num));
		}else if(n==3) {
			System.out.println(obj.isArmstrong(num));
		}else if(n==4) {
			System.out.println(obj.isPalindrome(num));
		}
		
		
		
		
		
	}

	
}
