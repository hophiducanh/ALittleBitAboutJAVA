package com.tellyouiam.java8inaction.statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnStatementLamdaExpression {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>() {{
			add(new User(1, "A", 1));
			add(new User(2, "B", 2));
			add(new User(3, "C", 5));
			add(new User(6, "D", 6));
		}};
		
		List<Integer> result =  users.stream().map(a -> {
			if (a.getId() < 5) {
				System.out.println("Id < 5");
				return 5;
			} else {
				System.out.println("Id > 5");
				return a.getId();
			}
		}).collect(Collectors.toList());
		
		int[] ls = result.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(ls));
	}
}
