package ru.sbt.multiprocessors.benchmarks;

import ru.sbt.multiprocessors.benchmarks.impl.AtomicCounterBenchmark;
import ru.sbt.multiprocessors.benchmarks.impl.CompareAndSwapCounterBenchmark;
import ru.sbt.multiprocessors.benchmarks.impl.ReentrantCounterBenchmark;
import ru.sbt.multiprocessors.benchmarks.impl.SynchronizedCounterBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int WARMUP_ITERATIONS = 0;
    private static final int MEASUREMENT_ITERATIONS = 1;
    private static final int FORKS = 0;
    private static final List<Class> counters = new ArrayList<>();

    static {
        counters.add(AtomicCounterBenchmark.class);
        counters.add(SynchronizedCounterBenchmark.class);
        counters.add(ReentrantCounterBenchmark.class);
        counters.add(CompareAndSwapCounterBenchmark.class);
    }

    public static void main(String[] args) throws RunnerException {
        OptionsBuilder optionsBuilder = new OptionsBuilder();
        for (Class c : counters) {
            optionsBuilder.include(c.getName());
        }
        optionsBuilder.warmupIterations(WARMUP_ITERATIONS)
                .measurementIterations(MEASUREMENT_ITERATIONS)
                .forks(FORKS);

        new Runner(optionsBuilder.build()).run();
    }
}
