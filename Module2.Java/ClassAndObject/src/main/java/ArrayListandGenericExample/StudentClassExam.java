package ArrayListandGenericExample;

import ArrayListandGeneric.StudentClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentClassExam {
    private ArrayList<Student> listStudent;
    public StudentClassExam(){
        this.listStudent = new ArrayList<Student>();
    }

    public StudentClassExam(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }
    public void addstudent (Student student){
        this.listStudent.add(student);
    }
    public void printListStudent (){
        for (Student student:listStudent){
            System.out.println(student);
        }
    }
    public boolean checkEmpty (){
        return listStudent.isEmpty();
    }
    public int getSize (){
        return this.listStudent.size();
    }
    public void makeEmpty (){
        this.listStudent.removeAll(this.listStudent);
    }
    public boolean checkStudent (Student i){
       return   this.listStudent.contains(i);
    }
    public boolean removeStudent (Student i){
        return this.listStudent.remove(i);
    }
    public void searchStudent (Student a){
        for (Student i : listStudent){
            if (i.getNameStudent().indexOf(a.getNameStudent())>=0){
                System.out.println(i);
            }
        }
    }
    public void arrangeList (){
        Collections.sort(this.listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAverage()>o2.getAverage()){
                    return -1;
                } else if (o1.getAverage()<o2.getAverage()) {
                    return 1;
                }
                else return 0;
            }
        });
    }
}
