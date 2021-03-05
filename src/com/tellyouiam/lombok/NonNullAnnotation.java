package com.tellyouiam.lombok;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class NonNullAnnotation {
	@NonNull
	private String name;
	
//	public static void test(@NonNull User user) {
////		if (name == null) {
////			throw new NullPointerException("name is marked non-null but is null");
////		}
//		System.out.println(user);
//	}
//
//	public static void main(String[] args) {
//		User user = User.builder()
//				.age(50)
//				.firstName("logbasex")
//				.build();
//
//		System.out.println(user.toString());
//		test(null);
//	}
}
