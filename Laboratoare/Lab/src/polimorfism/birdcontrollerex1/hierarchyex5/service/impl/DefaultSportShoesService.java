package polimorfism.birdcontrollerex1.hierarchyex5.service.impl;

import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;
import polimorfism.birdcontrollerex1.hierarchyex5.model.SportShoes;
import polimorfism.birdcontrollerex1.hierarchyex5.service.SportShoesService;

public class DefaultSportShoesService extends DefaultShoesService implements SportShoesService {


    public boolean addKm(SportShoes sportShoe, int kmNo, CharacteristicUnit cu) {
        boolean result = true;

        int currentKm = sportShoe.getKmNo();
        int currentRezistance = sportShoe.getRezistance();
        int cutRezistance = cu.getValue() * kmNo;
        if (currentRezistance >= cutRezistance) {
            if (currentRezistance == cutRezistance) {
                System.out.println("you have only " + currentRezistance + " units of rezistance, this is the last course! Change the shoes after that one!");
            }

            sportShoe.setKmNo(currentKm + kmNo);
            sportShoe.setRezistance(currentRezistance - cutRezistance);
            System.out.println("Adding kilometers for " + sportShoe.getName() + " shoe, current kilometers:" + sportShoe.getKmNo() + ", rezistance:" + sportShoe.getRezistance() + " units.");

        } else {
            System.out.println("You don't have rezistance,only " + currentRezistance + " left! Congratulations, you have ran" + currentKm + "!!! Change the shoes!");
            result = false;
        }
        return result;
    }
}
