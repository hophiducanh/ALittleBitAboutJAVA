package com.tellyouiam.string.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class SplitStringByBalancedParenthesis {
	public static void main(String[] args) {
		String s = "Foxwedge/Here De Speaker 16 (Foxwedge - Here De Speaker) 3yo Bay Colt    Michael Hickmott Bloodstock - In training Michael Hickmott Bloodstock 15/01/2020";
		int n = s.length();
		int[] end = new int[n];
		Stack<Integer> stack = new Stack<>();
		List<Character> leftChars = new ArrayList<>();
		List<Character> rightChars = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else if (s.charAt(i) == ')') {
				int start = stack.pop();
				end[start] = i;
			} else if (stack.isEmpty()) {
				leftChars.add(s.charAt(i));
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
				
				for (int j = i; j <= end[i]; j++) {
					rightChars.add(s.charAt(j));
				}
				rightChars.add('\n');
			}
		}
		
		String left = leftChars.stream().map(Object::toString).collect(Collectors.joining());
		String right = rightChars.stream().map(Object::toString).collect(Collectors.joining());
		System.out.println(left);
		System.out.println(right);
	}
}
