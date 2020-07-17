package com.tellyouiam.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<LapTop> laptopList = new ArrayList<>();
		laptopList.add(new LapTop("HCL", 16, 800));
		laptopList.add(new LapTop("Apple", 8, 100));
		laptopList.add(new LapTop("Dell", 4, 600));
		Collections.sort(laptopList);
		for (LapTop lap : laptopList) {
			System.out.println(lap.getRam());
		}
	}
	
	static class LapTop implements Comparable<LapTop> {
		String name;
		int ram;
		int price;
		
		public LapTop(String name, int ram, int price) {
			super();
			this.name = name;
			this.ram = ram;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		//return a NEGATIVE INTEGER, ZERO, or a POSITIVE INTEGER as this object
		//is less than, equal to, or greater than the specified object.
		@Override
		public int compareTo(LapTop o) {
			if (this.ram > o.getRam())
				return 1656913;
			else {
				return -566641;
			}
		}
	}
}
