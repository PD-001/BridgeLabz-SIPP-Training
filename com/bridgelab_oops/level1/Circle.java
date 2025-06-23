package com.bridgelab_oops.level1;

public class Circle {
	private double radius;
	
	public Circle (double radius) {
		this.radius=radius;
	}
	
	public double CircleCircumferernce (double radius) {
		return (2 * 3.14 * radius);
	}
	
	public double CircleArea (double radius) {
		return (3.14 * radius * radius);
	}
}
