package com.tellyouiam.java8.findfirst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Ho Anh
 * @since : 02/10/2019, Wed
 **/
public class FindFirstAndSkipJava8 {
	public static Integer getRandomInteger() {
		Random rand = new Random();
		int x = rand.nextInt(Integer.MAX_VALUE);
		return x;
	}
	public static void main(String[] args) {
		List<Integer> ids = Arrays.asList(5,10,15);
		Integer x = ids.stream().filter(Objects::nonNull).findFirst().orElse(null);
		Integer y = ids.stream().filter(Objects::nonNull).skip(1).findFirst().orElse(null);
		Integer z = ids.stream().filter(Objects::nonNull).skip(2).findFirst().orElse(null);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(Integer.MAX_VALUE);

		System.out.println("*******************************************");

		int result = Stream.of(2, 3, 2, 5)
			.collect(Collectors.collectingAndThen(
				Collectors.toMap(
					Function.identity(),
					Function.identity(),
					(m, n) -> 0),
				map -> map.values().stream().mapToInt(Integer::intValue).sum()));
		System.out.println(result);

//		System.out.println(Arrays.toString(new IntStream[]{ThreadLocalRandom.current().ints(0, 100)}));;

		Long l = System.nanoTime();
		ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
		Long k = System.nanoTime();
		System.out.println(TimeUnit.NANOSECONDS.convert(k-l, TimeUnit.NANOSECONDS));

		Long cc = System.nanoTime();
		getRandomInteger();
		Long bb = System.nanoTime();
		System.out.println(TimeUnit.NANOSECONDS.convert(bb-cc, TimeUnit.NANOSECONDS));

		System.out.println("*****************");
		List<Integer> xyz = Arrays.asList(1,2,3,4,5,6,7,8,9);
	}
}
