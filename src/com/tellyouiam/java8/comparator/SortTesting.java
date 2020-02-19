package com.tellyouiam.java8.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTesting {
	public static void main(String[] args) {

		List<Developer> listSalaryDevs = getSalaryDevelopers();
		List<Developer> listAgeDevs = getSalaryDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listSalaryDevs) {
			System.out.println(developer);
		}

		//sort by age
		listSalaryDevs.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("After Sort");
		for (Developer developer : listSalaryDevs) {
			System.out.println(developer);
		}

		Comparator<Developer> salaryComparator = Comparator.comparing(Developer::getSalary);

//		System.out.println("********************************************************************");
//		System.out.println(salaryComparator);
//		listDevs.sort(salaryComparator);

		String joinedName = listSalaryDevs.stream().map(Developer::getName).collect(Collectors.joining(","));
		System.out.println(joinedName);
		ArrayList<Integer> arrL = new ArrayList<Integer>(2);

		// Add elements to ArrayList
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		System.out.println("HASSSSSSSSSSSSSSSSSSSSSSSSHCODE");
		System.out.println("a".hashCode());
		System.out.println("**********************************");
		Developer developer = new Developer();
		System.out.println(developer.getAge());
		System.out.println(developer.getAge());
		System.out.println(developer.getSalary());
		System.out.println(developer.getAge());
		System.out.println(developer.toString());

		System.out.println("***********************************************************NGUUU");
		for (int i = 0; i < listSalaryDevs.size(); i++) {
			System.out.println(listSalaryDevs.get(i).getName());
		}
//		List<Developer> sortedCustomDuplicateOwnerData = listSalaryDevs.stream()
//			.sorted(c -> c.getCustom().contains("salary") ? Comparator.comparing(Developer::getSalary) : Comparator.comparing(Developer::getAge))
//			.collect(Collectors.toList());
	}



	private static List<Developer> getSalaryDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33, "salary"));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20, "salary"));
		result.add(new Developer("jason", new BigDecimal("100000"), 10, "age"));
		result.add(new Developer("iris", new BigDecimal("170000"), 55, "age"));

		return result;

	}

	private static List<Developer> getAgeDevelopers() {
		List<Developer> result = new ArrayList<>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33, "age"));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20, "age"));
		result.add(new Developer("jason", new BigDecimal("100000"), 10, "age"));
		result.add(new Developer("iris", new BigDecimal("170000"), 55, "age"));
		return result;
	}
}
