package Lab.src.threads.exercise1;

/**
 * Created by catalina.serbu on 10/25/2016.
 */
public class CounterMain {
    public static void main(String[] args) {
        Counter c1 = new Counter("counter1");
        Counter c2 = new Counter("counter2");
        Counter c3 = new Counter("counter3");

        c1.start();
        c2.start();
        c3.start();
    }
}
