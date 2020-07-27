package colectii_generics;

import java.util.*;

public class MyMap {
    public TreeMap<Integer, List<Student>> students = new TreeMap<>();

    public void addStudent(Student student){
        if(students.containsKey(Math.round(student.getMedie())) == true) {
            students.get(Math.round(student.getMedie())).add(student);
        } else {
            List<Student> new_entry = new ArrayList<>();
            new_entry.add(student);
            students.put(Math.round(student.getMedie()), new_entry);
        }
    }

    public Set < Map.Entry<Integer, List<Student> > > getEntries(){
        return students.entrySet();
    }
}
