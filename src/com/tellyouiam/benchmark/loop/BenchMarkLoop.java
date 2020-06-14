package com.tellyouiam.benchmark.loop;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xms2G"})
//@Warmup(iterations = 3)
//@Measurement(iterations = 8)
public class BenchMarkLoop {

	@Param({"10_000_000"})
	private int N;
	
	private List<String> DATA_FOR_TESTING;
	
	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
				.include(BenchMarkLoop.class.getSimpleName())
				.forks(1)
				.build();
		
		new Runner(opt).run();
	}
	
	@Benchmark
	public void loopWhile(Blackhole bh) {
		int i = 0;
		while (i < DATA_FOR_TESTING.size()) {
			String s = DATA_FOR_TESTING.get(i);
			bh.consume(s);
			i++;
		}
	}
	
	@Benchmark
	public void loopForEach(Blackhole bh) {
		for (String s : DATA_FOR_TESTING) {
			bh.consume(s);
		}
	}
	
	@Benchmark
	public void loopIterator(Blackhole bh) {
		Iterator<String> iterator = DATA_FOR_TESTING.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			bh.consume(s);
		}
	}
	
	private List<String> createData() {
		List<String> data = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			data.add("Number : " + i);
		}
		return data;
	}
}
