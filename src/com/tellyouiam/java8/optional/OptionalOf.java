package com.tellyouiam.java8.optional;

import java.util.Optional;

public class OptionalOf {
	public static void main(String[] args) {
		// of(null) always throw null pointer exception exception.
		Object str = Optional.of(null).orElseThrow(IllegalAccessError::new);
		System.out.println(str);
	}
}
