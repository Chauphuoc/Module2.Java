package ArrayListandGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentClass {
    private ArrayList<Student> arrayList;
    public StudentClass(){
        this.arrayList = new ArrayList<Student>();
    }

    public StudentClass(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }
    public void addStudent (Student student){
        this.arrayList.add(student);
    }
    public void printStudentList (){
        for (Student student: arrayList){
            System.out.println(student.toString());
        }
    }
    public boolean checkArrayList (){
        return this.arrayList.isEmpty();
    }
    public int quantity (){
        return this.arrayList.size();
    }
    public void makeEmpty (){
        this.arrayList.removeAll(arrayList);
    }
    public boolean checkStudent (Student student){
        return this.arrayList.contains(student);
    }
    public boolean removeStudent (Student student){
        return this.arrayList.remove(student);
    }
    public void searchStudent (String name){
        for (Student student:arrayList){
            if (student.getName().indexOf(name)>=0){
                System.out.println(student);
            }
        }
    }

    public void arrangeStudent (){
        Collections.sort(this.arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAvarage()<o2.getAvarage()){
                    return 1;
                }
                else if (o1.getAvarage()>o2.getAvarage()){
                    return -1;
                }
                else return 0;
            }
        });
    }
}
