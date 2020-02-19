package com.tellyouiam.java8.java8inaction.chap5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreams {
	public static void main(String[] args) {

		//Pythagorean
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream()
			.filter(i -> i % 2 == 0)
			.distinct()
			.forEach(System.out::println);
		Stream<int[]> pythagoreanTriples =
			IntStream.rangeClosed(1, 5).boxed()
				.flatMap(a -> IntStream.rangeClosed(a, 100)
					.filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).boxed()
					.map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));

//		pythagoreanTriples.forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

		IntStream inter = IntStream.rangeClosed(1,5);
		//inter.forEach(System.out::println);

		//System.out.println(inter);

		List<Integer> numberss = Arrays.asList(1, 2, 1, 3, 4, 4);
		System.out.println(Arrays.toString(new List[]{numberss}));
		Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
		Set<Integer> duplicatedNumbersSet = numberss.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n)).collect(Collectors.toSet());
		System.out.println(Arrays.toString(new Set[]{duplicatedNumbersSet}));
		System.out.println(Arrays.toString(new Set[]{duplicatedNumbersRemovedSet}));
	}
}