package pl.paulina.Grade;

import java.util.Date;

public class Grade {

    private String id;
    private Double score;
    private  Date date;
    private String type;

    public Grade()
    {

    }

    public Grade(String id,Double score, Date date, String type)
    {
        this.id = id;
        this.score = score;
        this.date = date;
        this.type = type;

    }

}
