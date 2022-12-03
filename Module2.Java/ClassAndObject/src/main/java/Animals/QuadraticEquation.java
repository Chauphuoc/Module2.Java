package Animals;

import java.util.Scanner;

public class QuadraticEquation {
    private float a;
    private float b;
    private float c;
    private float delta;
    public QuadraticEquation (float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getDelta (){
        return delta;
    }
    public void  setDelta(float a, float b, float c){
        delta = b*b-4*a*c;
    }
    public float getOneroot (){
        return -c/b;
    }
    public float getRoot1 (){
        return (-b+(float) Math.sqrt(delta));
    }
    public float getRoot2 (){
        return (-b-(float) Math.sqrt(delta));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter b:");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter c:");
        float c = Float.parseFloat(scanner.nextLine());
        QuadraticEquation situation = new QuadraticEquation(a,b,c);
        if (a==0){
            if (b==0){
                System.out.println("The equation has no real root");
            }
            else {
                System.out.println("The equation has one root"+situation.getOneroot());
            }
        }
        else if (a!=0){
            situation.setDelta(a,b,c);
            System.out.println(situation.getDelta());
            if (situation.getDelta()>0){
                System.out.println("The equation has two roots:\n"+"Root1:"+situation.getRoot1()+", Root2:"+situation.getRoot2());
            }
            else if (situation.getDelta()<0){
                System.out.println("The equation has no roots:\t");
            }
            else {
                System.out.println("The equation has one roots:\t"+situation.getRoot1());
            }
        }
    }






//    private double a;
//    private double b;
//    private double c;
//    private double delta;
//    public QuadraticEquation (double a, double b, double c){
//        this.a =a;
//        this.b = b;
//        this.c = c;
//    }
//    public double getDiscriminant() {
//        return delta = b*b-(4*a*c);
//    }
//    double getRoot (){
//        return -c/b;
//    }
//    public double getRoot1(){
//        double r1;
//        r1 = (-b+Math.sqrt(b*b-(4*a*c)))/(2*a);
//        return r1;
//    }
//    public double getRoot2(){
//        double r2;
//        r2 = (-b-Math.sqrt(b*b-(4*a*c)))/(2*a);
//        return r2;
//    }
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a:");
//        double a = Double.parseDouble(scanner.nextLine());
//        System.out.println("Enter b:");
//        double b =Double.parseDouble(scanner.nextLine());
//        System.out.println("Enter c:");
//        double c = Double.parseDouble(scanner.nextLine());
//        QuadraticEquation computer1 = new QuadraticEquation(a,b,c);
//
//        if (a==0){
//            if (b==0){
//                System.out.println("The equation has no real roots");
//            }
//            else {
//                System.out.println("The equation has one root"+computer1.getRoot());
//            }
//        }
//        else if (a!=0){
//            if (computer1.getDiscriminant()>0){
//                System.out.println("The equation has two roots:\n"+"Root1:"+computer1.getRoot1()+", Root2:"+computer1.getRoot2());
//            }
//            else if (computer1.getDiscriminant()==0){
//                System.out.println("The equation has one roots:\t"+computer1.getRoot1());
//            }
//            else {
//                System.out.println("The equation has no roots:\t");
//            }
//        }
//    }
}
