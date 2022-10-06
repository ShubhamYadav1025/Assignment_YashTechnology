package com.yash.training.string;

public class Program5 {

	// WAP to demonstrate which is fast in processing StringBuilder or StringBuffer
	
	public static void main(String[] args) {

	    long t0 = System.currentTimeMillis();
	    
	    StringBuffer buf = new StringBuffer();
	    
	    for (int i = 0 ; i < 10000; i++){
	        buf.append("some string");
	    }
	    System.out.println("Buffers : "+(System.currentTimeMillis() - t0));

	    t0 = System.currentTimeMillis();
	    StringBuilder building = new StringBuilder();
	    for (int i = 0 ; i < 10000; i++){
	        building.append("some string");
	    }
	    System.out.println("Builder : "+(System.currentTimeMillis() - t0));
	}

}
