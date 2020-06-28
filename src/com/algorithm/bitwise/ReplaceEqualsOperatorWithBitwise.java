package com.algorithm.bitwise;

//https://stackoverflow.com/questions/31678344/compare-two-integers-using-bit-operator
public class ReplaceEqualsOperatorWithBitwise {
	//xor
	public static int isEqual(int x, int y) {
		return x ^ y;
	}
	
	public static int msb(int x) {
		return lsb(x >> 31);
	}
	
	public static int lsb(int x) {
		return x & 1;
	}
	
	// returns 1 if x < 0, 0 if x >= 0
	public static int isNegative(int x) {
		return msb(x);
	}
	
	//// returns 1 if a > b, 0 if a <= b
	public static int isGreater(int a, int b) {
		return isNegative(b -a);
	}
	
	public static int toggle(int x) {
		return lsb(~x);
	}
	
	public static int isDiffSigns(int a, int b) {
		return msb(a ^ b);
	}
	public static int isSameSign(int a, int b) {
		return toggle(isDiffSigns(a, b));
	}
	
	public static void main(String[] args) {
		//return 0 >> equals >> (A XOR A = 0)
		int c = isEqual(4,4);
		
		//return 1 >> NOT equals
		int d =  isEqual(4,5); //1
		int e =  isEqual(5,4); //1
		System.out.println("Is negative: " + isNegative(30));
		System.out.println("Is greater: " + isGreater(5, 4));
		
	}
}
