package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int v;
    private int max;

    public UpperLimitedPositiveCounter(int v, int max) throws CounterException {

        if(max<v || v<0){
            throw new CounterException();
        }else{
            this.v = v;
            this.max = max;
        }
    }

    @Override
    public void inc() throws CounterException {
        if(max>this.v+1){
            this.v++;
        }else{
            throw new CounterException();
        }
    }

    @Override
    public void add(int step) throws CounterException {
        if(max>this.v+step){
            this.v+=step;
        }else{
            throw new CounterException();
        }
    }

    @Override
    public int getValue() {
        return this.v;
    }
}
