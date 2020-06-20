package com.tellyouiam.java8.customcollector.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SummarizedRating {
	private float prctGood;
	private float prctAverage;
	private float prctBad;
	
	public SummarizedRating(float prctGood, float prctAverage, float prctBad) {
		this.prctGood = prctGood;
		this.prctAverage = prctAverage;
		this.prctBad = prctBad;
	}
}
