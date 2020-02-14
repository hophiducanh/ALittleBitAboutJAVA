package com.tellyouiam.java8.java8inaction.chap5;

import java.util.stream.IntStream;
/*
  IntStream rangeClosed(int startInclusive, int endInclusive) returns an IntStream from startInclusive (inclusive) to endInclusive (inclusive)
  by an incremental step of 1.
  */

/*
  Syntax :

  static IntStream rangeClosed(int startInclusive,   int endInclusive)
  */


/**
 *  Parameters :
 *
 * 	IntStream : A sequence of primitive int-valued elements.
 * 	startInclusive : The inclusive initial value.
 * 	endInclusive : The inclusive upper bound.
 * */

/* Reference: https://www.geeksforgeeks.org/intstream-rangeclosed-java/*/
public class RangeClosed {
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1,5);
		stream.forEach(System.out::println);
	}

	/*
	  Note : IntStream rangeClosed(int startInclusive, int endInclusive) basically works like a for loop.
	  An equivalent sequence of increasing values can be produced sequentially as :

	  for (int i = startInclusive; i <= endInclusive ; i++)
	  {
	   ...
	   ...
	   ...
	  }
	  */
}
