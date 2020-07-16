package com.designpattern.nullobjectpattern.example;

public class Rectangle implements Shape {
	// sides
	private final double width;
	private final double length;
	public Rectangle() {
		this(1.0d ,1.0d);
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	@Override
	public double area() {
		// A = w * l
		return width * length;
	}
	
	@Override
	public double perimeter() {
		// P = 2(w + l)
		return 2 * (width + length);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle with area: " + area() + " and perimeter: " + perimeter());
	}
	
	@Override
	public boolean isNull() {
		return false;
	}
}