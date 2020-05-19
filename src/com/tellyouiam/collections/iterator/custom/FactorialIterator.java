package com.tellyouiam.collections.iterator.custom;

import java.util.Iterator;

public class FactorialIterator implements Iterator<Integer> {
	private final Integer mNumber;
	private Integer mPosition;
	private Integer mFactorial;
	
	
	public FactorialIterator(Integer number) {
		this.mNumber = number;
		this.mPosition = 1;
		this.mFactorial = 1;
	}
	
	@Override
	public boolean hasNext() {
		return mPosition <= mNumber;
	}
	
	@Override
	public Integer next() {
		if (!hasNext())
			return 0;
		
		mFactorial = mFactorial * mPosition;
		
		mPosition++;
		
		return  mFactorial;
	}
}
