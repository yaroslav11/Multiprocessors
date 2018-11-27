package ru.sbt.multiprocessors.benchmarks;

import org.openjdk.jmh.annotations.*;
import ru.sbt.multiprocessors.counters.Counter;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@State(Scope.Benchmark)
@BenchmarkMode({Mode.Throughput, Mode.AverageTime})
@OutputTimeUnit(TimeUnit.SECONDS)
public abstract class GeneralBenchmark {
    private static final int NUMBER_OF_REPEATS = 1000;
    private Counter counter;

    public GeneralBenchmark(Counter counter) {
        this.counter = counter;
    }

    private void theMethod() throws InterruptedException {
        IntStream.range(0, NUMBER_OF_REPEATS).forEach(i -> counter.getCounter());
    }

    @Benchmark
    @Threads(1)
    public void testMethod1() throws InterruptedException {
        theMethod();
    }

    @Benchmark
    @Threads(2)
    public void testMethod2() throws InterruptedException {
        theMethod();
    }

    @Benchmark
    @Threads(4)
    public void testMethod4() throws InterruptedException {
        theMethod();
    }

    @Benchmark
    @Threads(8)
    public void testMethod8() throws InterruptedException {
        theMethod();
    }

    @Benchmark
    @Threads(16)
    public void testMethod16() throws InterruptedException {
        theMethod();
    }
}
