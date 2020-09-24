package com.tellyouiam.guava.collections.lists;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class CreateAList {
	public static void main(String[] args) {
		final ArrayList<String> strings = Lists.newArrayList("Join", "Adam", "Logbasex");
		List<Character> characters = Lists.charactersOf("List");
		characters.forEach(character -> System.out.println());
		
	}
}
