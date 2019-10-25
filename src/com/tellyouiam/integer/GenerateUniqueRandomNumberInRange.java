package com.tellyouiam.integer;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * @author : Ho Anh
 * @since : 04/10/2019, Fri
 **/
public class GenerateUniqueRandomNumberInRange {
	public static List<Integer> generateListUniqueRandomNumber() {
		return ThreadLocalRandom.current().ints(0, Integer.MAX_VALUE)
			.distinct()
			.boxed()
			.limit(15)
			.collect(Collectors.toList());
	}
}
