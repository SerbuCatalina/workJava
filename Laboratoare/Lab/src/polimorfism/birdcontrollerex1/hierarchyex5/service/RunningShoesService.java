package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;
import polimorfism.birdcontrollerex1.hierarchyex5.model.RunningShoes;

public class RunningShoesService extends SportShoesService{

    public void addKm(RunningShoes runningShoes, int kmNo, CharacteristicUnit cu){
        super.addKm(runningShoes,kmNo,cu);
    }

    public void runHill(RunningShoes runningShoes,int kmNo){

        if(){

        }
        addKm(runningShoes,kmNo);
        runningShoes.setRezistance(runningShoes.getRezistance()-5);
        runningShoes.setAdherence(runningShoes.getAdherence()-2);
        runningShoes.setAmortization(runningShoes.getAmortization()-2);

    }

    public void runValley(RunningShoes runningShoes,int kmNo){
        runningShoes.setKmNo(runningShoes.getKmNo()+kmNo);
        runningShoes.setRezistance(runningShoes.getRezistance()-7);
        runningShoes.setAdherence(runningShoes.getAdherence()-5);
        runningShoes.setAmortization(runningShoes.getAmortization()-5);
    }
}
