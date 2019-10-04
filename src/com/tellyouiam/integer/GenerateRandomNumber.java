package com.tellyouiam.integer;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : Ho Anh
 * @since : 04/10/2019, Fri
 **/
public class GenerateRandomNumber {
	public static void main(String[] args) {
		int regCode = ThreadLocalRandom.current().nextInt(5, 7);
		System.out.println(regCode);
	}

}
