package com.tellyouiam.problem.copy.nested;

import lombok.Data;

@Data
public class ExtendUser extends User {
	private Integer age;
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}
