package personhierarchy;

import personhierarchy.model.*;
import personhierarchy.service.SerializationUtil;

import java.io.IOException;

/**
 * Application of Person hierarchy.
 */



public class PersonApp {
    public static void main(String[] args) {

        int noStudents = 5;
        int noProffesors = 5;

        Student[] students = new Student[noStudents];
        Professor[] professors = new Professor[noProffesors];

        students[0] = new Student("1940718123456", "Oneil Mark", College.UBB);
        students[0].addGrade(Subject.ALGEBRA, Grade.FIVE);
        students[0].addGrade(Subject.DATABASES, Grade.SEVEN);
        students[0].addGrade(Subject.GEOMETRY, Grade.NINE);

        students[1] = new Student("1950718123456", "Oneil George", College.UTCN);
        students[1].addGrade(Subject.JAVA_PROGRAMMING, Grade.NINE);
        students[1].addGrade(Subject.DATABASES, Grade.EIGHT);
        students[1].addGrade(Subject.GEOMETRY, Grade.NINE);

        students[2] = new Student("2960718123456", "Oneil Gabrielle", College.TRANSYLVANIA);
        students[2].addGrade(Subject.ALGEBRA, Grade.FIVE);
        students[2].addGrade(Subject.DATABASES, Grade.SEVEN);
        students[2].addGrade(Subject.JAVA_PROGRAMMING, Grade.NINE);

        students[3] = new Student("2970718123456", "Gabrielle Mary", College.UBB);
        students[3].addGrade(Subject.ALGEBRA, Grade.SEVEN);
        students[3].addGrade(Subject.DATABASES, Grade.SEVEN);
        students[3].addGrade(Subject.GEOMETRY, Grade.NINE);

        students[4] = new Student("1980718123456", "Gabrielle Mark", College.UTCN);
        students[4].addGrade(Subject.ALGEBRA, Grade.FIVE);
        students[4].addGrade(Subject.JAVA_PROGRAMMING, Grade.TEN);
        students[4].addGrade(Subject.GEOMETRY, Grade.NINE);

        professors[0] = new Professor("1400911123456", "Kenedy Mark", College.UBB);
        professors[0].addSubject(Subject.JAVA_PROGRAMMING);
        professors[0].addSubject(Subject.DATABASES);

        professors[1] = new Professor("1450718123456", "Kenedy Grigor", College.UTCN);
        professors[1].addSubject(Subject.GEOMETRY);

        professors[2] = new Professor("2500718123456", "Kenedy Gabrielle", College.TRANSYLVANIA);
        professors[2].addSubject(Subject.ALGEBRA);
        professors[2].addSubject(Subject.GEOMETRY);

        professors[3] = new Professor("2550718123456", "Mark Mary", College.UBB);
        professors[3].addSubject(Subject.DATABASES);
        professors[3].addSubject(Subject.JAVA_PROGRAMMING);

        professors[4] = new Professor("1600718123456", "Grigor Mark", College.UTCN);
        professors[4].addSubject(Subject.ALGEBRA);


        try {
            System.out.println("STUDENTS:");
            for (int i = 0; i < noStudents; i++) {
                SerializationUtil.serialize(students[i], "serializationStudents.txt");
                students[i].showStudent();
                students[i].showGrades();
                //Student newStudent = (Student)SerializationUtil.deserialize("serializationStudents.txt");
                //newStudent.showStudent();
                //newStudent.showGrades();

            }

            System.out.println("DESERIALIZE:");
            for(int i=0;i<noStudents;i++) {
                Student newStudent = (Student)SerializationUtil.deserialize("serializationStudents.txt");
                newStudent.showStudent();
                newStudent.showGrades();
            }
            System.out.println("PROFESSORS:");
            for(int i=0;i<noProffesors;i++) {
                SerializationUtil.serialize(professors[i], "serializationProfessors.txt");
                professors[i].showProfessor();
                professors[i].showSubjects();
                //Professor newProfessor = (Professor) SerializationUtil.deserialize("serializationProfessors.txt");
                //newProfessor.showProfessor();
                //newProfessor.showSubjects();
            }
            System.out.println("DESERIALIZE:");

            for(int i=0;i<noProffesors;i++) {
                Professor newProfessor = (Professor)SerializationUtil.deserialize("serializationProfessors.txt");
                newProfessor.showProfessor();
                newProfessor.showSubjects();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



}
