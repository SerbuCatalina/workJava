package src.threads.exercise1.exercise3;

/**
 * Created by catalina.serbu on 10/27/2016.
 */
public class ThreadClass extends Thread{

    static int x = 0;
    public ThreadClass(String name) {
        super(name);
    }

    public void run(){
        test1();
    }
    public void test1(){
        for(int i=0;i<100;i++){
            x++;
            System.out.println(this.getName()+": x="+x);
        }
    }
}
