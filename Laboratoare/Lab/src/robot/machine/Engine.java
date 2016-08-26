package robot.machine;

/**
 * Created by catalina.serbu on 8/19/2016.
 */
class Engine {


    //moving Robot
    void step(int x,int y) {
        start();
        checkDirection(x,y);
        execute(x,y);
        stop();
    }


    private void start(){
        System.out.println("Start engine.");
    }
    private void stop(){
        System.out.println("Stop engine.");
    }

    private void checkDirection(int x,int y){
        if(x<0 && y<0)
            System.out.println("Moving to the S-W.");
        else if(x<0 && y==0)
            System.out.println("Moving to the W.");
        else if(x<0 && y>0)
            System.out.println("Moving to N-W.");
        else if(x==0 && y>0)
            System.out.println("Moving to N.");
        else if(x>0 && y>0)
            System.out.println("Moving to N-E.");
        else if(x>0 && y==0)
            System.out.println("Moving to E.");
        else if(x>0 && y<0)
            System.out.println("Moving to S-E.");
    }

    private void execute(int x,int y){
        System.out.println("Moving "+Math.sqrt(x*x+y*y) +" steps.");
    }

}
