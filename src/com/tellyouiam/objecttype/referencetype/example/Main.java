package com.tellyouiam.objecttype.referencetype.example;

/**
 * @author : Ho Anh
 * @since : 12/02/2020, Wed
 **/
public class Main {
	public static void main(String[] args) {
		Circle c1 = new Cylinder(1.1, 2.2);
		c1.getRadius();
		// CANNOT invoke method in Cylinder as it is a Circle reference!
		//c1.getHeight();  // compilation error
		//c1.getVolume();  // compilation error
	}
}
