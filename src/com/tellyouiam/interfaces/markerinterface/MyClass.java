package com.tellyouiam.interfaces.markerinterface;

//CloneNotSupportedException if we not implement Cloneable
//https://shareprogramming.net/marker-interface-chi-la-mot-cai-ten/
public class MyClass implements Cloneable {
	private String s;
	
	public MyClass(String s) {
		this.s = s;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getS() {
		return s;
	}
}
