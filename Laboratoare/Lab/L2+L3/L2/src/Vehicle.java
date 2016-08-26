/**
 * Created by Catalina on 6/12/2016.
 */

public class Vehicle {

    String name;
    String mark;
    VehicleType type;
    int noOfKilometers;
    int productionYear;
    String productionCountry;


    void setName(String newName){
        this.name = newName;
    }
    String getName(){
        return this.name;
    }

    void setMark(String newMark){
        this.mark = newMark;
    }
    String getMark(){
        return this.mark;
    }

    public void setNoOfKilometers(int noOfKilometers) {
        this.noOfKilometers = noOfKilometers;
    }

    public int getNoOfKilometers() {
        return noOfKilometers;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public Vehicle(String name, String mark, VehicleType type, int noOfKilometers, int productionYear, String productionCountry) {
        this.name = name;
        this.mark = mark;
        this.type = type;
        this.noOfKilometers = noOfKilometers;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    boolean isNewVehicle(){
        boolean ret = false;
        if(0 == this.noOfKilometers){
            ret = true;
        }
        return ret;
    }


    public String toString(){
        String vehType;
        String isVehNew;

        if(true == isNewVehicle())
        {
            isVehNew = "new";
        }
        else
        {
            isVehNew = "used";
        }
        return "We have a car with name:"+this.name+",type:"+this.type+",mark:"+this.type+","+isVehNew+", from year"+this.productionYear+",country:"+this.productionCountry;

    }
    public static void main(String[] args){

        Vehicle exampleVeh = new Vehicle("Volvo90","Volvo",VehicleType.SIMPLECAR,0,2016,"Sweden");

        System.out.println(exampleVeh);

    }
}
