package com.Example;

public class Circle extends Geomatric {
    private double radius;
    public Circle (){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color,String filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius (){
        return radius;
    }
    public void setRadius (double newRadius){
        this.radius = newRadius;
    }
    public double getArea (){
        return radius*radius*Math.PI;
    }
    public double getPerimeter (){
        return Diameter()*Math.PI;
    }
    public double Diameter (){
        return radius*2;
    }
    public void printCircle (){
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(2,"Blue","Yeah");
        circle1.setColor("Red");
        circle1.printCircle();
        System.out.println(circle1.toString());
    }
}
