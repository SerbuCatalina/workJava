package constructorusage;

public class DerivedClass extends BaseClass {
    private String name;

    public DerivedClass(){

        //super(0);
        this.name = "generic";
        System.out.println("Implicit DerivedClass constructor");
    }

    public DerivedClass(int field) {
        //super(field);
        System.out.println("Explicit DerivedClass constructor");
    }
}
