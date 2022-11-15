package com.accessModifier;
import com.Example.Rectangle;
public class Circle extends Rectangle {

    private double radius = 1;

    private String color ="red";
    public Circle () {}
    public Circle (double radius){
        this.radius = radius;
    }
    public double getRadius (){
        return radius;
    }
    public double getArea (){
        return radius*radius*Math.PI;
    }
    String  display (){
        return  "Circle: Radius:"+this.radius+" ,Area:"+this.getArea();
    }
//    sẽ ghi đè lên giá trị radius của lơp cha
public static void main(String[] args) {
    Circle circle3 = new Circle();
    circle3.setColor("Black");
    circle3.setFilled("white");
    System.out.println(circle3.display()+circle3.getColor()+circle3.getFilled());


}
}
