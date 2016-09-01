package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.BikingShoes;
import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;

public class BikingShoesService extends SportShoesService {

    public boolean addKm(BikingShoes bikingShoes, int kmNo, CharacteristicUnit cu){
        boolean result = false;
        if( true == super.addKm(bikingShoes,kmNo,cu) ) {
            bikingShoes.setRotationNo(bikingShoes.getRotationNo() + 10);
            System.out.println("rotation number:" +bikingShoes.getRotationNo());
            result = true;
        }
        return result;

    }
    public void rideFlat(BikingShoes bikingShoes,int kmNo){
        if( true == addKm(bikingShoes,kmNo,CharacteristicUnit.REZISTANCE_FLAT) ) {
            System.out.println("GO GO, ride FLAT, it is simple!");
        }
    }

    public void rideHill(BikingShoes bikingShoes,int kmNo){
        if( true == addKm(bikingShoes,kmNo,CharacteristicUnit.REZISTANCE_HILL) ) {
            System.out.println("GO GO, ride HILL!");
        }
    }

    public void rideValley(BikingShoes bikingShoes,int kmNo){
        if( true == addKm(bikingShoes,kmNo,CharacteristicUnit.REZISTANCE_VALLEY) ) {
            System.out.println("GO GO, ride VALLEY, it is easy!");
        }

    }
}
