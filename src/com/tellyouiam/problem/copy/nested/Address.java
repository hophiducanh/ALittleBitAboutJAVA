package com.tellyouiam.problem.copy.nested;

import lombok.Data;

@Data
public class Address {
	private Integer postCode;
	private String city;
	
	public Integer getPostCode() {
		return postCode;
	}
	
	public void setPostCode(Integer postCode) {
		this.postCode = postCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
}
