package com.accessModifier;

public class Car {
    public static String name;
    private static int numberofCar;
    private static String engine;
    public Car (String name,String engine){
        this.name = name;
        this.engine = engine;
        numberofCar++;
    }
    public static String display (){
        return "Name of car is:"+name+" ,using Xilanh:"+engine +"\tNumber of Car:"+numberofCar;
    }
}
