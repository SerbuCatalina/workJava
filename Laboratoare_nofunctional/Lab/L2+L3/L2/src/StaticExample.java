/**
 * Created by catalina.serbu on 6/27/2016.
 */
public class StaticExample {

    private String name;
    private static int EXAMPLE_ID;

    public StaticExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getExampleId() {
        return EXAMPLE_ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setExampleId(int exampleId) {
        EXAMPLE_ID = exampleId;
    }
}
