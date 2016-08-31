package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;
import polimorfism.birdcontrollerex1.hierarchyex5.model.SportShoes;

public class SportShoesService extends ShoesService{


    public void addKm(SportShoes sportShoe,int kmNo,CharacteristicUnit cu){
        int currentKm = sportShoe.getKmNo();
        int currentRezistance = sportShoe.getRezistance();
        int cutRezistance = cu.getValue()*kmNo;

        if(currentRezistance >= cutRezistance) {
            if(currentRezistance == cutRezistance){
                System.out.println("you have only "+currentRezistance+" units of rezistance, this is the last course! Change the shoes after that one!");
            }
            sportShoe.setKmNo(kmNo);

            sportShoe.setRezistance(currentRezistance - cutRezistance);

        }
        else{
            System.out.println("You don't have rezistance,only "+currentRezistance+" left! COngratulations, you have ran"+currentKm+"!!! Change the shoes!");
        }
    }


}
