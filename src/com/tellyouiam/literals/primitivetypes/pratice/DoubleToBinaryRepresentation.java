package com.tellyouiam.literals.primitivetypes.pratice;

public class DoubleToBinaryRepresentation {
	public static void main(String[] args) {
		System.out.println("0:                0b" + Long.toBinaryString(Double.doubleToRawLongBits(0D)));
		System.out.println("0:                0b" + Long.toBinaryString(Double.doubleToRawLongBits(-1)));
		System.out.println("1:                0b" + Long.toBinaryString(Double.doubleToRawLongBits(1D)));
		System.out.println("2:                0b" + Long.toBinaryString(Double.doubleToRawLongBits(2D)));
		System.out.println("2^900:            0b" + Long.toBinaryString(Double.doubleToRawLongBits(Math.pow(2, 900))));
		System.out.println("Double.MAX_VALUE: 0b" + Long.toBinaryString(Double.doubleToRawLongBits(Double.MAX_VALUE)));
		
//		System.out.println(Long.toBinaryString(52));
//		System.out.println(Double.doubleToRawLongBits(-5));
		System.out.println(Double.doubleToRawLongBits(1D));
	}
}
