package com.tellyouiam.problem.maximum.gap;

import com.tellyouiam.integer.GenerateUniqueRandomNumberInRange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author : Ho Anh
 * @since : 03/10/2019, Thu
 **/
public class FindMaxGapBetweenConsecutiveNumberInSortedList {

	private static int[] maxSortedAdjacentDiffVersion2(int[] arr, int n) {
		// Find maximum and minimum in arr[]
		int maxVal = arr[0];
		int minVal = arr[0];
		for (int i = 1; i < n; i++) {
			maxVal = Math.max(maxVal, arr[i]);
			minVal = Math.min(minVal, arr[i]);
		}

		// Arrays to store maximum and minimum values
		// in n-1 buckets of differences.
		int[] maxBucket = new int[n - 1];
		int[] minBucket = new int[n - 1];
		Arrays.fill(maxBucket, 0, n - 1, Integer.MIN_VALUE);
		Arrays.fill(minBucket, 0, n - 1, Integer.MAX_VALUE);

		// Expected gap for every bucket.
		float delta = (float) (maxVal - minVal) / (float) (n - 1);

		for (int i1 : arr) {
			if (i1 == maxVal || i1 == minVal) {
				continue;
			}

			// Finding index of bucket.
			int index = (int) ((i1 - minVal) / delta);

			// Filling/Updating maximum value of bucket
			if (maxBucket[index] == Integer.MIN_VALUE) {
				maxBucket[index] = i1;
			} else {
				maxBucket[index] = Math.max(maxBucket[index], i1);
			}

			// Filling/Updating minimum value of bucket
			if (minBucket[index] == Integer.MAX_VALUE) {
				minBucket[index] = i1;
			} else {
				minBucket[index] = Math.min(minBucket[index], i1);
			}
		}

		List<Integer> ls = IntStream.of(minBucket).boxed().collect(Collectors.toList());
		List<Integer> min = ls.stream().filter(i -> !i.equals(Integer.MAX_VALUE)).sorted().collect(Collectors.toList());
		System.out.println("List min: {}" + Arrays.toString(min.toArray()));

		List<Integer> ls1 = IntStream.of(maxBucket).boxed().collect(Collectors.toList());
		List<Integer> max = ls1.stream().filter(i -> !i.equals(Integer.MIN_VALUE)).sorted().collect(Collectors.toList());
		System.out.println("List max: {}"+ Arrays.toString(max.toArray()));


		// Finding maximum difference between maximum value
		// of previous bucket minus minimum of current bucket.
		int prev_val = minVal;
		int max_gap = 0;
		int x;
		//List<Pair<Integer, Integer>> xx = new ArrayList<>(); Spring framework
		List<Ternary<Integer, Integer, Integer>> ternaries = new ArrayList<>();
		Ternary<Integer, Integer, Integer> p = new Ternary<>();
		for (int i = 0; i < n - 1; i++) {
			if (minBucket[i] == Integer.MAX_VALUE) {
				continue;
			}
			max_gap = Math.max(max_gap, minBucket[i] - prev_val);
			p = Ternary.of(max_gap, minBucket[i], prev_val);
			prev_val = maxBucket[i];
//			System.out.println("Values:" + max_gap + ", minBucket[i]: "  + minBucket[i] + ", Pre_val: "+ prev_val);
			ternaries.add(p);

			//Example of print list 3 value instead of ternaries
//			IntStream.range(0, str.length()).boxed()
//				.intervalMap((i, j) -> str.charAt(i) == str.charAt(j), Pair::of)
//				.maxBy(p -> p.right - p.left)
//				.map(p -> Ternary.of(p.left, p.right - p.left + 1, str.charAt(p.left)))
//				.ifPresent(System.out::println);
//
		}
		max_gap = Math.max(max_gap, maxVal - prev_val);
		ternaries.add(Ternary.of(max_gap, maxVal, prev_val));
		System.out.println(ternaries);
		int i = 1;
		for (Ternary<Integer, Integer, Integer> ternary : ternaries) {
			i++;
			System.out.println(i + "; " + ternary.getFirst() + "->" + ternary.getSecond() + "->" + ternary.getThird());
		}
			return new int[]{max_gap, maxVal, prev_val};
//		return results;
	}

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

		List<Ternary<Integer, Integer, Integer>> gapsAndBoundValue = new ArrayList<>();

		int prev_val = minVal;
		int max_gap = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (minBucket[i] == Integer.MAX_VALUE) {
				continue;
			}

			max_gap = Math.max(max_gap, minBucket[i] - prev_val);
			gapsAndBoundValue.add(Ternary.of(max_gap, prev_val, minBucket[i]));
			prev_val = maxBucket[i];
		}
		max_gap = Math.max(max_gap, maxVal - prev_val);
		gapsAndBoundValue.add(Ternary.of(max_gap, prev_val, maxVal));

		return gapsAndBoundValue;
	}
	
	// Driver program to run the case
	public static void main(String[] args) {
		List<Integer> ls = GenerateUniqueRandomNumberInRange.generateListUniqueRandomNumber();
		int[] arr = ls.stream().flatMapToInt(c -> IntStream.of(c.intValue())).toArray();
		System.out.println(Arrays.toString(arr));
		int n = arr.length;
		maxSortedAdjacentDiff(arr);
//		int x = ThreadLocalRandom.current().nextInt(values[2], values[1]);
//		System.out.println("Max: " + values[1] + "," + "Previous: " + values[2]);
//		System.out.println(Math.round(5.49));

		int xxx = (int) 4.9;
		System.out.println(xxx);

	}
}
