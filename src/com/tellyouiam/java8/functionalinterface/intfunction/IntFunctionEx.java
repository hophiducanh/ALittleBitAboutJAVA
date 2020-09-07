package com.tellyouiam.java8.functionalinterface.intfunction;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

//https://stackoverflow.com/questions/29447561/how-do-java-8-array-constructor-references-work
public class IntFunctionEx {
	public static void main(String[] args) {
		ArrayList<String> newArrayList = Lists.newArrayList("One", "Two", "Three", "Four");
		IntFunction<String[]> intFunction = i -> new String[i];
		String[] streamStrings = newArrayList.stream().toArray(intFunction);
		System.out.println(Arrays.toString(streamStrings));
	}
}
