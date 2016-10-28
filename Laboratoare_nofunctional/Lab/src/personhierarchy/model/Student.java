package personhierarchy.model;

import personhierarchy.service.CNPService;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;



public class Student extends Person implements Serializable {
    private String cnp;
    private String name;

    private College sc;

    private CNPService cs;
    private HashMap<Subject,Grade> grades = new HashMap<Subject,Grade>();

    public Student(String cnp, String name, College sc) {
        super(cnp, name);
        this.cnp = cnp;

        cs = new CNPService(cnp);
        this.name = name;
        this.sc = sc;
    }

    public void addGrade(Subject s,Grade grade) {
        System.out.println("Adding grade "+grade+""+" at subject "+s);
        grades.put(s,grade);
    }

    public void showStudent(){
        System.out.print("Student "+this.name+"; age "+this.cs.getAge());
        System.out.println(";studies at College:"+this.sc);

    }
    public void showGrades()
    {
        System.out.println("Grades for student "+this.name+" are:");
        Iterator<Subject> keySetIterator = grades.keySet().iterator();

        while(keySetIterator.hasNext())        {
            Subject key = keySetIterator.next();
            System.out.println("Subject: " + key + " value: " + grades.get(key));
        }

    }

    //todo: implement this
    public void showAverage(){

    }

}
