package pl.paulina;

import pl.paulina.Subject.Subject;
import pl.paulina.Subject.SubjectManager;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to My Grade Tracker");
        System.out.println("Just to track how bad your grades are!");

        //Subject subject = new Subject();

        SubjectManager subjectManager = new SubjectManager();

        subjectManager.addSubject("Networking","Herr Doktor Bishof", "LF5");



        System.out.println(subjectManager.showAllSubjects());
        subjectManager.addGradeForSpecificSubject("Networking",4.5);

        subjectManager.displayGradesForASubject("Networking");

        System.out.println(subjectManager.displayGradesForASubject("Networking"));

        ;













    }
}