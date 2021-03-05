package com.tellyouiam.problem.copy.nested;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws JsonProcessingException, InvocationTargetException,
			IllegalAccessException {
		User user = new User();
		user.setName("logbasex");
		Address address = new Address();
		address.setCity("HN");
		address.setPostCode(123);
		user.setAddress(address);
		
		ObjectWriter objectWriter = new ObjectMapper().writerWithDefaultPrettyPrinter();
//		System.out.println(objectWriter
//				.writeValueAsString(user));
		
		
		//BeanUtils copy nested properties
		ExtendUser extendUser = new ExtendUser();
		BeanUtils.copyProperties(extendUser, user);
		System.out.println(objectWriter.writeValueAsString(extendUser));
		
		List<Object> collect = Stream.of(null, null, null)
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
		System.out.println(collect);
	}
}
