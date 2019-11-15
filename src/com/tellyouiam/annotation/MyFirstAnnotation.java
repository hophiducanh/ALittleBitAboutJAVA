package com.tellyouiam.annotation;

public @interface MyFirstAnnotation {
	public String name();
	
	public String description() default "";
}
