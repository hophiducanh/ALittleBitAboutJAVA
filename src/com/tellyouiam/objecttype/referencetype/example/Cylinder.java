package com.tellyouiam.objecttype.referencetype.example;

/**
 * @author : Ho Anh
 * @since : 12/02/2020, Wed
 **/
public class Cylinder extends Circle {
	static int foo = 2;
	// private instance variable
	private double height;
	// Constructor
	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}
	// Getter
	public double getHeight() {
		return this.height;
	}
	// Return the volume of this cylinder
	public double getVolumne() {
		return super.getArea() * height;
	}
	// Override the inherited method to return the surface area
	@Override
	public double getArea() {
		return 2.0 * Math.PI * getRadius() * height;
	}
	// Override the inherited method to describe itself
	@Override
	public String toString() {
		return "Cylinder[height=" + height + "," + super.toString() + "]";
	}
}
