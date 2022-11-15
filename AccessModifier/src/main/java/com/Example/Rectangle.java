package com.Example;

public class Rectangle extends Geomatric {
    private double width;
    private double height;
    public Rectangle (){}
    public Rectangle (double width,double height){
        this.width = width;
        this.height =height;
    }
    public Rectangle (String color,String filled,double width,double height){
        this.width = width;
        this.height =height;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth (){
        return this.width;
    }
    public void setWidth (double newwidth){
        this.width = newwidth;
    }
    public double getHeight (){
        return this.height;
    }
    public void setHeight (double newHeight){
        this.height = newHeight;
    }
    public double getArea (){
        return this.width * this.height;
    }
    public double getPerimeter (){
        return (this.width+this.height)*2;
    }

    public static void main(String[] args) {

    }
}
