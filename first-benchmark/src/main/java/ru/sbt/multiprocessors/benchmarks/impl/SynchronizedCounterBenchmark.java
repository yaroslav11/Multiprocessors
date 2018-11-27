package ru.sbt.multiprocessors.benchmarks.impl;

import ru.sbt.multiprocessors.benchmarks.GeneralBenchmark;
import ru.sbt.multiprocessors.counters.impl.SynchronizedCounter;

public class SynchronizedCounterBenchmark extends GeneralBenchmark {
    public SynchronizedCounterBenchmark() {
        super(new SynchronizedCounter());
    }

}
