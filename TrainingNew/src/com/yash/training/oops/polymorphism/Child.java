package com.yash.training.oops.polymorphism;

/**
 * 
 * @author shubham.yadav
 *
 */


public class Child {
	
	private int noOfTrainees; //instance variables
	private static String location = "Indore"; //static means which is same for all the object
	private String laptopBrand;
	
	
	Child(int noOfTrainees, String laptopBrand){
		this.noOfTrainees = noOfTrainees;
		this.laptopBrand = laptopBrand;
	}
	
	
	void useLaptop(String laptopBrand) {
		System.out.println("using laptop of "+laptopBrand);
	}
	
	void useLaptop(String laptopBrand,int noOfTrainees) {     //method overloading
		System.out.println(noOfTrainees +" trainees using laptop of "+laptopBrand);
	}
	
	static void useClassroom(){      //no need to create an object because it is a static method
		System.out.println("In method useClassroom");
	}
	
	void doCoding() {
		System.out.println("In method doCoding");
	}
	
	
	
	public static void main(String[] args) {
		
		Child ep = new Child(18,"Dell");
		ep.useLaptop("Dell");
		ep.useLaptop("Dell", 18);
		useClassroom();
		
	}
	



}
