package com.tellyouiam.java8.exception.checkedexception;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckedException {
	public List<Class> getClasses() throws ClassNotFoundException {
		
		return Stream.of("java.lang.Object", "java.lang.Integer", "java.lang.String")
				.map(className -> {
					try {
						return Class.forName(className);
					} catch (ClassNotFoundException e) { //checked exception
						e.printStackTrace();
					}
					return null;
				})
				.collect(Collectors.toList());
	}
	
	public List<Class> getClasses(final List<String> names) throws ClassNotFoundException {
		final List<Class> classes = new ArrayList<>();
		for (final String name : names)
			classes.add(Class.forName(name));
		return classes;
	}
	
	// The Stream function which we want to compile.
	public Stream<Class> getClasses(final Stream<String> names) throws ClassNotFoundException {
		//return names.map(Class::forName); //checked exception need try/catch
		return null;
	}
	
	public static void main(String[] args) {
	
	}
}
