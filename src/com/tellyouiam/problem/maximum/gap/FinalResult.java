package com.tellyouiam.problem.maximum.gap;

import com.tellyouiam.integer.GenerateUniqueRandomNumberInRange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author : Ho Anh
 * @since : 06/10/2019, Sun
 **/
public class FinalResult {
	private static List<Ternary<Integer, Integer, Integer>> maxSortedAdjacentDiff(int[] arr) {
		int maxVal = Arrays.stream(arr).max().orElse(0);
		int minVal = Arrays.stream(arr).min().orElse(0);

		int[] maxBucket = new int[arr.length - 1];
		int[] minBucket = new int[arr.length - 1];
		Arrays.fill(maxBucket, 0, arr.length - 1, Integer.MIN_VALUE);
		Arrays.fill(minBucket, 0, arr.length - 1, Integer.MAX_VALUE);

		float delta = (float) (maxVal - minVal) / (float) (arr.length - 1);

		for (int i : arr) {
			if (i == maxVal || i == minVal) {
				continue;
			}

			int index = (int) ((i - minVal) / delta);

			if (maxBucket[index] == Integer.MIN_VALUE) {
				maxBucket[index] = i;
			} else {
				maxBucket[index] = Math.max(maxBucket[index], i);
			}

			if (minBucket[index] == Integer.MAX_VALUE) {
				minBucket[index] = i;
			} else {
				minBucket[index] = Math.min(minBucket[index], i);
			}
		}
		List<Integer> ls = IntStream.of(minBucket).boxed().collect(Collectors.toList());
		List<Integer> min = ls.stream().filter(i -> !i.equals(Integer.MAX_VALUE)).sorted().collect(Collectors.toList());

		List<Integer> ls1 = IntStream.of(maxBucket).boxed().collect(Collectors.toList());
		List<Integer> max = ls1.stream().filter(i -> !i.equals(Integer.MIN_VALUE)).sorted().collect(Collectors.toList());

		List<Ternary<Integer, Integer, Integer>> gapsAndStartValues = new ArrayList<>();

		int prev_val = minVal;
		int max_gap = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (minBucket[i] == Integer.MAX_VALUE) {
				continue;
			}

			max_gap = Math.max(max_gap, minBucket[i] - prev_val);
			gapsAndStartValues.add(Ternary.of(max_gap, prev_val, minBucket[i]));
			prev_val = maxBucket[i];
		}
		max_gap = Math.max(max_gap, maxVal - prev_val);
		gapsAndStartValues.add(Ternary.of(max_gap, prev_val, maxVal));
		int i = 1;
		for (Ternary<Integer, Integer, Integer> ternary : gapsAndStartValues) {
			i++;
			System.out.println(i + "; " + ternary.getFirst() + "->" + ternary.getSecond() + "->" + ternary.getThird());
		}

		return gapsAndStartValues;
	}
	public static void main(String[] args) {
		List<Integer> ls = GenerateUniqueRandomNumberInRange.generateListUniqueRandomNumber();
		int[] arr = ls.stream().flatMapToInt(c -> IntStream.of(c.intValue())).toArray();
		System.out.println(Arrays.toString(arr));
		int n = arr.length;
		List<Ternary<Integer, Integer, Integer>> values =  maxSortedAdjacentDiff(arr);

	}
}
