package com.tellyouiam.java8inaction.anymatch;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : Ho Anh
 * @since : 05/09/2019, Thu
 **/
public class Main {
	public static void main(String[] args) {
		List<MergedTrainerHorse> mergedTrainerHorseList = new ArrayList<>();
		mergedTrainerHorseList.add(new MergedTrainerHorse(1, "Anh"));
		mergedTrainerHorseList.add(new MergedTrainerHorse(2, "Anh"));
		mergedTrainerHorseList.add(new MergedTrainerHorse(3, "Lan"));
		mergedTrainerHorseList.add(new MergedTrainerHorse(4, "Ha"));
		mergedTrainerHorseList.add(new MergedTrainerHorse(5, "Ha"));
		mergedTrainerHorseList.add(new MergedTrainerHorse(6, "Ho"));

//		List<String> allNames = mergedTrainerHorseList.stream().map(MergedTrainerHorse::getName).collect(Collectors.toList());
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
//		Set<MergedTrainerHorse> duplicatedHorses = mergedTrainerHorseList.stream()
//			.filter(h -> namesOfDuplicatedHorses.stream().anyMatch(namesOfDuplicatedHorse -> namesOfDuplicatedHorse.equals(h.getName()))).collect(Collectors.toSet());
//		for (MergedTrainerHorse mergedTrainerHorse : duplicatedHorses) {
//			System.out.println(mergedTrainerHorse.toString());
//		}

		Map<Integer, String> allNamesAndIds = mergedTrainerHorseList.stream()
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

		idsOfSameNameHorse.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));
	}
}
