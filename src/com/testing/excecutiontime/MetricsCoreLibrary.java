package com.testing.excecutiontime;

import com.codahale.metrics.annotation.Timed;
import io.astefanutti.metrics.aspectj.Metrics;

@Metrics(registry = "objectRunnerRegistryName")
public class MetricsCoreLibrary {
	
	@Timed
	public static void hello() {
		String a = "";
		for (int i = 0; i < 100000; i++) {
			i = i + 1;
			a = String.valueOf(i);
		}
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
	
	}
}
