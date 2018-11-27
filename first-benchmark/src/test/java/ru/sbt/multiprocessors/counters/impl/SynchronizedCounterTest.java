package ru.sbt.multiprocessors.counters.impl;

import ru.sbt.multiprocessors.counters.GeneralCounterTest;

class SynchronizedCounterTest extends GeneralCounterTest {

    public SynchronizedCounterTest() {
        super(new SynchronizedCounter());
    }
}