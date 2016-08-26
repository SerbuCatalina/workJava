package personhierarchy.model;

import personhierarchy.service.CNPService;

import java.io.Serializable;
import java.util.ArrayList;

public class Professor extends Person implements Serializable{

    private String cnp;
    private String name;

    private College sc;

    private ArrayList<Subject> subjects = new ArrayList<Subject>();
    private CNPService cs;

    public Professor(String cnp, String name, College sc) {
        super(cnp,name);
        this.cnp = cnp;
        this.name = name;
        this.sc = sc;

        cs = new CNPService(cnp);
    }

    public void showProfessor(){
        System.out.print("Professor ");
        super.showAge();
        System.out.println("teaches at College:"+this.sc);
    }
    public void addSubject(Subject s){
        subjects.add(s);
    }

    public void showSubjects(){
        System.out.println("Professor "+this.name+" teaches:");
        for(Subject s:subjects)
        {
            System.out.println(s);
        }

    }
}
