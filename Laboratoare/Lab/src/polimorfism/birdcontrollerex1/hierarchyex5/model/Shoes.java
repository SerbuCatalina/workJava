package polimorfism.birdcontrollerex1.hierarchyex5.model;

import java.util.Date;

enum Brand{
    GENERIC,
    ADIDAS,
    NIKE,
    SALOMON,
    LA_SPORTIVA
}
enum Size{
    FOR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    ELEVEN
}
enum Gender{
    MALE,
    FEMALE
}
enum Colour{
    WHITE,
    BLUE,
    GREEN,
    RED,
    PURPLE,
    BLACK
}

public class Shoes {
    String name = "GENERIC";
    Size size = Size.FOR;
    Brand brand = Brand.GENERIC;
    Colour colour = Colour.BLACK;
    Date buyDate = new Date();

    int warantyYearsNo = 4;

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Brand getBrand() {
        return brand;
    }

    public Colour getColour() {
        return colour;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public int getWarantyYearsNo() {
        return warantyYearsNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public void setWarantyYearsNo(int warantyYearsNo) {
        this.warantyYearsNo = warantyYearsNo;
    }
}
