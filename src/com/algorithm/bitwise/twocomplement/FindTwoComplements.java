package com.algorithm.bitwise.twocomplement;

public class FindTwoComplements {
	// Method to find two's complement
	// find last occurred of 1 in binary and swap all before 1 (if 1 to 0; else if 0 to 1)
	// two's complement is revert all char in binary (if 1 to 0; else if 0 to 1) and then plus 1 (in the binary way)
	// https://www.geeksforgeeks.org/efficient-method-2s-complement-binary-string/
	// https://www.geeksforgeeks.org/whats-difference-between-1s-complement-and-2s-complement/
	static String findTwoscomplement(StringBuffer str)
	{
		int n = str.length();
		
		// Traverse the string to get first '1' from
		// the last of string
		int i;
		for (i = n-1 ; i >= 0 ; i--)
			if (str.charAt(i) == '1')
				break;
		
		// If there exists no '1' concat 1 at the
		// starting of string
		if (i == -1)
			return "1" + str;
		
		// Continue traversal after the position of
		// first '1'
		for (int k = i-1 ; k >= 0; k--)
		{
			//Just flip the values
			if (str.charAt(k) == '1')
				str.replace(k, k+1, "0");
			else
				str.replace(k, k+1, "1");
		}
		
		// return the modified string
		return str.toString();
	}
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("00000101");
		System.out.println(findTwoscomplement(str));
	}
}
