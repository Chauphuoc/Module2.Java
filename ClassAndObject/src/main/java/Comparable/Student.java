package Comparable;

public class Student implements Comparable<Student> {
    private int ID;
    private String name;
    private String classStudent;
    private double avarage;

    public Student(int ID, String name, String classStudent, double avarage) {
        this.ID = ID;
        this.name = name;
        this.classStudent = classStudent;
        this.avarage = avarage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    public String getName() {
        return name;
    }

    public String getLastName (){
        String s =this.name.trim();
        if(s.indexOf("")>=0){
           int vt = s.lastIndexOf("")+1;
           return s.substring(vt);
        }
        else {return s;}
    }
    @Override
    public int compareTo(Student o) {
        String nameThis =this.getLastName();
        String name0 = o.getLastName();
        return nameThis.compareTo(name0);
    }
}
