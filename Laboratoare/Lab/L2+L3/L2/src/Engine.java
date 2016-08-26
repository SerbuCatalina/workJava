/**
 * Created by catalina.serbu on 6/13/2016.
 */
public class Engine {

    String fuellType;
    long capacity;
    boolean active;
    long age;

    Engine(int capacity, boolean active) {
        this.capacity = capacity;
        this.active = active;
    }

    /*old constructor
    Engine(int capacity, boolean active, String fuellType) {
        this(capacity, active);
        this.fuellType = fuellType;
    }

    Engine() {
        this(2000, false, "diesel");
    }*/

    public Engine() {
        this("diesel",2000,false,3);
    }

    public Engine(String fuellType, long capacity, boolean active, long age) {
        this.fuellType = fuellType;
        this.capacity = capacity;
        this.active = active;
        this.age = age;
    }


    void print() {
        System.out.println("Engine: capacity=" + this.capacity + " fuell=" + fuellType + " active=" + active + " age=" + age);
    }

    public static void main(String[] args) {
        Engine tdi = new Engine();
        Engine i16 = new Engine("petrol",1600, false,4);
        Engine d30 = new Engine("diesel",3000, true,10);
        tdi.print();
        i16.print();
        d30.print();
    }
}
