package com.yash.training.oops.Inheritence;

   public abstract class JavaTrng {
	
	int no_Of_JavaTraninee;
	abstract void project();
	static String location = "Indore";
	
	JavaTrng(){
		
	}
	
	void useClassroom() {
		System.out.println("Used by Java Trainee");
	}
	
	
	public class PythonTrng extends JavaTrng{
		
		int no_Of_PythonTrainee;
		
		void project() {
			System.out.println("BNY");
		}
		void useClassroom() {
			System.out.println("Used by Python Trainee");
		}
		
		public static void main(String[] args) {
			
			JavaTrng pt = new JavaTrng();
			pt.useClassroom();
		}
	}
	
	

}
