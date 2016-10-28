package src.threads.exercise1.exercise4;

import java.util.Random;

/**
 * Created by catalina.serbu on 10/28/2016.
 */
public class Table {

    private int table[][] = new int[300][300];

    public Table() {

        for(int i=0;i<300;i++){
            for(int j=0;j<300;j++){
                table[i][j] = 0;
            }
        }
    }

    public synchronized boolean isEmpty(Point p){
        boolean retunredValue = false;
        if(table[p.getX()][p.getY()] == 0){
            retunredValue = true;
        }
        return retunredValue;
    }

    public synchronized void setEmpty(boolean value,Point p){
        if(value == true) {
            table[p.getX()][p.getY()] = 0;
        }else{
            table[p.getX()][p.getY()] = 1;
        }
    }



}
