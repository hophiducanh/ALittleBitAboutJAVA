package com.tellyouiam.objecttype.referencetype.example;

/**
 * @author : Ho Anh
 * @since : 12/02/2020, Wed
 **/
// The superclass Circle
public class Circle {
	static int foo = 1;
	// private instance variable
	private double radius;
	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	// Getter
	public double getRadius() {
		return this.radius;
	}
	// Return the area of this circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
	// Describe itself
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
}
