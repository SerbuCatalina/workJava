package src.threads.exercise1.exercise4;

import java.util.Random;

/**
 * Created by catalina.serbu on 10/28/2016.
 */
public class RobotMove extends Thread {

    private Table t;
    public RobotMove(String name,Table t) {
        super(name);
        this.t = t;
    }

    public RobotMove(ThreadGroup group, String name) {
        super(group, name);
    }


    public void run(){
        Robot r = new Robot(this.getName(),0,0);

        for(int i=0;i<20;i++){

            r.move(t);
            System.out.println(this.getId()+" is moving to:("+r.getCoord().getX()+","+r.getCoord().getY()+")");

            try {
                sleep((int)100);
            }catch( InterruptedException ie){
                ie.printStackTrace();
            }

        }



    }
}
