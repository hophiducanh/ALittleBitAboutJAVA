package com.tellyouiam.java8.customcollector.collector;

import com.tellyouiam.java8.customcollector.model.Rating;
import com.tellyouiam.java8.customcollector.model.SummarizedRating;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * T, A, and R are respectively the type of the elements in the stream, the type of the object
 * used to accumulate partial results, and the type of the final result of the collect operation.
 * */
public class ConcurrentRatingCollector implements Collector<Rating, ConcurrentRatingCollector.GroupedRatings, SummarizedRating> {
	
	static class GroupedRatings {
		
		private int goodRatings;
		private int averageRatings;
		private int badRatings;
		
		void incrementAverageRating() {
			averageRatings++;
		}
		
		void incrementGoodRating() {
			goodRatings++;
		}
		
		void incrementBadRating() {
			badRatings++;
		}
		
		long size() {
			return averageRatings + goodRatings + badRatings;
		}
		
		@Override
		public String toString() {
			return "GroupedRatings{" +
					"goodRatings=" + goodRatings +
					", averageRatings=" + averageRatings +
					", badRatings=" + badRatings +
					'}';
		}
	}
	
	@Override
	public Supplier<GroupedRatings> supplier() {
		return GroupedRatings::new;
	}
	
	//BiConsumer<A, T>
	@Override
	public BiConsumer<GroupedRatings, Rating> accumulator() {
		return ((groupedRatings, rating) -> {
			final int mark = rating.getMark();
			if (mark >= 4 && mark <= 6) {
				groupedRatings.incrementAverageRating();
			} else if (mark < 4) {
				groupedRatings.incrementBadRating();
			} else {
				groupedRatings.incrementGoodRating();
			}
		});
	}
	
	//BinaryOperator<A>
	@Override
	public BinaryOperator<GroupedRatings> combiner() {
		return (g, otherG) -> {
			g.averageRatings += otherG.averageRatings;
			g.badRatings += otherG.badRatings;
			g.goodRatings += otherG.goodRatings;
			return g;
		};
	}
	
	//Function<A, R>
	@Override
	public Function<GroupedRatings, SummarizedRating> finisher() {
		return groupedRatings -> {
			long size = groupedRatings.size();
			float prctAverage = groupedRatings.averageRatings / (float) size;
			float prctGood = groupedRatings.goodRatings / (float) size;
			float prctBad = groupedRatings.badRatings / (float) size;
			return new SummarizedRating(prctGood, prctAverage, prctBad);
		};
	}
	
	@Override
	public Set<Characteristics> characteristics() {
		Set<Characteristics> characteristics = Collections.singleton(Characteristics.UNORDERED);
		return characteristics;
	}
}
