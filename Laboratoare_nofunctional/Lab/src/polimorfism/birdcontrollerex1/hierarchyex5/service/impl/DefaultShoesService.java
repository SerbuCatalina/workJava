package polimorfism.birdcontrollerex1.hierarchyex5.service.impl;

import polimorfism.birdcontrollerex1.hierarchyex5.model.Shoes;
import polimorfism.birdcontrollerex1.hierarchyex5.service.ShoesService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class DefaultShoesService implements ShoesService {

    public boolean isInWaranty(Shoes shoe){

        boolean returnedValue = true;
        Date date = new Date();
        LocalDate currentDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate buyDate = shoe.getBuyDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int currentYear = currentDate.getYear();
        int buyYear = buyDate.getYear();


        if(buyYear+shoe.getWarantyYearsNo() < currentYear)
        {
            returnedValue = false;
        }
        return returnedValue;
    }

}
