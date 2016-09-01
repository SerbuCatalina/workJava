package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.CasualShoe;

public class CasualShoesService extends ShoesService{

    public boolean addStep(CasualShoe casualShoe,int stepsNo){

        boolean result  = true;
        if(false == this.isInWaranty(casualShoe)) {
            System.out.println("The shoes aren't in waranty anymore, change the shoes!");
            result = false;
        }
        casualShoe.setStepsNo(casualShoe.getStepsNo() + stepsNo);
        return result;

    }
}
