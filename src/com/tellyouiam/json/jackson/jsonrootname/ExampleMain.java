package com.tellyouiam.json.jackson.jsonrootname;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ExampleMain {
	//https://stackoverflow.com/questions/39597316/is-it-possible-to-get-jsonrootname-of-nested-child-with-jackson
	//@JsonRootName annotation is used to indicate name of the POJO that should be serialized.
	//@JsonRootName allows to have a root node specified over the JSON. We need to enable wrap root value as well.
	//Json root name not work child class in nested.
	public static void main(String[] args) throws JsonProcessingException {
		PersonEntity person = new PersonEntity("Jessie", 35,  new PersonalAddress("HN", "Australia"));
//		System.out.println("-- before serialization --");
//		System.out.println(person);
		
		//---------
		 ObjectMapper mapper = new ObjectMapper()
				.enable(SerializationFeature.WRAP_ROOT_VALUE)
				.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
		 
//		System.out.println("-- after serialization --");
		String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
//		System.out.println(jsonString);
		
		JsonWrapper wrapper = new JsonWrapper();
		wrapper.setPersonEntity(new PersonEntity("Jessie", 35));
		
		wrapper.setAddress(new PersonalAddress("HN", "Australia"));
		
		String jsonInString = mapper.writeValueAsString(wrapper);
		System.out.println(mapper.writeValueAsString(wrapper));
		System.out.println("jsonInString = " + jsonInString);
		
	}
}
