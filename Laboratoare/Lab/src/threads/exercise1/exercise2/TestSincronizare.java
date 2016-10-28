package src.threads.exercise1.exercise2;

/**
 * Created by catalina.serbu on 10/26/2016.
 */
public class TestSincronizare {
    public static void main(String[] args) {
        Punct p = new Punct();
        FirSet fs1 = new FirSet(p);
        FirGet fg1 = new FirGet(p);

        fs1.start();
        fg1.start();
    }
}
