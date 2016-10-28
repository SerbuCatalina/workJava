package src.threads.exercise1.exercise4;

import src.threads.exercise1.exceptions.CoordinatesException;

import java.util.Random;

/**
 * Created by catalina.serbu on 10/27/2016.
 */
public class Robot extends Thread{

    private int lenght = 300;
    private Point coord;

    public Robot(String name,int x,int y) {
        super(name);
        coord = new Point(x,y);
    }

    private synchronized Point getDirection() {
        Point directions[] = {new Point(-1,0),new Point(0,1),new Point(1,0),new Point(0,-1)};
        int randomIndex = new Random().nextInt(directions.length);

        return directions[randomIndex];
    }

    public void run(){

        for(int i=0;i<20;i++) {
            Point direction = getDirection();
            int newX = coord.getX()+direction.getX();
            int newY = coord.getY()+direction.getY();

            while(( newX < 0 || newX > lenght) || (newY < 0 || newY > lenght) ){
                direction = getDirection();
                newX = coord.getX()+direction.getX();
                newY = coord.getY()+direction.getY();
            }
            coord.setX(newX);
            coord.setY(newY);
            System.out.println(this.getId()+" is movint to:("+newX+","+newY+")");

            try {
                Thread.sleep((int)1000);
            }catch( InterruptedException ie){
                ie.printStackTrace();
            }
        }

    }
}
