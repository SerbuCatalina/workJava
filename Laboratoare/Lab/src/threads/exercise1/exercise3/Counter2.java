package src.threads.exercise1.exercise3;

/**
 * Created by catalina.serbu on 10/27/2016.
 */
public class Counter2 extends Thread {
    public Counter2(String name) {
        super(name);
    }

    public void run(){
        synchronized (this) {
            long startTime = System.nanoTime();
            for (int i = 101; i < 200; i++) {
                System.out.println(getName() + " i = " + i);
                notify();
                try {
                    wait((int) 2000);
                    //Thread.sleep((int) (2000));
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
