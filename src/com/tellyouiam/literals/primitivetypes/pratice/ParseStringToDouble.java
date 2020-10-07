package com.tellyouiam.literals.primitivetypes.pratice;

import java.text.DecimalFormat;
import java.text.ParseException;

public class ParseStringToDouble {
	public static void main(String[] args) throws ParseException {
		String text = "12.34";
		double value = Double.parseDouble(text);
		System.out.println(value);
		
		String text1 = "1234,56.25";
		double loanBalance = new DecimalFormat("#,####.#####").parse(text).doubleValue();
		double l = new DecimalFormat("#,####.##").parse(text1).doubleValue();
		System.out.println(loanBalance);
		System.out.println(text1);
		System.out.println("l :" + l);
		
		System.out.println(0 == 0.00);
		
		System.out.println(Double.parseDouble("0.00"));
	}
}
