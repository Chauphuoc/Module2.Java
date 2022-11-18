package Comparable;

public class Test {
    public static void main(String[] args) {
        Student tom = new Student(150,"Tom My","9/2",8);
        Student Nam = new Student(154,"nam thanh","9/2",4);
        Student Thanh = new Student(158,"thanh vy","9/2",6);
//        System.out.println(tom.getLastName());
        System.out.println(tom.compareTo(Thanh));
    }
}
