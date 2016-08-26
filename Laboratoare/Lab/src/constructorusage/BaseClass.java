package constructorusage;

/**
 * Created by catalina.serbu on 8/23/2016.
 */
public class BaseClass {
    private int field;

    /*public BaseClass(int field) {
        System.out.println("BaseClass contructor");
        this.field = field;
    }*/

    public BaseClass() {
        System.out.println("BaseClass implicit contructor");
    }
}
