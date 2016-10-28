package shapes;

/**
 * Created by catalina.serbu on 8/18/2016.
 */
public class Flower {
    int petal;
    static int INSTANCE_NO = 0;

    Flower() {
        INSTANCE_NO++;
        System.out.println("shapes.Flower has been created!");
    }

    public static void showInstancesNo()
    {
        System.out.println("Number of flowers is "+INSTANCE_NO);
    }



    public static void main(String[] args) {
        Flower f1 = new Flower();
        Flower f2 = new Flower();
        Flower f3 = new Flower();
        Flower.showInstancesNo();

    }
}

