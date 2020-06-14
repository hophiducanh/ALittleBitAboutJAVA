package com.tellyouiam.java8.customcollector;

import com.tellyouiam.java8.customcollector.collector.ConcurrentRatingCollector;
import com.tellyouiam.java8.customcollector.model.CommonFixture;
import com.tellyouiam.java8.customcollector.model.Rating;
import com.tellyouiam.java8.customcollector.model.SummarizedRating;

import java.util.List;

//http://myjavaadventures.com/blog/2019/04/24/defining-a-custom-collector-in-java-8/#requirement
public class CollectingWithCustomCollectorWithParallelStream {
	public static void main(String[] args) {
		
		List<Rating> ratings = CommonFixture.create10millionsOfRatings();
		
		long start = System.currentTimeMillis();
		SummarizedRating summarizedRating =
				ratings.parallelStream()
						.collect(new ConcurrentRatingCollector());
		
		System.out.println("time = " + (System.currentTimeMillis() - start));
		
		System.out.println(summarizedRating);
	}
}
