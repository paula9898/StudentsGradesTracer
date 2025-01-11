package pl.paulina.Subject;

import java.util.ArrayList;

public class Subject {

    private String id;
    private final String name; // value cannot be changed once it has been initialized
    private final String teacherName;
    private final String lernFeld;

    private ArrayList<String>[] grades;

    public Subject(String id, String name, String teacherName, String lernFeld)
    {
        this.id = id;
        this.name = name;
        this.teacherName = teacherName;
        this.lernFeld = lernFeld;

    }

    public String getName()
    {
        return name;
    }










}
