package polimorfism.birdcontrollerex1.hierarchyex5.service;


import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;
import polimorfism.birdcontrollerex1.hierarchyex5.model.SportShoes;

public interface SportShoesService extends ShoesService {
    public boolean addKm(SportShoes sportShoe, int kmNo, CharacteristicUnit cu);
}
