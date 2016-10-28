package robot.machine;

/**
 * Created by catalina.serbu on 8/19/2016.
 */
public class Robot {
    Engine robotEngine;
    Item robotObject;

    public Robot(){
        robotEngine = new Engine();
        robotObject = new Item(0,0);
    }

    //added
    public Robot(Engine robotEngine, Item robotObject) {
        this.robotEngine = robotEngine;
        this.robotObject = robotObject;
    }

    //moving robot
    public void moveRobot(int x, int y){
        robotEngine.step(x,y);
    }

    public void setObjectName(String name) {
        this.robotObject.setObjectName(name);
    }

    //added for moving object
    public void moveRobotObject(int x,int y) {
        this.robotObject.step(x,y);
    }

}

