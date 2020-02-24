package com.tellyouiam.regex.performance;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class TimerHelper {
	public static void runTask (String msg, Runnable task) {
		long startTime = getTimeElapsed(0);
		task.run();
		System.out.printf("%s time taken: %s%n", msg, timeToString(getTimeElapsed(startTime)));
	}
	
	private static long getTimeElapsed(long startTime) {
		return System.nanoTime() - startTime;
	}
	
	public static String timeToString(long nanos) {
		Optional<TimeUnit> first = Stream.of(TimeUnit.DAYS, TimeUnit.HOURS, TimeUnit.MINUTES, TimeUnit.SECONDS, TimeUnit.MILLISECONDS,
				TimeUnit.MICROSECONDS).filter(u -> u.convert(nanos, TimeUnit.NANOSECONDS) > 0)
				.findFirst();
		TimeUnit unit = first.orElse(TimeUnit.NANOSECONDS);
		double value = (double) nanos / TimeUnit.NANOSECONDS.convert(1, unit);
		return String.format("%.4g %s", value, unit.name().toLowerCase());
	}
}

