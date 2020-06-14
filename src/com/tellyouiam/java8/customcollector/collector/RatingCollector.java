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

//http://myjavaadventures.com/blog/2019/04/24/defining-a-custom-collector-in-java-8/#requirement
public class RatingCollector implements Collector<Rating, RatingCollector.GroupedRatings, SummarizedRating> {
	
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
	// End GroupedRatings class declaration
	
	@Override
	public Supplier<GroupedRatings> supplier() {
		return GroupedRatings::new;
	}
	
	@Override
	public BiConsumer<GroupedRatings, Rating> accumulator() {
		
		return (groupedRatings, rating) -> {
			final int mark = rating.getMark();
			if (mark >= 4 && mark <= 6) {
				groupedRatings.incrementAverageRating();
			} else if (mark < 4) {
				groupedRatings.incrementBadRating();
			} else {
				groupedRatings.incrementGoodRating();
			}
		};
	}
	
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
	
	//sequential stream don't use characteristics and combiner. It's only use for parallel stream.
	//https://stackoverflow.com/questions/29959795/how-does-combiner-in-stream-collect-method-work-in-java-8/29960350
	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();
	}
	
	@Override
	public BinaryOperator<GroupedRatings> combiner() {
		return (g, otherG) -> {
			throw new UnsupportedOperationException("Parallel stream not supported");
		};
	}
	
}
