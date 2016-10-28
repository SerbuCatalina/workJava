package src.threads.exercise1.exercise2;

/**
 * Created by catalina.serbu on 10/26/2016.
 */
class FirGet extends Thread {
    Punct p;

    public FirGet(Punct p){
        this.p = p;
    }

    public void run(){
        int i=0;
        int a,b;
        while(++i<15){
            synchronized(p){
            a= p.getX();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b = p.getY();
            }
            System.out.println("Am citit: ["+a+","+b+"]");
        }
    }
}//.class
