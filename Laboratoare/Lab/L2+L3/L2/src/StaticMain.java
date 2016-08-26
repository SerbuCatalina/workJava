/**
 * Created by catalina.serbu on 6/27/2016.
 */
public class StaticMain {
    public static void main(String[] args){
        StaticExample se1 = new StaticExample("example1");
        StaticExample se2 = new StaticExample("example2");
        StaticExample.setExampleId(3);

        System.out.println(se1.getExampleId());
        System.out.println(se2.getExampleId());


    }
}
