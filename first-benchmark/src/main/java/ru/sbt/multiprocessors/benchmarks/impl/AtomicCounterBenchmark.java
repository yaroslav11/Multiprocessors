package ru.sbt.multiprocessors.benchmarks.impl;

import ru.sbt.multiprocessors.benchmarks.GeneralBenchmark;
import ru.sbt.multiprocessors.counters.impl.AtomicCounter;

public class AtomicCounterBenchmark extends GeneralBenchmark {
    public AtomicCounterBenchmark() {
        super(new AtomicCounter());
    }

}
