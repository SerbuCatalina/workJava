package polimorfism.birdcontrollerex1.hierarchyex5.model;

import java.util.Date;



public class Shoes {
    private String name;
    private Size size;
    private Brand brand;
    private Colour colour;
    private Date buyDate;

    private int warantyYearsNo;

    public Shoes() {
        name = "GENERIC";
        size = Size.FOR;
        brand = Brand.GENERIC;
        colour = Colour.BLACK;
        buyDate = new Date();
        warantyYearsNo = 4;
    }

    public Shoes(String name, Size size, Brand brand, Colour colour, Date buyDate, int warantyYearsNo) {
        this.name = name;
        this.size = size;
        this.brand = brand;
        this.colour = colour;
        this.buyDate = buyDate;
        this.warantyYearsNo = warantyYearsNo;
    }

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
