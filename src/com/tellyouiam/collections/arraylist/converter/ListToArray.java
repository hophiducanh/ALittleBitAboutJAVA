package com.tellyouiam.collections.arraylist.converter;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<String> newArrayList = Lists.newArrayList("One", "Two", "Three", "Four");
		String[] strings = newArrayList.toArray(new String[]{});
		System.out.println(Arrays.toString(strings));
	}
}
