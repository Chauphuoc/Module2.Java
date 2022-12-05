package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    static int count =0;
    String name;
    String classStudent;
    float math;
    float physic;
    float chemistry;
    float average = (math + physic + chemistry)/3;

    public String getName() {
        return name;
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

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysic() {
        return physic;
    }

    public void setPhysic(float physic) {
        this.physic = physic;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
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
                "name='" + name + '\'' +
                ", classStudent='" + classStudent + '\'' +
                ", average='"+average+
                '}';
    }
    public List<Student> studentList = new ArrayList<>();

    public Student() {
    }

    public Student(String name, String classStudent, float math, float physic, float chemistry) {
        this.name = name;
        this.classStudent = classStudent;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public static Scanner scanner = new Scanner(System.in);
    public void addStudent (){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter class");
        String classStudent = scanner.nextLine();
        System.out.println("Enter Math:");
        float math = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter Physic");
        float physic = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter Chemistry:");
        float chemistry = Float.parseFloat(scanner.nextLine());
        Student std = new Student(name,classStudent,math,physic,chemistry);
        studentList.add(std);
    }
    public void showAllStudent (){
        for (Student student : studentList){
            System.out.println(student);
        }
    }

    public void isGood (){
        for (List<Student> student : studentList){
            if (average>=8.5){

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("====Menu====");
        System.out.println("1.Add a student");
        System.out.println("2.List student");
        System.out.println("3.Classify Student");
        System.out.println("4.Exit");

    }
}
