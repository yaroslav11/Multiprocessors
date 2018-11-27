package ru.sbt.multiprocessors.counters.impl;

import ru.sbt.multiprocessors.counters.GeneralCounterTest;

class ReentrantCounterTest extends GeneralCounterTest {

    public ReentrantCounterTest() {
        super(new ReentrantCounter());
    }
}