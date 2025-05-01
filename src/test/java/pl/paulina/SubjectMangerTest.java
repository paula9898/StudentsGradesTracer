package pl.paulina;


import org.junit.jupiter.api.Test;
import pl.paulina.Subject.Subject;
import pl.paulina.Subject.SubjectManager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class SubjectMangerTest {
    private final SubjectManager subjectManger = new SubjectManager();

    @Test
    void addedSubjectShouldBeCreatedTest() {

        //given



        //when


        //then
    }

    @Test
    void calculateAverageTest() {

        //given
        ArrayList<String> subjects = new ArrayList<>();
        subjectManger.addSubject("Cyber-physische Systeme ergänzen","Qashi, Riyadh","LF7");
        subjectManger.addGradeForSubject("Cyber-physische Systeme ergänzen",3);
        subjectManger.addGradeForSubject("Cyber-physische Systeme ergänzen",2);
        //when
        double average = subjectManger.calculateAverage("Cyber-physische Systeme ergänzen");;

        //then
        assertEquals(2.5, average);
    }

}

