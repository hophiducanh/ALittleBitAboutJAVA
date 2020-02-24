package com.tellyouiam.regex.performance;

public class RegexPerformanceTest {
	public static void main(String[] args) {
		String str = getString();
		for (int i = 0; i < 3; i++) {
			TimerHelper.runTask("regex replace",
					() -> {
						String result = str.replaceAll("\\n+", " ");
						// System.out.println(result);
					});
			TimerHelper.runTask("manual replace",
					() -> {
						String result = manualReplace(str, "\n", " ");
						//System.out.println(result);
					});
			System.out.println("-----");
		}
	}
	
	private static String getString() {
		StringBuilder rv = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			rv.append("test string \n ends.. ");
		}
		return "'" + rv + "'";
	}
	
	private static String manualReplace(String input, String toReplace, String replaceWith) {
		int i = input.indexOf(toReplace);
		while (i != -1) {
			input = input.substring(0, i) + replaceWith + input.substring(i + toReplace.length());
			i = input.indexOf(toReplace, i + replaceWith.length());
		}
		return input;
	}
}
