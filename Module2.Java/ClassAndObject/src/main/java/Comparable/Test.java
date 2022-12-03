package Comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student [] students = new Student[3];
        students[0] =new Student(150, "Tran Van hanh", "Lop 1", 9);
        students[1] =new Student(100, "Chau Van Phuoc", "Lop 2", 8);
        students[2] =new Student(199, "Nguyen Van An", "Lop 2", 8);

        for (int i = 0; i<students.length-1;i++){
            for (int j=i+1;j< students.length;j++){
                Student r1 = students[i];
                Student r2 = students [j];
                if (r1.compareTo(r2)>0){
                    Student temp = students [i];
                    students[i] = students [j];
                    students [j]=temp;
                }
            }
            System.out.println(Arrays.toString(students));
        }
    }
}
