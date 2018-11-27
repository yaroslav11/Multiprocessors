package ru.sbt.multiprocessors.benchmarks.impl;

import ru.sbt.multiprocessors.benchmarks.GeneralBenchmark;
import ru.sbt.multiprocessors.counters.impl.AtomicCounter;
import ru.sbt.multiprocessors.counters.impl.CompareAndSwapCounter;

public class CompareAndSwapCounterBenchmark extends GeneralBenchmark {
    public CompareAndSwapCounterBenchmark() {
        super(new CompareAndSwapCounter());
    }

}
