package com.myFirstProject;


import java.util.Date;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readingNumber();
    }

    public static void getMonth() {
        System.out.println("Nhap thang:");
        int month = scanner.nextInt();
        String daysinMonth;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysinMonth = "31";
                break;
            case 2:
                daysinMonth = "28 or 29";
                break;
            case 4, 6, 9, 11:
                daysinMonth = "30";
                break;

            default:
                daysinMonth = "";
        }
        if (!daysinMonth.equals("")) {
            System.out.printf("the month %d has %s day", month, daysinMonth);
        } else System.out.println("invalid input");
    }

    public static void getDay() {
        Date now = new Date();
        System.out.println("Now is:" + now);
    }

    public static void variable() {
        int i = 10;
        float f = 20.5f;
        double d = 20.5d;
        boolean b = true;
        char c = 'a';
        String s = "Ha Noi";
        System.out.println(i);
        System.out.println(s);
    }

    public static void areaRec() {
        System.out.println("width:");
        float width = scanner.nextFloat();
        System.out.println("Height:");
        float height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area of Rectangle is:" + area);
    }

    //        Phuong trinh bac nhat
    public static void method() {
        System.out.println("Enter a:");
        float a = scanner.nextFloat();
        System.out.println("Enter b:");
        float b = scanner.nextFloat();
        float x = -b / (2 * a);
        if (a != 0) {
            System.out.println("Phuong trinh co nghiem" + x);
        } else {
            System.out.println("Phuong trinh co vo so nghiem");
        }
    }

    //        Kiem tra nam nhuan
    public static void getYear() {
        System.out.println("Enter your Year:");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    System.out.printf("Nam %d la nam nhuan", year);
                }
                else {System.out.printf("Nam %d la nam khong nhuan", year);}
            }
            else {System.out.printf("Nam %d la nam nhuan", year);}
        }
        else {System.out.printf("Nam %d la nam khong nhuan", year);}

        }
//    Tính chỉ số cân nặng của cơ thể
    public static void bmi () {
        System.out.println("Enter your weight:");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height:");
        float height = scanner.nextFloat();
        float bmi;
        bmi = weight / (height*height);
        if (bmi<18.5) {
            System.out.printf("weight:%f height:%f. BMI=%f Underweight",weight,height,bmi);
        }
        else if (bmi>=18.5&&bmi<25.0) {
            System.out.printf("weight:%f height:%f. BMI=%f Normal",weight,height,bmi);
        }
        else if (bmi>=25.0&&bmi<30.0) {
            System.out.printf("weight:%f height:%f. BMI=%f Overweight",weight,height,bmi);
        }
        else {
            System.out.printf("weight:%f height:%f. BMI=%f Obese",weight,height,bmi);
        }

    }
//    Hien thi loi chao
    public static void greeting () {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Hello:"+name);
    }
//    Ứng dụng đọc số thành chữ
    public static void readingNumber (){
        int n;
        System.out.println("Nhap n:");
        n=scanner.nextInt();
        System.out.println(convert(n));

    }

    public static String[] unit = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirdteen","Fourteen","FiveTeen","Sixteen","Seventeen","Eighteen","Nineteen"};
    public static String [] tens = {"","","Twenty","Thirdty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public static String convert ( int n){
        if (n<0){
            return "Subtraction" + convert(-n);
        }
        if (n<20){
            return unit[n];
        }
        if (n<100){
            return tens[n/10]+unit[n%10];
        }
        if (n<1000){
            return unit[n/100]+"Hundred"+convert(n%100);
        }
        return "";
    }
//    Ứng dụng chuyển đổi tiền
    public  static void convertUsd () {
        int rate = 23000;
        int vnd;
        int usd;

        do {
            System.out.println("Enter your money:");
            usd = scanner.nextInt();
            if (usd>=1){
                vnd = usd * rate;
                System.out.printf("%d = %d * %d vnd",vnd,usd,rate);
            }
            else {
                System.out.println("Type again");
            }
        } while (usd<0||usd>10000);
    }
//    kiem tra so chan




    }










