package com.yash.training.assignment.java8;

import java.util.Optional;

public class Program5 {

	public static void main(String[] args) {
	
		String[] str = new String[15];  

        Optional<String> checkNull = Optional.ofNullable(str[5]); 
  
        if(checkNull.isPresent()){  

            String lowercaseString = str[5].toLowerCase();  

            System.out.print(lowercaseString); 
  
        }else
           System.out.println("string value is not present");  
		

	}

}
