package polimorfism.birdcontrollerex1.hierarchyex5.model;


public class RunningShoes extends SportShoes {

    private int adherence;
    private int amortization;

    public RunningShoes() {
        adherence = 100000;
        amortization = 100000;
    }

    public RunningShoes(int kmNo, int rezistance, int adherence, int amortization) {
        super(kmNo, rezistance);
        this.adherence = adherence;
        this.amortization = amortization;
    }

    public int getAdherence() {
        return adherence;
    }

    public int getAmortization() {
        return amortization;
    }

    public void setAdherence(int adherence) {
        this.adherence = adherence;
    }

    public void setAmortization(int amortization) {
        this.amortization = amortization;
    }


}