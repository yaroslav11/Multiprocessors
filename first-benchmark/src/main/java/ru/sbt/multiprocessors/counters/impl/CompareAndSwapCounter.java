package ru.sbt.multiprocessors.counters.impl;

import ru.sbt.multiprocessors.counters.Counter;

import java.util.concurrent.atomic.AtomicInteger;

public class CompareAndSwapCounter implements Counter {
    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public int getCounter() {
        while(true) {
            int tmp = counter.get();
            int newTmp = tmp + 1;
            if(counter.compareAndSet(tmp, newTmp)) {
                return counter.intValue();
            }
        }
    }
}
