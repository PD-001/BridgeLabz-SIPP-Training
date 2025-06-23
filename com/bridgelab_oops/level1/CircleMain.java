package com.bridgelab_oops.level1;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter radius of circle:");
		double radius=sc.nextDouble();
		
		Circle circle=new Circle(radius);
		
		System.out.println("Circumference of the circle is " + circle.CircleCircumferernce());
		System.out.println("Area of the circle is " + circle.CircleArea());
		
		sc.close();
	}
}
