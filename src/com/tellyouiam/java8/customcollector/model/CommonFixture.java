package com.tellyouiam.java8.customcollector.model;

import java.util.ArrayList;
import java.util.List;

public class CommonFixture {
	public static void add10Ratings(List<Rating> ratings) {
		ratings.add(new Rating(4));
		ratings.add(new Rating(8));
		ratings.add(new Rating(6));
		ratings.add(new Rating(4));
		ratings.add(new Rating(2));
		ratings.add(new Rating(2));
		ratings.add(new Rating(9));
		ratings.add(new Rating(8));
		ratings.add(new Rating(3));
		ratings.add(new Rating(5));
	}
	
	public static List<Rating> create10millionsOfRatings() {
		List<Rating> ratings = new ArrayList<>();
		for (int i = 0; i < 10_000_000; i++) {
			add10Ratings(ratings);
		}
		return ratings;
	}
}
