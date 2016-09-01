package polimorfism.birdcontrollerex1.hierarchyex5;


import polimorfism.birdcontrollerex1.hierarchyex5.model.*;
import polimorfism.birdcontrollerex1.hierarchyex5.service.*;
import polimorfism.birdcontrollerex1.hierarchyex5.service.impl.DefaultBikingShoesService;
import polimorfism.birdcontrollerex1.hierarchyex5.service.impl.DefaultRunningShoesService;
import polimorfism.birdcontrollerex1.hierarchyex5.service.impl.DefaultShoesService;
import polimorfism.birdcontrollerex1.hierarchyex5.service.impl.DefaultSportShoesService;

public class ShoesApp {
    public static void main(String[] args){

        //SIMPLE SHOES
        Shoes shoes = new Shoes();
        ShoesService ss = new DefaultShoesService();
        if(true == ss.isInWaranty(shoes)){
            System.out.println("Shoes "+shoes.getName()+" is in waranty, waranty years: "+shoes.getWarantyYearsNo());
        }
        else
        {

            System.out.println("Shoes "+shoes.getName()+" is not in waranty, waranty expired: "+shoes.getBuyDate()+shoes.getWarantyYearsNo());
        }

        //SPORT SHOES: starting race
        SportShoes sportSHoes = new SportShoes(0,10000);
        SportShoesService sportShoesService = new DefaultSportShoesService();

        sportShoesService.addKm(sportSHoes,10, CharacteristicUnit.REZISTANCE_FLAT);

        //BIKING SHOES: starting ride
        BikingShoes bikingSHoes = new BikingShoes(0,10000,0);
        bikingSHoes.setName("MyBike");
        DefaultBikingShoesService bikingShoesService = new DefaultBikingShoesService();
        bikingShoesService.rideFlat(bikingSHoes,10);
        bikingShoesService.rideHill(bikingSHoes,2);
        bikingShoesService.rideValley(bikingSHoes,5);

        //RUNNING SHOES: start running
        RunningShoes runningShoes = new RunningShoes(0,100000,100000,100000);
        runningShoes.setName("MyRunning");
        DefaultRunningShoesService rss = new DefaultRunningShoesService();
        rss.runFlat(runningShoes,4);
        rss.runHill(runningShoes,6);
        rss.runValley(runningShoes,2);
        rss.runFlat(runningShoes,3);
        rss.runHill(runningShoes,4);



    }
}
