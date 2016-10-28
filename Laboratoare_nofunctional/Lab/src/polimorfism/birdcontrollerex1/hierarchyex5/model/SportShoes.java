package polimorfism.birdcontrollerex1.hierarchyex5.model;

import polimorfism.birdcontrollerex1.hierarchyex5.model.Shoes;

public class SportShoes extends Shoes {
    private int kmNo;
    private int rezistance;

    public SportShoes() {

        kmNo = 0;
        rezistance = 10000;
    }

    public SportShoes(int kmNo, int rezistance) {
        this.kmNo = kmNo;
        this.rezistance = rezistance;
    }

    public int getKmNo() {
        return kmNo;
    }

    public int getRezistance() {
        return rezistance;
    }

    public void setKmNo(int kmNo) {
        this.kmNo = kmNo;
    }

    public void setRezistance(int rezistance) {
        this.rezistance = rezistance;
    }


}
