package com.tellyouiam.problem.maximum.gap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : Ho Anh
 * @since : 03/10/2019, Thu
 **/
public class FindMaxGapBetweenConsecutiveNumberInSortedList {

	private static int[] maxSortedAdjacentDiff(int[] arr, int n) {
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

		for (int i = 0; i < n; i++) {
			if (arr[i] == maxVal || arr[i] == minVal) {
				continue;
			}

			// Finding index of bucket.
			int index = (int) ((arr[i] - minVal) / delta);

			// Filling/Updating maximum value of bucket
			if (maxBucket[index] == Integer.MIN_VALUE) {
				maxBucket[index] = arr[i];
			} else {
				maxBucket[index] = Math.max(maxBucket[index], arr[i]);
			}

			// Filling/Updating minimum value of bucket
			if (minBucket[index] == Integer.MAX_VALUE) {
				minBucket[index] = arr[i];
			} else {
				minBucket[index] = Math.min(minBucket[index], arr[i]);
			}
		}

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
//			System.out.println("Values:" + max_gap + ", minBucket[i]: "  + minBucket[i] + ", Pre_val: "+ prev_val);
			p = Ternary.of(max_gap, minBucket[i], prev_val);
			ternaries.add(p);

			//Example of print list 3 value instead of ternaries
//			IntStream.range(0, str.length()).boxed()
//				.intervalMap((i, j) -> str.charAt(i) == str.charAt(j), Pair::of)
//				.maxBy(p -> p.right - p.left)
//				.map(p -> Triple.of(p.left, p.right - p.left + 1, str.charAt(p.left)))
//				.ifPresent(System.out::println);
//
			prev_val = maxBucket[i];
		}
		System.out.println(ternaries);
		for (Ternary<Integer, Integer, Integer> ternary : ternaries) {
			System.out.println(ternary.getFirst() + "->" + ternary.getSecond() + "->" + ternary.getThird());
		}
		max_gap = Math.max(max_gap, maxVal - prev_val);
			return new int[]{max_gap, maxVal, prev_val};
//		return results;
	}

	// Driver program to run the case
	public static void main(String[] args) {

		int[] arr = {0, 1, 2, 3, 4, 1000, 1001};
		System.out.println("********************************XXXXX******************************");
		int z = Arrays.stream(arr).max().getAsInt();
		System.out.println(z);
		int n = arr.length;
		int[] values =  maxSortedAdjacentDiff(arr, n);
		int x = ThreadLocalRandom.current().nextInt(values[2], values[1]);
		System.out.println("Max: " + values[1] + "," + "Previous: " + values[2]);
//		System.out.println(Math.round(5.49));

		int xxx = (int) 4.9;
		System.out.println(xxx);

	}
}
