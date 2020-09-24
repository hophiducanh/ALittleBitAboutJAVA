package com.tellyouiam.guava.collections.set;

import org.apache.commons.collections4.SetUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUtilsExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
//		set.add(3);
//		set.add(4);
//		set.add(5);
//		set.add(6);
		Set<Integer> validateSet = SetUtils.predicatedSet(set, i -> i.equals(1));
		System.out.println(validateSet);
		
		Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 5));
		Set<Integer> b = new HashSet<>(Arrays.asList(1, 2));
		SetUtils.SetView<Integer> ab = SetUtils.difference(a, b);
		System.out.println(ab);
		
		//https://www.baeldung.com/apache-commons-setutils
		Set<Integer> c = SetUtils.transformedSet(new HashSet<>(), e -> e * 2  );
		c.add(2);
		System.out.println(c);
	}
}
