package com.designpattern.nullobjectpattern.example;

public class NullShape implements Shape {
	@Override
	public double area() {
		return 0.0d;
	}
	
	@Override
	public double perimeter() {
		return 0.0d;
	}
	
	@Override
	public void draw() {
		System.out.println("Null Object cannot be draw");
	}
	
	@Override
	public boolean isNull() {
		return true;
	}
}
