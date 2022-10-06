package com.yash.training.string;

public class Program3 {

	public static void main(String[] args) {


		//WAP to remove all the vowels from the given string.
		
		String s = "shubham";
        
		char[] vowelArr = {'a','e','i','o','u'};
        char[] sChar = s.toCharArray();
        
        for(int i=0; i<sChar.length; i++){
             for(int j=0;j<vowelArr.length; j++){
                 if(sChar[i] == vowelArr[j]){
                    sChar[i] = ' ';
                 }
             }
         }        
         System.out.println(sChar);

	}

}
