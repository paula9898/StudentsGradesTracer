package pl.paulina.Subject;

import java.util.ArrayList;
import java.util.UUID;

public class SubjectManager {

    private ArrayList<Subject> subjects = new ArrayList<>();
    ArrayList<String> subjectsNames = new ArrayList<>();

    public Subject addSubject(String name, String teacher, String lernFeld)
    {
        String id = UUID.randomUUID().toString();
        Subject subject = new Subject(id, name, teacher, lernFeld);

        return subject;

    }

    public ArrayList<String> showAllSubjects()
    {

        for(int i =0; i< subjects.size(); i++)
        {
            subjectsNames.add(subjects.get(i).getName());

        }

        return subjectsNames;

    }




}
