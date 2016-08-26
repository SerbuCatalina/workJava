package polimorfism.birdcontrollerex1.birdcontrollerex2;

import polimorfism.birdcontrollerex1.Bird;

public class Goose extends AbstractBird{
    public void move(){
        System.out.println("The NONABSTRACT_GOOSE is flying.");
    }
}
