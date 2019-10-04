package com.tellyouiam.problem.maximum.gap;

/**
 * @author : Ho Anh
 * @since : 03/10/2019, Thu
 **/
public class Ternary<U, V, W> {
	private U first;

	public U getFirst() {
		return first;
	}

	public void setFirst(U first) {
		this.first = first;
	}

	public V getSecond() {
		return second;
	}

	public void setSecond(V second) {
		this.second = second;
	}

	public W getThird() {
		return third;
	}

	public void setThird(W third) {
		this.third = third;
	}

	private V second;
	private W third;

	public Ternary(){}

	private Ternary(U first, V second, W third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	@Override
	public String toString()
	{
		return "(" + first + ", " + second + ", " + third + ")";
	}

	public static <U, V, W> Ternary <U, V, W> of(U a, V b, W c)
	{
		// calls private constructor
		return new Ternary<>(a, b, c);
	}
}
