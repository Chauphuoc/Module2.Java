package com.Loop;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menuApp();
    }
//    Kiểm tra số nguyên tố
    public static void primeNumber (){
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        boolean flag = true;
        if (n<2) {
            flag = false;
            System.out.printf(" '%d' khong la so nguyen to",n);
        }
        else {
            for (int i=2;i<n-1;i++) {
               if (n%i==0) {
                   flag = false;
                   break;
               }
               else {flag = true;};
            }
            if(flag==false){
                System.out.printf(" %d khong la so nguyen to",n);
            }
            else if (flag==true){
                System.out.printf("%d la so nguyen to",n);
            }
            }
        }
//        Tính tiền lãi cho vay
    public static void calCulator () {
        System.out.println("type your given Money:");
        int money = scanner.nextInt();
        float rate = 0.055f;
        System.out.println("type your months");
        int month = scanner.nextInt();
        float profitMoney=0;
        for ( month=1;month<13;month++) {
            profitMoney += money*(rate/12)*month;

        }
        System.out.println(profitMoney);
    }
//    Tìm ước chung lớn nhất
    public static void findNumber (){
        System.out.println("Number a:");
        int a = scanner.nextInt();
        System.out.println("Number b:");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0&&b==0) {
            System.out.println("No value");
        }
        else if (a==0||b==0) {
            System.out.printf("Value is %d",a+b);
        }
        while (a!=b) {
            if (a>b){
                a = a-b;
            }
            else {
                b=b-a;
            }
        }
        System.out.printf("Value max is: %d",a);;
    }
//    Thiết kế menu cho ứng dụng
    public static void menuApp () {
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("* * * * *");
                System.out.println("* * * *");
                System.out.println("* * *");
                System.out.println("* * ");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * *");
                System.out.println("* * *");
                System.out.println("* * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * *");
                System.out.println("* * * *");
                break;
            case 0:
                return;
        }
    }
    };
