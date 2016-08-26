package polimorfism.birdcontrollerex1.upcastex4;

public class BaseClass {

    public BaseClass() {
    }

    public void method1(){
        System.out.println("BaseClass-method1");
        method2();
    }
    public void method2(){
        System.out.println("BaseClass-method2");
    }
}
