package com.tellyouiam.annotation;

@MyFirstAnnotation(name = "Some name", description = "Some description")
public class UsingMyFirstAnnotation {
	// Annotation được gắn trên một Constructor.
	// Với giá trị của phần tử name là "John"
	// Giá trị phần tử description là "Write by John".
	@MyFirstAnnotation(name = "John", description = "Write by John")
	public UsingMyFirstAnnotation() {}
	
	@MyFirstAnnotation(name = "Tom")
	public void someMethod(){}
	
	public void todo(@MyFirstAnnotation(name = "none") String job) {
		@MyFirstAnnotation(name = "Some name")
		int localVariable = 0;
	}
}
