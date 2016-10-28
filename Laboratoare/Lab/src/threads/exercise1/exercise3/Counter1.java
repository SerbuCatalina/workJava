package src.threads.exercise1.exercise3;

/**
 * Created by catalina.serbu on 10/27/2016.
 */
public class Counter1 extends Thread {

    public Counter1(String name) {
        super(name);
    }

    public void run() {
        synchronized (this) {
            long startTime = System.nanoTime();
            for (int i = 0; i < 101; i++) {
                System.out.println(getName() + " i = " + i);
                notify();

                try {
                    wait((int)1000);
                    //Thread.sleep((int)1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            long time = System.nanoTime() - startTime;
            System.out.println(getName() + " job finalised.");
            System.out.println("My thread " + this.getId() + " execution time: " + time + " ns");
        }
    }


}
