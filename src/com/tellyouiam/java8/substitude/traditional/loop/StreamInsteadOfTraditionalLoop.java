package com.tellyouiam.java8.substitude.traditional.loop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author : Ho Anh
 * @since : 03/10/2019, Thu
 **/
public class StreamInsteadOfTraditionalLoop {

//	static int maxSortedAdjacentDiff(int[] arr, int n) {
//		// Find maximum and minimum in arr[]
//		int maxVal = arr[0];
//		int minVal = arr[0];
//		for (int i = 1; i < n; i++) {
//			maxVal = Math.max(maxVal, arr[i]);
//			minVal = Math.min(minVal, arr[i]);
//		}
//
//		// Arrays to store maximum and minimum values
//		// in n-1 buckets of differences.
//		int maxBucket[] = new int[n - 1];
//		int minBucket[] = new int[n - 1];
//		Arrays.fill(maxBucket, 0, n - 1, Integer.MIN_VALUE);
//		Arrays.fill(minBucket, 0, n - 1, Integer.MAX_VALUE);
//
//		// Expected gap for every bucket.
//		float delta = (float) (maxVal - minVal) / (float) (n - 1);
//
//		// Traversing through array elements and
//		// filling in appropriate bucket if bucket
//		// is empty. Else updating bucket values.
//		for (int i = 0; i < n; i++) {
//			if (arr[i] == maxVal || arr[i] == minVal) {
//				continue;
//			}
//
//			// Finding index of bucket.
//			int index = (int) (Math.round((arr[i] - minVal) / delta));
//
//			// Filling/Updating maximum value of bucket
//			if (maxBucket[index] == Integer.MIN_VALUE) {
//				maxBucket[index] = arr[i];
//			} else {
//				maxBucket[index] = Math.max(maxBucket[index], arr[i]);
//			}
//
//			// Filling/Updating minimum value of bucket
//			if (minBucket[index] == Integer.MAX_VALUE) {
//				minBucket[index] = arr[i];
//			} else {
//				minBucket[index] = Math.min(minBucket[index], arr[i]);
//			}
//		}
//
//		// Finding maximum difference between maximum value
//		// of previous bucket minus minimum of current bucket.
//		int prev_val = minVal;
//		int max_gap = 0;
//		for (int i = 0; i < n - 1; i++) {
//			if (minBucket[i] == Integer.MAX_VALUE) {
//				continue;
//			}
//			max_gap = Math.max(max_gap, minBucket[i] - prev_val);
//			prev_val = maxBucket[i];
//		}
//		max_gap = Math.max(max_gap, maxVal - prev_val);
//
//		return max_gap;
//	}
//	@SuppressWarnings("Duplicates")
//	static Integer diff(List<Integer> ls, int[] arr) {
//		Integer maxVal = Collections.max(ls);
//		Integer minVal = Collections.min(ls);
//
//		List<Integer> maxBucket = new ArrayList<>(Collections.nCopies(ls.size() - 1, Integer.MAX_VALUE));
//		List<Integer> minBucket = new ArrayList<>(Collections.nCopies(ls.size() - 1, Integer.MIN_VALUE));
//
//		float delta = (float) (maxVal - minVal) / (float) (ls.size() - 1);
//
//		List<List<Integer>> result = ls.stream().collect(
//			() -> Arrays.asList(maxBucket,minBucket),
//			(l,i) -> {
//				l.get(0). ;
//				l.get(1).add(Math.min(0, i));
//				},
//
//			(a,b) -> { a.get(0).addAll(b.get(0)); a.get(1).addAll(b.get(1)); });
//	}

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1, 2, 3, 5, 9, 15);
		String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};

		List<String> nameList =
				//IntStream.range is equivalent to:
				//for (int i = startInclusive; i < endExclusive ; i++)
			IntStream.range(0, names.length)
				.filter(i -> names[i].length() <= i)
				.mapToObj(i -> names[i])
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(new List[]{nameList}));
	}
}
