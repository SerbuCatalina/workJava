package src.threads.exercise1.exercise4;

import java.util.Random;

/**
 * Created by catalina.serbu on 10/28/2016.
 */
public class RobotMain {

    public static void main(String args[]){


        Table table = new Table();
        RobotMove r1 = new RobotMove("robot1",table);
        RobotMove r2 = new RobotMove("robot2",table);
        RobotMove r3 = new RobotMove("robot3",table);
        RobotMove r4 = new RobotMove("robot4",table);

        r1.start();
        r2.start();
        r3.start();
        r4.start();


    }
}
