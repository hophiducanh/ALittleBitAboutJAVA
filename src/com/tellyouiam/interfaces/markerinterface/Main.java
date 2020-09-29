package com.tellyouiam.interfaces.markerinterface;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyClass myClass = new MyClass("Haha");
		final MyClass clone = (MyClass) myClass.clone();
		System.out.println("Clone: " + clone.getS());
		System.out.println("My class: " + myClass.getS());
	}
}
