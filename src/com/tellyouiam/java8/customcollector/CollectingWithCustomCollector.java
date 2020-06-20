package com.tellyouiam.java8.customcollector;

import com.tellyouiam.java8.customcollector.collector.RatingCollector;
import com.tellyouiam.java8.customcollector.model.Rating;
import com.tellyouiam.java8.customcollector.model.SummarizedRating;

import java.util.List;

import static com.tellyouiam.java8.customcollector.model.CommonFixture.create10millionsOfRatings;

public class CollectingWithCustomCollector {
	public static void main(String[] args) {
		List<Rating> ratings = create10millionsOfRatings();
		long start = System.currentTimeMillis();
		SummarizedRating summarizedRating =
				ratings.stream()
						.collect(new RatingCollector());
		
		System.out.println("time = " + (System.currentTimeMillis() - start));
		
		System.out.println(summarizedRating);
	}
}
