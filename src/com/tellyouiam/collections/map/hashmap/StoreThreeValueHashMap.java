package com.tellyouiam.collections.map.hashmap;

import com.tellyouiam.problem.maximum.gap.Pair;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : Ho Anh
 * @since : 03/10/2019, Thu
 **/
public class StoreThreeValueHashMap {

	private static List<Pair<Integer, Integer>> maxSortedAdjacentDiff(int[] arr, int n) {
		int maxVal = Arrays.stream(arr).max().getAsInt();
		int minVal = Arrays.stream(arr).min().getAsInt();

		int[] maxBucket = new int[n - 1];
		int[] minBucket = new int[n - 1];
		Arrays.fill(maxBucket, 0, n - 1, Integer.MIN_VALUE);
		Arrays.fill(minBucket, 0, n - 1, Integer.MAX_VALUE);

		float delta = (float) (maxVal - minVal) / (float) (n - 1);

		for (int i = 0; i < n; i++) {
			if (arr[i] == maxVal || arr[i] == minVal) continue;

			int index = Math.round((arr[i] - minVal) / delta);

			if (maxBucket[index] == Integer.MIN_VALUE)
				maxBucket[index] = arr[i];
			else
				maxBucket[index] = Math.max(maxBucket[index], arr[i]);

			if (minBucket[index] == Integer.MAX_VALUE)
				minBucket[index] = arr[i];
			else
				minBucket[index] = Math.min(minBucket[index], arr[i]);
		}

		List<Pair<Integer, Integer>> gapsAndStartValues = new ArrayList<>();

		int prev_val = minVal;
		int max_gap = 0;
		for (int i = 0; i < n - 1; i++) {
			if (minBucket[i] == Integer.MAX_VALUE) continue;

			max_gap = Math.max(max_gap, minBucket[i] - prev_val);
			prev_val = maxBucket[i];
			gapsAndStartValues.add(Pair.of(max_gap, prev_val));
		}
		max_gap = Math.max(max_gap, maxVal - prev_val);
		gapsAndStartValues.add(Pair.of(max_gap, prev_val));

		return gapsAndStartValues;
	}

	public static void main(String[] args) {
		Map<String, Map<String, String>> mapX = new HashMap<String, Map<String, String>>();

		Map.Entry<String,Integer> entryX = new AbstractMap.SimpleEntry<String, Integer>("exampleString", 42);
		java.util.List<java.util.Map.Entry<String,Integer>> pairList= new java.util.ArrayList<>();
		pairList.add(entryX);
//		System.out.println(pairList);

		int[] allCodes = new int[]{0,1,2,6,11,20,36,100};
 		List<Pair<Integer, Integer>> listGapsAndStartValue = maxSortedAdjacentDiff(allCodes, allCodes.length);
 		Pair<Integer, Integer> gap = listGapsAndStartValue.stream().max(Comparator.comparing(Pair::getFirst)).orElse(null);
		Integer code = null;
		if (gap != null) {
			code = gap.getSecond();
			Integer regCode = ThreadLocalRandom.current().nextInt(code + 1, code + gap.getFirst());
			System.out.println(code);
			System.out.println(gap.getFirst());
			System.out.println(regCode);
		}
	}
}
