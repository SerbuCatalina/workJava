package polimorfism.birdcontrollerex1.hierarchyex5.model;


public class BikingShoes extends SportShoes {

    private int rotationNo;

    public BikingShoes(int kmNo, int rezistance) {
        super(kmNo, rezistance);
        rotationNo = 0;
    }

    public BikingShoes(int kmNo, int rezistance, int rotationNo) {
        super(kmNo, rezistance);
        this.rotationNo = rotationNo;
    }

    public int getRotationNo() {
        return rotationNo;
    }

    public void setRotationNo(int rotationNo) {
        this.rotationNo = rotationNo;
    }
}
