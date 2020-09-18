package com.testing.excecutiontime;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.SharedMetricRegistries;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

//https://www.baeldung.com/timed-metrics-aspectj
public class Main {
	private static final MetricRegistry registry = new MetricRegistry();
	
	public static void main(String[] args) throws InterruptedException {
		startReport();
	}
	
	private static void startReport() {
		SharedMetricRegistries.add("objectRunnerRegistryName", registry);
		
		ConsoleReporter reporter = ConsoleReporter.forRegistry(registry)
				.convertRatesTo(TimeUnit.SECONDS)
				.convertDurationsTo(TimeUnit.MILLISECONDS)
				.outputTo(new PrintStream(System.out))
				.build();
		reporter.start(3, TimeUnit.SECONDS);
	}
}
