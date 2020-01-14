package com.tellyouiam.finalkeyword;

public class PassFinalParamToMethod {
	void doSomething( final String arg ) {  // Mark argument as 'final'.
		String x = arg;
		x = "elephant";
		//arg = "giraffe";  // Compiler error: The passed argument variable arg cannot be re-assigned to another object.
	}
	
	void finalTest(final StringBuilder stringBuilder) {
		stringBuilder.append("x");
		//stringBuilder = new StringBuilder().append("x");
	}
	public static void main(String[] args) {
		final StringBuilder b = new StringBuilder();
		b.append("s");
		
		final String s = "";
		s.replace("a", "b");
		
		String a = "a";
	}
}
