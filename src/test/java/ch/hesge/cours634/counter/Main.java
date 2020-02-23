package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {
        Counter counter1 = new Counter();
        UpperLimitedPositiveCounter counter2 = new UpperLimitedPositiveCounter(1,5);

        //TEST QUI RETOURNENT PAS D'ERREUR
        counter1.inc();
        counter1.add(5);
        System.out.println("counter1 doit retourner 6 et il retourne la valeur : " + counter1.getValue());
        counter2.inc();
        counter2.add(2);
        System.out.println("counter2 doit retourner 4 et il retourne la valeur : " + counter2.getValue());
        //TEST QUI RETOURNENT DES ERREURS
        counter2.add(5);
        UpperLimitedPositiveCounter counter3 = new UpperLimitedPositiveCounter(4,5);
        counter2.inc();
        UpperLimitedPositiveCounter counter4 = new UpperLimitedPositiveCounter(0,1);
        UpperLimitedPositiveCounter counter5 = new UpperLimitedPositiveCounter(3,2);
    }
}
