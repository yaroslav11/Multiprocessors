package ru.sbt.multiprocessors.counters.impl;

import ru.sbt.multiprocessors.counters.Counter;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter implements Counter {

    private AtomicInteger counter = new AtomicInteger(1);

    @Override
    public int getCounter() {
        return counter.getAndIncrement();
    }
}
