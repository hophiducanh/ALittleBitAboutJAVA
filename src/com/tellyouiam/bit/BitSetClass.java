package com.tellyouiam.bit;

import org.openjdk.jol.info.GraphLayout;

import java.util.BitSet;

public class BitSetClass {
	public static void main(String[] args) {
		BitSet bitSet = new BitSet(1024);
//		String s = bitSet.toString();
//		System.out.println("s = " + s);
		System.out.println(GraphLayout.parseInstance(bitSet).toPrintable());
	}
}
