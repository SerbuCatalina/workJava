package polimorfism.birdcontrollerex1.upcastex4;


import constructorusage.*;

public class UpcastExample {

    public static void main(String[] args){
        BaseClass dc = new DerivedClass();

        dc.method1();
        //dc detine referinta catre un obiect de tipul DerivedClass; datorita polimorfismului , in momentul apelului method2 din method1
        //JVM recunoaste metoda suprascrisa din clasa derivata si o apeleaza corespunzator pe aceasta
    }
}
