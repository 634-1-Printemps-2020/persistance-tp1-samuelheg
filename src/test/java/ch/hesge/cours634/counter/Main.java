package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args)throws CounterException{
        testCounter();
        testUpperLimitedPositiveCounter();

    }

    private static void testUpperLimitedPositiveCounter() {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 5);
        try{
            counter.add(10);
            System.out.println("BUG");
        }catch(CounterException e){
            System.out.println("ok");
        }
    }

    private static void testCounter() throws CounterException{
        Counter counter;
        //test constructeur
        counter = new Counter();
        if(counter.getValue()!=0){
            throw new IllegalArgumentException("test constructeur failed, expected value 0 ....");
        }

        counter = new Counter(9);
        if(counter.getValue()!=9){
            throw new IllegalArgumentException("test constructeur failed, expected value 9 ....");
        }
        //test inc
        counter = new Counter();
        counter.inc();
        if(counter.getValue() != 1){
            throw new IllegalArgumentException("test inc failed, expected value 1 ...");
        }
        //test add
        counter = new Counter();
        counter.add(5);
        if(counter.getValue() != 5){
            throw new IllegalArgumentException("test inc failed, expected value 5 ...");
        }
    }
}
