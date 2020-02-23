package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int v;

    public Counter() {
        this.v = 0;
    }

    public Counter(int v) {
        this.v = v;
    }

    @Override
    public void inc() throws CounterException {
        this.v ++;
    }

    @Override
    public void add(int step) throws CounterException {
        this.v += step;
    }

    @Override
    public int getValue() {
        return v;
    }
}
