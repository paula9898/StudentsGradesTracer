package pl.paulina;

public class Student {

    private String name;
    private String surname;
    private String city;
    private String email; // is not a private email, it is a student email; add extra validation hmm later administartor
    private int age;
    private int id;


    public Student(String name, String surname, String city, String email)
    {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
