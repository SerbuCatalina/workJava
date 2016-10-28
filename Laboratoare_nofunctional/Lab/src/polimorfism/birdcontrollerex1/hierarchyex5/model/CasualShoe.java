package polimorfism.birdcontrollerex1.hierarchyex5.model;

public class CasualShoe extends Shoes {
    private int stepsNo;

    public CasualShoe() {
        stepsNo = 0;
    }

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
