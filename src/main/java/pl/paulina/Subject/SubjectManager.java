package pl.paulina.Subject;

import pl.paulina.Grade.Grade;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class SubjectManager {

    private ArrayList<Subject> subjects = new ArrayList<>();
    ArrayList<String> subjectsNames = new ArrayList<>();
    ArrayList<Subject> subjectsDetails = new ArrayList<>();
    ArrayList<Integer> subjectsGrades = new ArrayList<>();

    public Subject addSubject(String name, String teacher, String lernFeld)
    {
        String id = UUID.randomUUID().toString();
        Subject subject = new Subject(id, name, teacher, lernFeld);
        subjects.add(subject);

        return subject;

    }

    public void addSubject(Subject subject)
    {
        subjects.add(subject);
    }

    public ArrayList<String> showAllSubjects()
    {

        for(int i =0; i< subjects.size(); i++)
        {
            subjectsNames.add(subjects.get(i).getName());

        }
        return subjectsNames;

    }

    public Subject showSubjectDetailsBySubjectName(String subjectName)
    {
        for (Subject subject : subjects)
        {
            if(subjectName.equals(subject.getName())) {
                return subject;
            }
        }
        return null;
    }

    public Subject chooseSubject(String name)
    {
        for (Subject subject :  subjects) {
            if ( name.equals(subject.getName())) {
                return subject;
            }
        }
        return null;
    }

    public void addGradeForSubject(String name, Integer score) {

        Subject chosenSubject = chooseSubject(name);

        chosenSubject.grades.add(score);

    }

    public ArrayList<Integer> displayGradesForASubject(String subjectName) {

        ArrayList<Integer> gradesList =  new ArrayList<>();

        for ( Subject subject : subjects )
        {
            if(subject.getName().equals(subjectName)){
                return subject.grades;
            }
        }
        return null;
    }

    public double calculateAverage(String subjectName) {

        double result = 0;

        ArrayList<Integer> grades;

        grades = displayGradesForASubject(subjectName);

        long amountOfGrades = grades.stream().count();

        Integer sum = grades.stream()
                .reduce(0, Integer::sum);


        return ((double)sum / amountOfGrades);

    }

}
