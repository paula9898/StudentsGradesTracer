package pl.paulina.Subject;

import java.util.ArrayList;

public interface SubjectRepository {

    void save();
    ArrayList<Grade> getAll();
    void remove(Grade grade);
    void edit(Grade grade);

}
