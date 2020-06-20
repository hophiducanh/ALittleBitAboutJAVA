package com.tellyouiam.java8.customcollector.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Rating {
	private int mark;
	
	public Rating(int mark) {
		this.mark = mark;
	}
	
	public int getMark() {
		return mark;
	}
}
