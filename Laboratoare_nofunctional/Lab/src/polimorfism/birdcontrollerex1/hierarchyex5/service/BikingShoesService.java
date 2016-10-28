package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.BikingShoes;
import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;

public interface BikingShoesService extends SportShoesService{
    public boolean addKm(BikingShoes bikingShoes, int kmNo, CharacteristicUnit cu);
    public void rideFlat(BikingShoes bikingShoes,int kmNo);
    public void rideHill(BikingShoes bikingShoes,int kmNo);
    public void rideValley(BikingShoes bikingShoes,int kmNo);
}
