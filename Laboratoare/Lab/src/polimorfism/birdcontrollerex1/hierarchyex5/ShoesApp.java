package polimorfism.birdcontrollerex1.hierarchyex5;


import polimorfism.birdcontrollerex1.hierarchyex5.model.*;
import polimorfism.birdcontrollerex1.hierarchyex5.service.BikingShoesService;
import polimorfism.birdcontrollerex1.hierarchyex5.service.RunningShoesService;
import polimorfism.birdcontrollerex1.hierarchyex5.service.ShoesService;
import polimorfism.birdcontrollerex1.hierarchyex5.service.SportShoesService;

public class ShoesApp {
    public static void main(String[] args){

        //SIMPLE SHOES
        Shoes shoes = new Shoes();
        ShoesService ss = new ShoesService();
        if(true == ss.isInWaranty(shoes)){
            System.out.println("Shoes "+shoes.getName()+" is in waranty, waranty years: "+shoes.getWarantyYearsNo());
        }
        else
        {

            System.out.println("Shoes "+shoes.getName()+" is not in waranty, waranty expired: "+shoes.getBuyDate()+shoes.getWarantyYearsNo());
        }

        //SPORT SHOES: starting race
        SportShoes sportSHoes = new SportShoes(0,10000);
        SportShoesService sportShoesService = new SportShoesService();

        sportShoesService.addKm(sportSHoes,10, CharacteristicUnit.REZISTANCE_FLAT);

        //BIKING SHOES: starting ride
        BikingShoes bikingSHoes = new BikingShoes(0,10000,0);
        bikingSHoes.setName("MyBike");
        BikingShoesService bikingShoesService = new BikingShoesService();
        bikingShoesService.rideFlat(bikingSHoes,10);
        bikingShoesService.rideHill(bikingSHoes,2);
        bikingShoesService.rideValley(bikingSHoes,5);

        //RUNNING SHOES:S start running
        RunningShoes runningShoes = new RunningShoes(0,100000,100000,100000);
        runningShoes.setName("MyRunning");
        RunningShoesService rss = new RunningShoesService();
        rss.runFlat(runningShoes,4);
        rss.runHill(runningShoes,6);
        rss.runValley(runningShoes,2);
        rss.runFlat(runningShoes,3);
        rss.runHill(runningShoes,4);



    }
}
