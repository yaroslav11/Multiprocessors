package ru.sbt.multiprocessors.benchmarks.impl;

import ru.sbt.multiprocessors.benchmarks.GeneralBenchmark;
import ru.sbt.multiprocessors.counters.impl.ReentrantCounter;

public class ReentrantCounterBenchmark extends GeneralBenchmark {
    public ReentrantCounterBenchmark() {
        super(new ReentrantCounter());
    }

}
