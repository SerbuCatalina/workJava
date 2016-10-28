package shapes;

/**
 * Created by catalina.serbu on 8/18/2016.
 */
public class CoffeeTest {

    public static void main(String[] args) {
        CoffeMaker maker1 = new CoffeMaker();

        Coffee[] pachet = new Coffee[10];
        for (int i = 0; i < pachet.length; i++) {
            pachet[i] = maker1.getCofee();
        }

        for (int i = 0; i < pachet.length; i++) {
            pachet[i].drinkCofee();
        }

    }
}

class CoffeMaker{
    CaffeineTank ctank = new CaffeineTank();
    WaterTank wtank = new WaterTank();

    CoffeMaker(){
        System.out.println("New cofee maker created.");
    }



    Coffee getCofee(){
        int w = wtank.getIngredient();
        int c = ctank.getIngredient();
        int temp = (wtank.getTemperature()+ctank.getTemperature())/2;

        return new Coffee(w,c,temp);
    }
}

class  CaffeineTank{
    CaffeineTank(){
        System.out.println("New coffeine tank created.");
    }
    int getIngredient(){
        return (int)(Math.random()*10);
    }
    int getTemperature(){
        return (int)(Math.random()*10);
    }
}

class WaterTank{
    WaterTank(){
        System.out.println("New water tank created.");
    }
    int getIngredient(){
        return (int)(Math.random()*40);
    }

    int getTemperature(){
        return (int)(Math.random()*100);
    }
}

class Coffee {
    int water;
    int caffeine;
    int deliveryTemperature;
    Coffee(int water, int caffeine,int temperature){
        this.water = water;
        this.caffeine= caffeine;
        this.deliveryTemperature = temperature;
    }

    void BoilCoffee()
    {
        if( this.deliveryTemperature < 80)
        {
            System.out.println("The coffee is boilled");
            while(this.deliveryTemperature < 80) {
                this.deliveryTemperature++;
            }
        }
    }
    void drinkCofee(){
        BoilCoffee();
        System.out.println("Drink cofee [water="+water+":coffe="+ caffeine+":temperature="+deliveryTemperature+"]");
    }
}