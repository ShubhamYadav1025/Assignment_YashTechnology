package com.yash.training.string;

public class Program2 {

	//WAP to print the all alphabets of string in ascending and descending order.
	

	public static void ascending(String s) {
		
		char temp;
        char[] sChar = s.toCharArray();
         for(int i=0; i<sChar.length; i++){
             for(int j=i+1;j<sChar.length; j++){
                 if(sChar[i] > sChar[j]){
                    temp = sChar[j];
                    sChar[j] = sChar[i];
                    sChar[i] = temp;
                 }                 
             }            
         }
         System.out.println(sChar);
		
	}
	
public static void descending(String s) {
		
		char temp;
        char[] sChar = s.toCharArray();
         for(int i=0; i<sChar.length; i++){
             for(int j=i+1;j<sChar.length; j++){
                 if(sChar[i] < sChar[j]){
                    temp = sChar[j];
                    sChar[j] = sChar[i];
                    sChar[i] = temp;
                 }                 
             }            
         }
         System.out.println(sChar);
		
	}
	
	
	
	public static void main(String[] args) {
		
		String s = "aaaaaaaayyaa";
		ascending(s);
		descending(s);
        

	}

}
