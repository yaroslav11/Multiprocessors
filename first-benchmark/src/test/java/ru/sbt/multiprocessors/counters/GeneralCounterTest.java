package ru.sbt.multiprocessors.counters;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public abstract class GeneralCounterTest {
    private Counter counter;

    public GeneralCounterTest(Counter counter) {
        this.counter = counter;
    }

    @Test
    void getCounter() {
        ExecutorService service = Executors.newFixedThreadPool(2);

        IntStream.range(0, 5)
                .forEach(i -> service.submit(
                        () -> System.out.println(
                                "I'm " + Thread.currentThread().getName() + " got " + counter.getCounter())
                ));

        service.shutdown();
    }
}
