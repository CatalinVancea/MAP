package colectii_generics;

public class Student implements Comparable<Student> {
    private String nume;
    private float medie;

    public Student(String nume1, float medie1){
        nume=nume1;
        medie=medie1;
    }

    public String toString(){
        return nume+" "+medie;
    }

    public String getNume() {
        return nume;
    }

    public float getMedie() {
        return medie;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public int hashCode(){
        String s = this.nume + this.medie;
        return s.hashCode();
    }

    @Override
    public int compareTo(Student o) {
        int val = this.nume.compareTo(o.nume);
        if(val<0)
            return -1;
        if(val>0)
            return 1;
        if(this.medie<o.medie)
            return -1;
        if(this.medie>o.medie)
            return 1;
        return 0;
    }
}
