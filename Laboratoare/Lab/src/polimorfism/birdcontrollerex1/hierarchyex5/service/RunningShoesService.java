package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.CharacteristicUnit;
import polimorfism.birdcontrollerex1.hierarchyex5.model.RunningShoes;

public class RunningShoesService extends SportShoesService{

    public boolean addKm(RunningShoes runningShoes, int kmNo, CharacteristicUnit rezistanceCu, CharacteristicUnit adherenceCu, CharacteristicUnit amortizationCu){

        boolean result = true;
        int currentKm = runningShoes.getKmNo();
        int currentAdherence = runningShoes.getAdherence();
        int currentAmortization = runningShoes.getAmortization();

        int adherenceToCut = adherenceCu.getValue()*kmNo;
        int amortizationToCut = amortizationCu.getValue()*kmNo;


        if(currentAdherence >= adherenceToCut)
        {
            if(currentAdherence == currentAdherence)
            {
                System.out.println("you have only "+currentAdherence+" units of adherence, this is the last course! Change the shoes after that one!");
            }

            if(currentAmortization >= amortizationToCut)
            {
                if (currentAmortization == amortizationToCut)
                {
                    System.out.println("you have only " + currentAmortization + " units of amortization, this is the last course! Change the shoes after that one!");
                }

                if (true == super.addKm(runningShoes, kmNo, rezistanceCu)) {
                    runningShoes.setAdherence(currentAdherence - adherenceToCut);
                    runningShoes.setAmortization(currentAmortization - amortizationToCut);
                    System.out.println("Cutting adherence, current adherence:"+runningShoes.getAdherence()+", amortization:"+runningShoes.getAmortization()+" units.");
                }
            }
            else{
                result = false;
                System.out.println("You don't have amortization,only "+currentAmortization+" left! Congratulations, you have ran"+currentKm+"!!! Change the shoes!");
            }

        }
        else{
            result = false;
            System.out.println("You don't have adherence,only "+currentAdherence+" left! Congratulations, you have ran"+currentKm+"!!! Change the shoes!");
        }
        return result;

    }
    public void runFlat(RunningShoes runningShoes,int kmNo){

        if( true == addKm(runningShoes,kmNo,CharacteristicUnit.REZISTANCE_FLAT,CharacteristicUnit.ADHERENCE_FLAT,CharacteristicUnit.AMORTIZATION_FLAT) ) {
            System.out.println("GO GO, run FLAT, it is simple!");
        }

    }

    public void runHill(RunningShoes runningShoes,int kmNo){

        if( true == addKm(runningShoes,kmNo,CharacteristicUnit.REZISTANCE_HILL,CharacteristicUnit.ADHERENCE_HILL,CharacteristicUnit.AMORTIZATION_HILL) ) {
            System.out.println("GO GO, run HILL!");
        }

    }

    public void runValley(RunningShoes runningShoes,int kmNo){
        if( true == addKm(runningShoes,kmNo,CharacteristicUnit.REZISTANCE_VALLEY,CharacteristicUnit.ADHERENCE_VALLEY,CharacteristicUnit.AMORTIZATION_VALLEY) ) {
            System.out.println("GO GO, run VALLEY, it is easy!");
        }
    }
}
