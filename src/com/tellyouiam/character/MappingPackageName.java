package com.tellyouiam.character;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingPackageName {
	public static void main(String[] args) {
		List<String> packages = Arrays.stream(Package.getPackages()).map(Package::getName).collect(Collectors.toList());
		
		Class<?> classType = null;
		// try catch outside the for loop not working
		// trying to map class'name ONE time.
		try {
			for (String s : packages) {
				classType = Class.forName(s.concat(".").concat("String"));
			}
		} catch (ClassNotFoundException ignored) {}
		
		if (classType != null) {
			System.out.println(classType.getName());
		}
		
		Class<?> type = null;
		// trying to map class'name MULTIPLE time.
		for (String s : packages) {
			try {
				type = Class.forName(s.concat(".").concat("String"));
			} catch (ClassNotFoundException ignored) {}
		}
		
		System.out.println(type);
	}
}
