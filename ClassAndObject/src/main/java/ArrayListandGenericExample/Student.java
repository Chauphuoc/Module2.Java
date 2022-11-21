package ArrayListandGenericExample;

import java.util.Objects;

public class Student implements Comparable <Student> {
    private String nameStudent;
    private int idStudent;
    private String birthday;
    private float average;
    public Student (int idStudent){
        this.idStudent = idStudent;
    }
    public Student(String name){
        this.nameStudent = name;
    }
    public Student(String nameStudent, int idStudent, String birthday, float average) {
        this.nameStudent = nameStudent;
        this.idStudent = idStudent;
        this.birthday = birthday;
        this.average = average;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", idStudent=" + idStudent +
                ", birthday='" + birthday + '\'' +
                ", average=" + average +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent);
    }

    @Override
    public int compareTo(Student o) {
        if(this.idStudent > o.idStudent){
            return 1;
        }
        else if (this.idStudent<o.idStudent){
            return -1;
        }
        else return 0;
    }
}
