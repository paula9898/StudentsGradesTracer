package pl.paulina.Grade;

import java.util.Date;

public class Grade {

    private  String id;
    private final Integer score;
    private final Date date;
    private final String type;

    public Grade(Integer score, Date date, String type)
    {
        this.score = score;
        this.date = date;
        this.type = type;

    }



}
