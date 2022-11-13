package com.accessModifier;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(3,"Phuoc");
        Student.change("Da Nang Technology University");
        student1.display();

        Student student2 = new Student(1,"Nam");
        student2.change("Hue University");
        student2.display();
        Student student3 = new Student(2,"Nam");
        student3.change("HCM University");
        student3.display();

        Car carTom = new Car("Mazda","4Xilanh");
        System.out.println(carTom.display());
        Car carPeter = new Car("Camry","4Xilanh");
        System.out.println(Car.display());
    }
}