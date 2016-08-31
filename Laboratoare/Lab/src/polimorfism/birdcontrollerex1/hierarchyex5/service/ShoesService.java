package polimorfism.birdcontrollerex1.hierarchyex5.service;

import polimorfism.birdcontrollerex1.hierarchyex5.model.Shoes;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class ShoesService {

    private Shoes shoe;

    public boolean isInWaranty(){

        boolean returnedValue = true;
        Date date = new Date();
        LocalDate currentDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate buyDate = shoe.getBuyDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int currentYear = currentDate.getYear();
        int buyYear = buyDate.getYear();


        if(buyYear+shoe.getWarantyYearsNo() > currentYear)
        {
            returnedValue = false;
        }
        return returnedValue;
    }


}
