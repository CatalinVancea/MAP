package colectii_generics;

import java.util.Comparator;

public class Desc implements Comparator<Student> {

    public int compare(Student c1, Student c2){
        return c1.compareTo(c2)*-1;
    }
}