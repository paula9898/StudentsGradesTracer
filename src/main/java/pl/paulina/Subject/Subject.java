package pl.paulina.Subject;

import pl.paulina.Grade.Grade;

import java.util.ArrayList;
import java.util.Objects;

public class Subject {

    private String id;
    private  String name; // value cannot be changed once it has been initialized
    private  String teacherName;
    private  String lernFeld;
    private  Grade grade;


    public ArrayList<Double> grades = new ArrayList<>();

    public Subject() {}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id) && Objects.equals(name, subject.name) && Objects.equals(teacherName, subject.teacherName) && Objects.equals(lernFeld, subject.lernFeld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teacherName, lernFeld);
    }


    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", lernFeld='" + lernFeld + '\'' +
                '}';
    }

}
