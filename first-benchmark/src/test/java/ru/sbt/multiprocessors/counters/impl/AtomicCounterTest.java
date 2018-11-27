package ru.sbt.multiprocessors.counters.impl;

import ru.sbt.multiprocessors.counters.GeneralCounterTest;

class AtomicCounterTest extends GeneralCounterTest {

    public AtomicCounterTest() {
        super(new AtomicCounter());
    }
}