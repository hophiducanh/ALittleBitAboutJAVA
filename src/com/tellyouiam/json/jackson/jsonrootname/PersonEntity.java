package com.tellyouiam.json.jackson.jsonrootname;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

//@Getter
//@Setter
@JsonRootName("Person")
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PersonEntity {
	private String name;
	private int age;
	
	@JsonProperty("Address")
	private PersonalAddress personalAddress;
	
	public PersonEntity() {
	}
	
	public PersonEntity(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public PersonEntity(String name, int age, PersonalAddress personalAddress) {
		this.name = name;
		this.age = age;
		this.personalAddress = personalAddress;
	}
	
	@Override
	public String toString() {
		return "PersonEntity{" + "name='" + name + '\'' + ", age=" + age + ", personalAddress=" + personalAddress + '}';
	}
	
}
