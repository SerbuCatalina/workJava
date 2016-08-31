package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.BikingShoes;
import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;

public class BikingShoesService extends SportShoesService {

    public void addKm(BikingShoes bikingShoes, int kmNo, CharacteristicUnit cu){
        super.addKm(bikingShoes,kmNo,cu);
        bikingShoes.setRotationNo(bikingShoes.getRotationNo()+10);

    }
    public void rideFlat(BikingShoes bikingShoes,int kmNo){
        addKm(bikingShoes,kmNo,CharacteristicUnit.REZISTANCE_FLAT);
    }

    public void rideHill(BikingShoes bikingShoes,int kmNo){
         addKm(bikingShoes,kmNo,CharacteristicUnit.REZISTANCE_HILL);
    }

    public void rideValley(BikingShoes bikingShoes,int kmNo){
        addKm(bikingShoes,kmNo,CharacteristicUnit.REZISTANCE_VALLEY);

    }
}
