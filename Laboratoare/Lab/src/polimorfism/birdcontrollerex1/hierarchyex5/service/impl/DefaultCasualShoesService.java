package polimorfism.birdcontrollerex1.hierarchyex5.service.impl;

import polimorfism.birdcontrollerex1.hierarchyex5.model.CasualShoe;

public class DefaultCasualShoesService extends DefaultShoesService {

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
