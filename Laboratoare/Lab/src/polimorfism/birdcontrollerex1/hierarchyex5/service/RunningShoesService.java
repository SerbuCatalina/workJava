package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;
import polimorfism.birdcontrollerex1.hierarchyex5.model.RunningShoes;

public interface RunningShoesService {
    public boolean addKm(RunningShoes runningShoes, int kmNo, CharacteristicUnit rezistanceCu, CharacteristicUnit adherenceCu, CharacteristicUnit amortizationCu);
    public void runFlat(RunningShoes runningShoes,int kmNo);
    public void runHill(RunningShoes runningShoes,int kmNo);
    public void runValley(RunningShoes runningShoes,int kmNo);
}
