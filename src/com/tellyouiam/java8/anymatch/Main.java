package com.tellyouiam.java8.anymatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : Ho Anh
 * @since : 05/09/2019, Thu
 **/
public class Main {
	public static void main(String[] args) {
		List<MergedTrainerHorse> ls = new ArrayList<>();
		ls.add(new MergedTrainerHorse(1, "Anh"));
		ls.add(new MergedTrainerHorse(2, "Anh"));
		ls.add(new MergedTrainerHorse(3, "Lan"));
		ls.add(new MergedTrainerHorse(4, "Ha"));
		ls.add(new MergedTrainerHorse(5, "Ha"));
		ls.add(new MergedTrainerHorse(6, "Ho"));

//		List<String> allNames = ls.stream().map(MergedTrainerHorse::getName).collect(Collectors.toList());
//		System.out.println(Arrays.toString(new List[]{allNames}));
//		Set<String> namesOfDuplicatedHorses = new HashSet<>();
//		Set<Integer> idsOfHorsesIsLikelyTheSame = new HashSet<>();
//		for (String name : allNames) {
//			boolean addSet = namesOfDuplicatedHorses.add(name);
//			if (!addSet) {
//				namesOfDuplicatedHorses.add(name);
//			}
//		}
//		System.out.println(Arrays.toString(new Set[]{namesOfDuplicatedHorses}));
//		Set<MergedTrainerHorse> duplicatedHorses = ls.stream()
//			.filter(h -> namesOfDuplicatedHorses.stream().anyMatch(namesOfDuplicatedHorse -> namesOfDuplicatedHorse.equals(h.getName()))).collect(Collectors.toSet());
//		for (MergedTrainerHorse mergedTrainerHorse : duplicatedHorses) {
//			System.out.println(mergedTrainerHorse.toString());
//		}

		Map<Integer, String> allNamesAndIds = ls.stream()
			.collect(Collectors
				.toMap(MergedTrainerHorse::getId, MergedTrainerHorse::getName));
		Map<String, List<Integer>> horseLikelyToTheSameList = new HashMap<String,List<Integer>>();

		for(Map.Entry<Integer, String> entry : allNamesAndIds.entrySet()) {
			if(horseLikelyToTheSameList.containsKey(entry.getValue())){
				horseLikelyToTheSameList.get(entry.getValue()).add(entry.getKey());

			}else{
				List<Integer> list = new ArrayList<>();
				list.add(entry.getKey());
				horseLikelyToTheSameList.put(entry.getValue(),list);
			}
		}
//		horseLikelyToTheSameList.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));
		Map<String, List<Integer>> horseHasSameName = horseLikelyToTheSameList.entrySet().stream()
						.filter(h -> !h.getKey().isEmpty())
								.filter(entry -> Math.min(entry.getValue().size(), 2) >1 )
										.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

//		horseHasSameName.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));

		Map<Integer, Integer> idsOfSameNameHorse = horseHasSameName.values().stream().collect(Collectors.toMap(m -> m.get(0), m -> m.get(1)));

		//idsOfSameNameHorse.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));
		
		boolean isExist = ls.stream().anyMatch( t -> t.getName().equalsIgnoreCase("Anh"));
		if (isExist)
			System.out.println("Exist");
		
	}
}
