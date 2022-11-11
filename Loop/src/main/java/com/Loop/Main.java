package com.Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        shape();
    }
//    Kiểm tra số nguyên tố
    public static boolean checkNumberPrime (int n){
        boolean flag = true;
        if (n<2){
            flag = true;
        }
        else {
            for (int i=0;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    flag =false;
                    break;
                }
            }
        }
        return flag;
    }
    public static void primeNumber (){
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        boolean checkNumbers = checkNumberPrime(n);
        if (checkNumbers){
            System.out.printf(" '%d' la so nguyen to",n);
        }
        else {
            System.out.printf("%d khong la so nguyen to",n);
        }
//        if (n<2) {
//            flag = false;
//            System.out.printf(" '%d' khong la so nguyen to",n);
//        }
//        else {
//            for (int i=2;i<n-1;i++) {
//               if (n%i==0) {
//                   flag = false;
//                   break;
//               }
//               else {flag = true;};
//            }
//            if(flag==false){
//                System.out.printf(" %d khong la so nguyen to",n);
//            }
//            else if (flag==true){
//                System.out.printf("%d la so nguyen to",n);
//            }

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
//    Hiển thị các loại hình
    public static void shape (){
//        System.out.println("1. Print the rectangle");
//        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
//        System.out.println("3. Print isosceles triangle");
//        System.out.println("4. Exit");
//        System.out.println("Your choice:");
//        int choice = scanner.nextInt();

//        for (int i=0;i<=4;i++){
//            for (int j=0; j<=7;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for (int i = 0;i<=4;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for (int i=0;i<=4;i++){
//            for (int j=4;j>=i;j--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        for (int i=7;i>=1;i--){

            for (int j=1;j<=7;j++){
                if (j>=i){
                    System.out.print("* " );
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//    kiem tra 20 so nguyen to dau tien

    public static void checkNumber (){
        System.out.println("Enter your number:");
        int numbers = scanner.nextInt();
        System.out.printf("%d so nguyen to dau tien la:",numbers);
        int count = 0;
        int n =2;
        boolean checNumber = checkNumberPrime(n);
        while (count<numbers){
            if (checNumber){
                System.out.printf(" '%d' la so nguyen to",n);
                count++;
            }
            else {
                System.out.printf("%d khong la so nguyen to",n);
            }
            n++;
        }
//        int n = 2;
//        int count = 0;
//        boolean flag = true;
//        if (numbers<2){
//            System.out.println("2");
//        }
//        if(numbers>1) {
//            while (count<numbers){
//            flag = true;
//            for (int i=2;i<=Math.sqrt(n);i++) {
//                if(n%i==0){
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag==true){
//                count++;
//                System.out.println(n);
//            }
//            n++;


    }
//    hiển thị các số nguyên tố nhỏ hơn 100.
    public static void showNumber () {
        int n=2;
        boolean checkNumbers = checkNumberPrime(n);
        while (n<100){
            if (checkNumbers){
                System.out.println(checkNumbers);
            }
            n++;
        }
    }
//    mang
    public static void array () {
        int [] [] matrix = {{1,2,9,5},{7,8,9,3},{7,8,4,5},{7,8,1,5}};
        System.out.println("Enter "+matrix.length+"row and "+ matrix[0].length+" column");
//        System.out.println("Nhap a");
//        int a = scanner.nextInt();
        int maxRow=0;
        int indexMaxrow=0;
        for (int j = 0; j<matrix[0].length; j++){
            maxRow += matrix[0][j];
        }
        for (int i=1; i<matrix.length;i++){
            int total =0;
            for (int j=0;j<matrix[i].length;j++){
                total+= matrix[i][j];
            }
            if (total>=maxRow){
                maxRow = total;
                indexMaxrow = i;
            }
        }
        System.out.println("max: "+maxRow+" ,index:"+indexMaxrow);
//        System.out.println(total);
    }
//    coppy array
    public static void coppyArray() {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] newArray = new int [sourceArray.length];
        for (int i=0;i<newArray.length;i++) {
            newArray[i]=sourceArray[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
//    function in java
    public  static int myFunction (int a, int b) {
        int result = 0;
        for (int i=a;i<=b;i++){
            result += i;
        }
        return result;
    }
    public static void calculating (){
        System.out.println("Sum from 1 to 10 is " + myFunction(1, 10));
        System.out.println("Sum from 20 to 37 is " + myFunction(20, 37));
        System.out.println("Sum from 35 to 49 is " + myFunction(35, 49));
    }
    };
