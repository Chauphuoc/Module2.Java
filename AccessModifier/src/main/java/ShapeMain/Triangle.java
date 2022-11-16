package ShapeMain;

import java.util.Scanner;

public class Triangle extends Shape {
    public double side1=1;
    public double side2=1;
    public double side3=1;
    public Triangle (){

    }
    public Triangle (double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea (){
        double a = getPerimeter()/2;
        return Math.sqrt(a*(a-side1)*(a-side2)*(a-side3));
    }

    public double getPerimeter (){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}'+super.toString()+"\n"+"Area is:"+getArea()+"\n"+"Perimeter is:"+getPerimeter();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle shape1 = new Triangle();
        System.out.println(shape1.toString());
        double side1;
        double side2;
        double side3;
        do {
            System.out.println("Enter side 1:");
            side1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter side 2:");
            side2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter side 3:");
            side3 = Double.parseDouble(scanner.nextLine());
            if (side1<1||side2<1||side3<1){
                System.out.println("Type again");
            }
        }while (side1<1||side2<1||side3<1);


        System.out.println("Enter your color:");
        String color = scanner.nextLine();
        Triangle shape2 = new Triangle(side1,side2,side3);
        shape2.setColor(color);
        System.out.println(shape2.toString());
    }
}
