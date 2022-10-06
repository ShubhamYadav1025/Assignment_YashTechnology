package com.yash.training.assignment.oops.Program11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private int empid;
	private String empname;
	private String empsalary;
	private String empaddress; 
	private Date emp_dob;
	private Date emp_doj;
	
	
	public Employee(int empid, String empname, String empsalary, String empaddress, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}


	
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

	
	
	public static void main(String[] args) throws ParseException {
	
		String dob = "10/09/1996";
		String doj = "14/06/2022";
		
		Date dob2 =new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		Date doj2 =new SimpleDateFormat("dd/MM/yyyy").parse(doj);
		
		
		Employee e1 = new Employee(1,"Shubham","1 Lakh","Indore",dob2,doj2);
		System.out.println(e1);
		

	}

}
