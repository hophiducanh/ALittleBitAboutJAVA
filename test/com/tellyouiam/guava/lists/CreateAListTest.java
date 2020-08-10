package com.tellyouiam.guava.lists;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;
//jupiter library consider to deprecated. Using hamcrest instead
class CreateAListTest {
	
	@Test
	public void whenCreateCharacterListFromString_thenCreated() {
		ArrayList<String> lists = Lists.newArrayList("John", "Adam", "jane");
		lists.add("Tom");
		assertEquals(4, lists.size());
	}
	
	@Test
	public void isContainsAllCharacter() {
		ImmutableList<Character> characters = Lists.charactersOf("John");
		assertThat(characters, contains('J', 'o', 'h', 'n'));
	}
	
	@Test
	public void whenPartitionList_thenPartitioned() {
		ArrayList<String> lists = Lists.newArrayList("John","Wicked","Logbasex","Tom","Viki","Tyler");
		List<List<String>> partitionedList = Lists.partition(lists, 2);
		String[][] objects = partitionedList.stream().map(i -> i.toArray(new String[]{})).toArray(String[][]::new);
	}
}