package com.tellyouiam.java8.exception.checkedexception;

public interface Stream<T> {
	<R, E extends Throwable> Stream<R> map(Function<? super T, ? extends R, E> mapper) throws E;
}
