package com.yash.training.assignment.oops.Program5;

public class ClassD extends ClassC {

	@Override
	void div(int a, int b) {
		System.out.println("The Division is :" + (a * b));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassD d = new ClassD();

		d.div(10, 2);
		d.mul(24, 32);
		d.sub(32, 23);
		d.sum(43, 34);
	}

}
