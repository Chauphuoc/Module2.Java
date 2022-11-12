package org.example;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    public QuadraticEquation (double a, double b, double c){
        this.a =a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return delta = b*b-(4*a*c);
    }
    double getRoot (){
        return -c/b;
    }
    public double getRoot1(){
        double r1;
        r1 = (-b+Math.sqrt(b*b-(4*a*c)))/(2*a);
        return r1;
    }
    public double getRoot2(){
        double r2;
        r2 = (-b-Math.sqrt(b*b-(4*a*c)))/(2*a);
        return r2;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b:");
        double b =Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c:");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation computer1 = new QuadraticEquation(a,b,c);

        if (a==0){
            if (b==0){
                System.out.println("The equation has no real roots");
            }
            else {
                System.out.println("The equation has one root"+computer1.getRoot());
            }
        }
        else if (a!=0){
            if (computer1.getDiscriminant()>0){
                System.out.println("The equation has two roots:\n"+"Root1:"+computer1.getRoot1()+", Root2:"+computer1.getRoot2());
            }
            else if (computer1.getDiscriminant()==0){
                System.out.println("The equation has one roots:\t"+computer1.getRoot1());
            }
            else {
                System.out.println("The equation has no roots:\t");
            }
        }
    }
}
