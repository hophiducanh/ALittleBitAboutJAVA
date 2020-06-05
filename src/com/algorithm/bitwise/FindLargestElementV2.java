package com.algorithm.bitwise;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLargestElementV2 {
	//MSB: most significant bit.
	public static long countGreaterElementWithSameMSB(List<Integer> seq, int valueAtMSBIndex) {
		return seq.stream().filter(element -> (valueAtMSBIndex & element) == valueAtMSBIndex).count();
	}
	
	public static void main(String[] args) {
		
		List<Integer> initialSeq = Stream.concat(Stream.of(1, 5, 9, 30, 15), Stream.of(Integer.MAX_VALUE))
				.collect(Collectors.toList());
		
		AtomicInteger max = new AtomicInteger();
		Stream.iterate(31, i -> i - 1).limit(32).forEachOrdered(bitIndex -> {
			int bitCheck = max.get() | 1 << bitIndex;
			long count = countGreaterElementWithSameMSB(initialSeq, bitCheck);
			if (count > 1) {
				max.set(bitCheck);
			}
		});
	}
}
