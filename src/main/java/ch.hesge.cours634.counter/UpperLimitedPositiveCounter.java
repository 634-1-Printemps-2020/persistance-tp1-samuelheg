package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int v, int max){
        super(v);
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        checkMax(1);
        super.inc();

    }

    @Override
    public void add(int step) throws CounterException {
        checkMax(step);
        checkPositive(getValue());
        super.add(step);
    }

    private void checkPositive(int step) throws CounterException {
        if (getValue()+step<0) {
            throw new CounterException("counter can not be negative");
        }
    }

    private void checkMax(int i) throws CounterException {
        if (max < getValue() + i) {
            throw new CounterException("counter can not exceed max value " + max);
        }
    }

    @Override
    public String toString() {
        return "UpperLimitedPositiveCounter{" +
                "value=" + getValue() +
                "max=" + max +
                '}';
    }


}
