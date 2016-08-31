package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.CasualShoe;

public class CasualShoesService {

    public void addStep(CasualShoe casualShoe){

        casualShoe.setStepsNo(casualShoe.getStepsNo()+1);

    }
}
