package pl.paulina;


import org.junit.jupiter.api.Test;
import pl.paulina.Subject.Subject;
import pl.paulina.Subject.SubjectManager;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SubjectMangerTest {

    private final SubjectManager subjectManager = new SubjectManager();

    @Test
    void addedSubjectShouldBeCreatedTest() {

        //given
        String name = "Clients in Netzwerke einbinden";
        String teacherName = "Rainer";
        String lernFeld = "LF3";
        //Subject subject = new Subject(null, name, teacherName, lernFeld);

        //when
        Subject subject = subjectManager.addSubject(name,teacherName, lernFeld);

        //then
        //assertEquals()
        ArrayList<String> subjects = subjectManager.showAllSubjects();
        assertEquals(1, subjects.size());

    }
}
