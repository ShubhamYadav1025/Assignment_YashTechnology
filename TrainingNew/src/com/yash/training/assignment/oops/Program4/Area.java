package com.yash.training.assignment.oops.Program4;

import java.util.Scanner;

/**
 * Create a class Area in which user will be asked to input the sides of shape.
 * User will be asked to input three sides of shape. If user input two sides of
 * shape same, you have to print area of square for that side. With 3 inputs you
 * have to print area of rectangle in combination. With 3 sides you have to
 * print the area of triangle. Also check the given three sides are belong to
 * right angle triangle or not.
 * 
 * @author shubham.yadav
 *
 */
public class Area {

	public static void main(String[] args) {

		try {
			// Enter the input from user
			System.out.println("please enter the number of side you want to check-");
			Scanner sc = new Scanner(System.in);
			int nextInt0 = sc.nextInt();
			double[] arr = new double[nextInt0];

			for (int i = 0; i < nextInt0; i++) {
				arr[i] = sc.nextDouble();
			}

			if (nextInt0 == 2) {
				// Area of square
				if (arr[0] == arr[1]) {
					double area_square = arr[0] * arr[1];
					System.out.println("The Area of Square is : " + area_square);
				} else {
					// Area of Rectangle
					double area_rectangle = arr[0] * arr[1];
					System.out.println("The Area of Rectangle is : " + area_rectangle);
				}
			}
			if (nextInt0 == 3) {
				// H2 = p2 + B2 for Right Angle triangle
				double perimeter = arr[0] + arr[1] + arr[2];
				double s = perimeter / 2;
				double area_triangle = Math.sqrt(s * (s - arr[0]) * (s - arr[1]) * (s - arr[2]));
				System.out.println("The Area of Triangle is : " + area_triangle);
			} else {
				// invalid choice
				System.out.println("Invalid Choice ");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
