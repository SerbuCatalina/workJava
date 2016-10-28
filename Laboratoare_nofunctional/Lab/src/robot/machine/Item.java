package robot.machine;

/**
 * Created by catalina.serbu on 8/22/2016.
 */
public class Item {
    int x;
    int y;

    String objectName;
    public Item(int x, int y) {
        this.x = x;
        this.y = y;
        this.objectName = "genericObject";
    }

    public Item(int x, int y, String objectName) {
        this.x = x;
        this.y = y;
        this.objectName = objectName;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectName() {

        return objectName;
    }

    public void step(int x,int y) {
        start();
        this.checkDirection(x,y);
        this.x += x;
        this.y += y;
        execute(x,y);
        stop();
    }

    private void start(){
        System.out.println("Start moving "+this.objectName+".");
    }
    private void stop(){
        System.out.println("Stop moving "+this.objectName+".");
    }

    private void checkDirection(int x,int y){
        if(x<0 && y<0)
            System.out.println("Moving object to the S-W.");
        else if(x<0 && y==0)
            System.out.println("Moving object to the W.");
        else if(x<0 && y>0)
            System.out.println("Moving object to N-W.");
        else if(x==0 && y>0)
            System.out.println("Moving object to N.");
        else if(x>0 && y>0)
            System.out.println("Moving object to N-E.");
        else if(x>0 && y==0)
            System.out.println("Moving object to E.");
        else if(x>0 && y<0)
            System.out.println("Moving object to S-E.");
    }

    private void execute(int x,int y){
        System.out.println("Moving "+Math.sqrt(x*x+y*y) +" steps.");
    }
}
