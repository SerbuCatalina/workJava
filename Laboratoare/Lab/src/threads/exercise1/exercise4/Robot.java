package src.threads.exercise1.exercise4;

import src.threads.exercise1.exceptions.CoordinatesException;

import java.util.Random;

/**
 * Created by catalina.serbu on 10/27/2016.
 */
public class Robot{

    private String name;
    private int lenght = 300;
    private Point coord;

    public Robot(String name,int x,int y) {
        name = name;
        coord = new Point(x,y);
    }

    public Point generateRandomDirection() {
        Point directions[] = {new Point(-1,0),new Point(0,1),new Point(1,0),new Point(0,-1)};
        int randomIndex = new Random().nextInt(directions.length);

        return directions[randomIndex];
    }


    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Point getCoord() {
        return coord;
    }

    public void setCoord(Point coord) {
        this.coord = coord;
    }

    public void move(Table t){
        synchronized(t) {
            Point direction = generateRandomDirection();
            int newX = coord.getX() + direction.getX();
            int newY = coord.getY() + direction.getY();

            while ((newX < 0 || newX > lenght) || (newY < 0 || newY > lenght) || (t.isEmpty(new Point(newX,newY)) == false)) {

                direction = generateRandomDirection();

                newX = coord.getX() + direction.getX();
                newY = coord.getY() + direction.getY();

            }
            t.setEmpty(true,coord);
            coord.setX(newX);
            coord.setY(newY);
            t.setEmpty(false,coord);
        }
    }

}
