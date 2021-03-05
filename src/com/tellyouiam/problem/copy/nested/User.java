package com.tellyouiam.problem.copy.nested;

import lombok.Data;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@Setter
public class User {
	private String name;
	private Address address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("name", name)
				.append("address", address)
				.toString();
	}
}
