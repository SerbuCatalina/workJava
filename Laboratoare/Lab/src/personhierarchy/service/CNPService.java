package personhierarchy.service;

import java.io.Serializable;
import java.util.Calendar;

public class CNPService implements Serializable {

    private String cnp;

    public CNPService(String cnp) {
        this.cnp = cnp;
    }

    public int getAge(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birdthYear = Character.getNumericValue(cnp.charAt(1))*10+Character.getNumericValue(cnp.charAt(2));//stored as sufix: 90->1990

        if(cnp.charAt(0) == '1' || cnp.charAt(0) == '2') {
            birdthYear += 1900;

        }
        else if(cnp.charAt(0) == '5' || cnp.charAt(0) == '6') {
            birdthYear += 2000;
        }
        return (currentYear-birdthYear);
    }

    public char getGender() {
        char gender = cnp.charAt(1);
        if(gender == '1' || gender == '5') {
            gender = 'M';
        }
        else if(gender == '2' || gender == '6') {
            gender = 'F';

        }
        return gender;
    }
}
