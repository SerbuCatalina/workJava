package src.threads.exercise1.exercise3;

/**
 * Created by catalina.serbu on 10/27/2016.
 */



public class CounterMain {


    public static void main(String args[]) {

       ThreadClass t1 = new ThreadClass("thread1");
        ThreadClass t2 = new ThreadClass("thread2");
        t1.start();
        t2.start();

    }
}
