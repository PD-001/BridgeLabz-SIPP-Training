package com.bridgelab_oops.level1;

public class Circle {
	private double radius;
	
	public Circle (double radius) {
		this.radius=radius;
	}
	
	public double CircleCircumferernce () {
		return (2 * 3.14 * radius);
	}
	
	public double CircleArea () {
		return (3.14 * radius * radius);
	}
}
