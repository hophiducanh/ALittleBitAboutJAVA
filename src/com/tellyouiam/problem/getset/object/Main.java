package com.tellyouiam.problem.getset.object;

/**
 * @author : Ho Anh
 * @since : 09/10/2019, Wed
 **/
public class Main {
	public static void main(String[] args) {
		HorseBonusScheme horseBonusScheme = new HorseBonusScheme(1, new Horse(1, 314, "avatar", true));
		Horse horse = new Horse(2, 314159, "spider", false);
		horseBonusScheme.setHorse(horse);
		System.out.println(horseBonusScheme.getHorse()); //After set all value in initial HorseBonusScheme change to new Horse data.
	}
}
