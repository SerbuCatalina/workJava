package personhierarchy.model;

import personhierarchy.service.CNPService;

import java.io.Serializable;


public class Person implements Serializable {
    private String cnp;
    private String name;

    private CNPService cs;// = new CNPService(cnp);

    public Person(String cnp,String name) {
        this.cnp = cnp;
        this.name = name;
        cs = new CNPService(cnp);
    }

    public void showAge(){
        System.out.println(this.name+" has "+this.cs.getAge()+" years old.");
    }

    public void showGender(){
        System.out.println(this.name+" has gender: "+this.cs.getGender()+".");
    }

}

