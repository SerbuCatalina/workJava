package src.threads.exercise1;

/**
 * Created by catalina.serbu on 10/26/2016.
 */
public class CounterMain {
    public static void main(String[] args) {
        Counter c1 = new Counter("counter1");
        Counter c2 = new Counter("counter2");
        Counter c3 = new Counter("counter3");

        //gresit:nu se obtine paralelism, ci se va executa metoda run pentru fiecare obiect pe rand
        //c1.run();
        //c2.run();
        //c3.run();
        //se foloseste metoda start(moştenită clasa Thread) pentru ca este responsabilă cu iniţializarea tuturor mecanismelor necesare pentru a putea executa un fir de execuţie,
        // după care va apela automat metoda run().
        c1.start();
        c2.start();
        c3.start();
    }
}
