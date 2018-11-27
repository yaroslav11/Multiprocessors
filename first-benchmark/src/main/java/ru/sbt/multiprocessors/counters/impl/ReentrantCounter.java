package ru.sbt.multiprocessors.counters.impl;

import ru.sbt.multiprocessors.counters.Counter;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantCounter implements Counter {
    private ReentrantLock reentrantLock = new ReentrantLock();

    private int counter = 1;

    @Override
    public int getCounter() {
        try {
            reentrantLock.lock();
            return (counter++);
        } finally {
            reentrantLock.unlock();
        }
    }
}
