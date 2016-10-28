package src.threads.exercise1.exercise4;

import java.util.Random;

/**
 * Created by catalina.serbu on 10/28/2016.
 */
public class RobotMain {

    public static void main(String args[]){

        Robot r1 = new Robot("robot1",0,0);
        Robot r2 = new Robot("robot2",0,0);
        Robot r3 = new Robot("robot3",0,0);
        Robot r4 = new Robot("robot4",0,0);

        for(int i=0;i<30;i++) {
            int nr1 = new Random().nextInt(4);
            int nr2 = new Random().nextInt(4);
            System.out.println("("+nr1+","+nr2+")");
        }
       /* r1.start();
        r2.start();
        r3.start();
        r4.start();*/
    }
}
