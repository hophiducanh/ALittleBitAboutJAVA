package com.tellyouiam.object;

public class NullObject {
	static class Apple {
		private String color;
		
		public Apple() {}
		
		Apple(String color) {
			this.color = color;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
	}
	
	public static void main(String[] args) {
		Apple apple = new Apple(null);
		System.out.println(apple.color);
	}
}
