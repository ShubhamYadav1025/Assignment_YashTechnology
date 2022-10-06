package com.yash.training.assignment.oops.Program10;


public class Product implements Cloneable{
	
	public int pid;
	public String pname;
	public float price;
	public String unitOfMeasurement;
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + "]";
	}
	
	public Product(int pid, String pname, float price, String unitOfMeasurement) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}


	
	public static void main(String args[]){  
		
		try{  
			
			Product p1= new Product(1,"Sugar",10.0f,"Kg");  
		  
			Product p2=(Product)p1.clone(); 
			
			p2.pname = "Oil";
			p2.price = 15.0f;
			
			System.out.println(p1);
			System.out.println(p2);
			
			System.out.println(p2 instanceof Product);
		  
		
		  
		}catch(CloneNotSupportedException c){
			System.out.println("Exception is - " + c);
		}  
		  
		}  
	
	

}
