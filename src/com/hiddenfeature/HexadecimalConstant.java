package com.hiddenfeature;

//https://stackoverflow.com/questions/10920432/why-use-hexadecimal-constants
public class HexadecimalConstant {
	private static final int ORDINARY_NUMBER = 2914;
	private static final int HEXADECIMAL_NUMBER = 0x0B62;
	//Hexadecimal is more readability
	//Hex encode 4 bits per digit:
	//0 ~ 0000
	//B ~ 11: 1011
	//6 ~ 0110
	//2 ~ 0010
	// ---> 0000101101100010
	//Would you rather write 0xFFFFFFFF or 4294967295?
	//hex range: 0x0000 -> 0xFFFF
	public static void main(String[] args) {
		System.out.println(ORDINARY_NUMBER == HEXADECIMAL_NUMBER);
	}
}
