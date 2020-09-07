package com.hiddenfeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StaticBlock {
	
	private static final int CONSTANT = getConstant();
	private static int getConstant() {
		return new Random().nextInt();
	}
	
	private static final int BLOCK_CONSTANT;
	static {
		BLOCK_CONSTANT = new Random().nextInt();
	}

	//https://stackoverflow.com/questions/2070293/why-doesnt-java-allow-to-throw-a-checked-exception-from-static-initialization-b?noredirect=1&lq=1
	//https://stackoverflow.com/questions/21321896/can-static-code-blocks-throw-exceptions
	//throw checked exception in static initialization block always results in an exception (with throws keyword)
	static Scanner scanner;
	static {
		try {
			String file = Objects.requireNonNull(StaticBlock.class.getClassLoader().getResource("source.txt")).getFile();
			scanner = new Scanner(new File(file));
			System.out.println(file);
		} catch (FileNotFoundException e) {
//			throw new RuntimeException();
//			throw new ExceptionInInitializerError(e);
		}
	}
	
	private static Constructor<?> constructor;
	
	static {
		try {
			constructor = StaticBlock.class.getDeclaredConstructor();
		} catch (NoSuchMethodException e) {
			//can't throw checked exception in static block: https://www.baeldung.com/java-exceptionininitializererror
//			throw new Exception(e);
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Logbasex");
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
