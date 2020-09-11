package com.tellyouiam.java8.random;

import java.util.Random;
import java.util.stream.DoubleStream;

public class GenerateRandom {
	public static void main(String[] args) {
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
		doubleStream.sequential().forEach(System.out::println);
	}
}
