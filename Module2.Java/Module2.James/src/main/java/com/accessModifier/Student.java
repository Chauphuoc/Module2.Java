package com.accessModifier;

public class Student {


    private int rollno;
    private String name="Join";
    private String _class ="C09";
    private static String college = "BBDIT";
    public Student(){

    }
    public Student (int r,String name){
        this.rollno = r;
        this.name = name;
    }
    public void setName (String newName){
        this.name= newName;
    }
    public String getName (){
        return name;
    }
    public void setClass (String newClass){
        this._class = newClass;
    }
    public String get_class(){
        return this._class;
    }
    public static void change (String newCollege){
        college = newCollege;
    }
    public void display (){
        System.out.println(rollno + " " + name + " " + college+".Class:"+_class);
    }

}
