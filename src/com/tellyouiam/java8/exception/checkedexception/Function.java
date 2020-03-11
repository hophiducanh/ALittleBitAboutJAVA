package com.tellyouiam.java8.exception.checkedexception;

public interface Function<T, R, E extends Throwable> {
	R apply(T t) throws E;
}
