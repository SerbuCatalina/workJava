package robot.play;

/**
 * Created by catalina.serbu on 8/19/2016.
 */

import robot.machine.Robot;

public class BattleField {
    Robot r1;
    Robot r2;

    BattleField(){
        r1 = new Robot();
        r2 = new Robot();
    }
    public void play(){
        r1.moveRobot(-3,-4);//S-W
        r1.moveRobot(-1,0);//W
        r1.moveRobot(-3,4);//N-W
        r1.moveRobot(0,1);//N
        r1.moveRobot(3,4);//N-E
        r1.moveRobot(1,0);//E
        r1.moveRobot(3,-4);//S-E
        r1.moveRobot(0,-1);//S

        r2.setObjectName("weapon");
        r2.moveRobotObject(-3,-4);//S-W
        r2.moveRobotObject(-1,0);//W
        r2.moveRobotObject(-3,4);//N-W
        r2.moveRobotObject(0,1);//N
        r2.moveRobotObject(3,4);//N-E
        r2.moveRobotObject(1,0);//E
        r2.moveRobotObject(3,-4);//S-E
        r2.moveRobotObject(0,-1);//S


    }

    public static void main(String[] args){
        BattleField game = new BattleField();
        game.play();
    }
}