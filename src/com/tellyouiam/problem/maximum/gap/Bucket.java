package com.tellyouiam.problem.maximum.gap;

/**
 * @author : Ho Anh
 * @since : 04/10/2019, Fri
 **/
public class Bucket{
	private int low;
	private int high;
	public Bucket(){
		low = -1;
		high = -1;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}
}
