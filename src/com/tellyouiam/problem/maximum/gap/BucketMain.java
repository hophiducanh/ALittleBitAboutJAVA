package com.tellyouiam.problem.maximum.gap;

/**
 * @author : Ho Anh
 * @since : 04/10/2019, Fri
 **/

//Ref: https://www.programcreek.com/2014/03/leetcode-maximum-gap-java/
public class BucketMain {

	static class Bucket{
		int low;
		int high;
		public Bucket(){
			low = -1;
			high = -1;
		}
	}

	public static int maximumGap(int[] num) {
		if(num == null || num.length < 2){
			return 0;
		}

		int max = num[0];
		int min = num[0];
		for(int i=1; i<num.length; i++){
			max = Math.max(max, num[i]);
			min = Math.min(min, num[i]);
		}

		// initialize an array of buckets
		Bucket[] buckets = new Bucket[num.length+1]; //project to (0 - n)
		for(int i=0; i<buckets.length; i++){
			buckets[i] = new Bucket();
		}

		double interval = (double) num.length / (max - min);
		//distribute every number to a bucket array
		for(int i=0; i<num.length; i++){
			int index = (int) ((num[i] - min) * interval);

			if(buckets[index].low == -1){
				buckets[index].low = num[i];
				buckets[index].high = num[i];
			}else{
				buckets[index].low = Math.min(buckets[index].low, num[i]);
				buckets[index].high = Math.max(buckets[index].high, num[i]);
			}
		}
//		for (int i1 : num) {
//			int index = (int) ((i1 - min) * interval);
//
//			if (buckets[index].low == -1) {
//				buckets[index].low = i1;
//				buckets[index].high = i1;
//			} else {
//				buckets[index].low = Math.min(buckets[index].low, i1);
//				buckets[index].high = Math.max(buckets[index].high, i1);
//			}
//		}

		//scan buckets to find maximum gap
		int result = 0;
		int prev = buckets[0].high;
		for(int i=1; i<buckets.length; i++){
			if(buckets[i].low != -1){
				result = Math.max(result, buckets[i].low-prev);
				prev = buckets[i].high;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 5, 9, 11, 20, 25, 30, 39, 100000, 10010000, 100000000, 100000001, 1000000000, 1000000001};
		int x = maximumGap(arr);
		System.out.println(x);
	}
}
