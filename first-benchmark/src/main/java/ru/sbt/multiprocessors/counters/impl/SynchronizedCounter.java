package ru.sbt.multiprocessors.counters.impl;

import ru.sbt.multiprocessors.counters.Counter;

public class SynchronizedCounter implements Counter {

    private volatile int counter = 1;

    @Override
    public synchronized int getCounter() {
        return counter++;
    }
}
