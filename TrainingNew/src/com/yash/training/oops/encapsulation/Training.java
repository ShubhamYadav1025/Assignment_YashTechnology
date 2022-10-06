package com.yash.training.oops.encapsulation;

public class Training {

	private int noOfTrainees; //instance variables
	private static String location = "Indore"; //static means which is same for all the object
	private String laptopBrand;
	
	
	Training(int noOfTrainees, String laptopBrand){       //parameterized constructor used to initialize an object
		this.noOfTrainees = noOfTrainees;
		this.laptopBrand = laptopBrand;
	}
	
	void useLaptop(String laptopBrand) {
		System.out.println("using laptop of "+laptopBrand);
	}

	static void useClassroom(){      //no need to create an object because it is a static method
		System.out.println("In method useClassroom");
	}
	
	void doCoding() {
		System.out.println("In method doCoding");
	}
	
	
	public static void main(String[] args) {

		Training t = new Training(18,"Dell");
		t.useLaptop("Dell");
		useClassroom();
		
	}
	
}
