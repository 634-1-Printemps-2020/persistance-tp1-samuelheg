package ch.hesge.cours634.counter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperLimitedPositiveCounterTest {

    @Test (expected = CounterException.class)
    public void inc() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,0);
        counter.inc();
    }

    @Test (expected = CounterException.class)
    public void add() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,5);
        counter.add(10);
    }
}