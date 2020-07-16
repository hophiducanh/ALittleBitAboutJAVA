package com.tellyouiam.json.jackson.serialization;

import com.fasterxml.jackson.annotation.JsonValue;

public class MyPair {
	private String first;
	private String second;
	
	public MyPair(String first, String second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	@JsonValue
	public String toString() {
		return "MyPair{" + "first='" + first + '\'' + ", second='" + second + '\'' + '}';
	}
}
