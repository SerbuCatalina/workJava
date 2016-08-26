package polimorfism.birdcontrollerex1.birdcontrollerex3;

public class BirdController {
    IBird[] birds = new IBird[3];

    BirdController(){

        //upcasting
        birds[0] = createBird();
        birds[1] = createBird();
        birds[2] = createBird();
    }
    public void relocateBirds(){
        for(int i=0;i<birds.length;i++)
            birds[i].move();
    }

    private IBird createBird(){
        int i = (int)(Math.random()*10);
        if(i<3)
            return new Penguin();
        else if(i<6)
            return new Goose();
        else
            return new Turkey();
    }

    public static void main(String [] args){
        BirdController bc = new BirdController();
        bc.relocateBirds();
    }
}
