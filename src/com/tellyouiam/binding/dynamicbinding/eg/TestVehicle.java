package com.tellyouiam.binding.dynamicbinding.eg;

/**
 * @author : Ho Anh
 * @since : 13/02/2020, Thu
 **/
public class TestVehicle {
	public static void main(String[] args) {
		Vehicle v = new Bicycle();
		v.move(); //Bicycle may move and may accelerate too
		
		Vehicle v1 = new Vehicle();
		v1.move(); //Vehicles may move
		
		/*
		* Note from this code that, with first move() call, we have Vehicle as reference type. The Object that is being
		* referenced is Bicycle. When the call is made to move(), Java will wait until it's runtime before it will look
		* to see which object the reference is pointing to. In the case of our code, Bicycle is the class so the Bicycle
		* class's move() method is the method that is called. In the next move() call, the object being called is in the
		* Vehicle class. As such, the Vehicle class's move() method is the one that is called at runtime.
		*
		* Read further: compile-time reference rule. Compile time only know method or variable in reference type or
		* superClass of reference type. Object type will be determine at runtime as above example.
		* */
	}
}
