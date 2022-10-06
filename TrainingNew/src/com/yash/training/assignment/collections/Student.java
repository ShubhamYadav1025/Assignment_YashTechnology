package com.yash.training.assignment.collections;

public class Student {

	public int rollno;
	public String sname;
	public String classname;
	public String totalmarks;
	public double percentage;
	 
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + ", percentage=" + percentage + "]";
	}
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}
	
	 
	
}
