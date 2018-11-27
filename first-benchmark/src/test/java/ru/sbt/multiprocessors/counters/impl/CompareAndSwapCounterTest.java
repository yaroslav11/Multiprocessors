package ru.sbt.multiprocessors.counters.impl;

import ru.sbt.multiprocessors.counters.GeneralCounterTest;

class CompareAndSwapCounterTest extends GeneralCounterTest {
    public CompareAndSwapCounterTest() {
        super(new CompareAndSwapCounter());
    }

}