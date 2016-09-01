package polimorfism.birdcontrollerex1.hierarchyex5.model;


public enum CharacteristicUnit{
    ADHERENCE_FLAT(1),
    AMORTIZATION_FLAT(1),
    ADHERENCE_HILL(2),
    AMORTIZATION_HILL(2),
    REZISTANCE_FLAT(3),
    REZISTANCE_HILL(5),
    REZISTANCE_VALLEY(6),
    ADHERENCE_VALLEY(7),
    AMORTIZATION_VALLEY(7);

    private int value;

    CharacteristicUnit(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}