package com.tellyouiam.character;

public class Surrogate {
	/**
	 * https://www.javaworld.com/article/3067393/when-is-a-character-not-a-character.html
	 * https://stackoverflow.com/questions/5903008/what-is-a-surrogate-pair-in-java
	 * https://stackoverflow.com/questions/40184882/why-were-the-code-points-in-the-range-of-ud800-to-udfff-removed-from-the-unico
	 * */
	public static void main(String[] args) {
		//https://developers.redhat.com/blog/2019/08/16/manipulating-emojis-in-java-or-what-is-%F0%9F%90%BB-1/
		int[] surrogates = {0xD83D, 0xDC7D};
		String alienEmojiString = new String(surrogates, 0, surrogates.length);
		System.out.println(alienEmojiString);
		System.out.println("\uD83D\uDC7D");
		
		String bear = "🐻";
		
		// If the previous line doesn't show up in your editor,
		// you can comment it out and use this declaration instead:
		// String bear = "\ud83d\udc3b";
		
		int bearCodepoint = bear.codePointAt(bear.offsetByCodePoints(0, 0));
		int mysteryAnimalCodepoint = bearCodepoint + 1;
		
		char mysteryAnimal[] = {Character.highSurrogate(mysteryAnimalCodepoint),
				Character.lowSurrogate(mysteryAnimalCodepoint)};
		System.out.println("The Coderland Zoo's latest attraction: "
				+ String.valueOf(mysteryAnimal));

		//https://www.javaworld.com/article/3067393/when-is-a-character-not-a-character.html
		byte i = (byte) + (short) + (double) 2000;
		System.out.println(i);
	}
}
