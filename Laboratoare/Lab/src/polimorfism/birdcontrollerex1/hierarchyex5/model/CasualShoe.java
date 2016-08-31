package polimorfism.birdcontrollerex1.hierarchyex5.model;

public class CasualShoe extends Shoes {
    int stepsNo = 0;

    public CasualShoe(int stepsNo) {
        this.stepsNo = stepsNo;
    }

    public int getStepsNo() {
        return stepsNo;
    }

    public void setStepsNo(int stepsNo) {
        this.stepsNo = stepsNo;
    }
}
