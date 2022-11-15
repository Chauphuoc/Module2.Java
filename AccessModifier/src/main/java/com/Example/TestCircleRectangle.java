package com.Example;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle2 = new Circle(3);
        circle2.setColor("white");
        circle2.setFilled("Orange");
        System.out.println(circle2.toString()) ;
        System.out.println("The area of circle is"+circle2.getArea());
        System.out.println("The radius of Circle is:"+circle2.getRadius());
        System.out.println("The Diameter is:"+circle2.Diameter());

        Rectangle rectangle = new Rectangle("Blue","Black",5,6);
        System.out.println(rectangle.toString());
        System.out.println("Width"+rectangle.getWidth()+"Height:"+rectangle.getHeight());
        System.out.println("The area:"+rectangle.getArea());
        System.out.println("The Perimeter:"+rectangle.getPerimeter());
    }
}
