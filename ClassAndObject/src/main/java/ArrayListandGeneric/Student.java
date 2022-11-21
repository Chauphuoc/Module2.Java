package ArrayListandGeneric;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String id;
    private int birthDay;
    private double avarage;

    public Student(String id) {
        this.id = id;
    }

    public Student(String name, String id, int birthDay, double avarage) {
        this.name = name;
        this.id = id;
        this.birthDay = birthDay;
        this.avarage = avarage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", birthDay=" + birthDay +
                ", avarage=" + avarage +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
