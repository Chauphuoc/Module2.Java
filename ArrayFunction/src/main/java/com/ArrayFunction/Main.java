package com.ArrayFunction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        checkMinValue();
    }

    //    doi cho vi tri trong mang
    public static void array1() {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("size does not exceed 20");
            }

        }
        while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element" + (i + 1) + " is: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Element in array:");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + "\t");
        }
        int first = 0;
        int last = array.length - 1;

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(array));
    }

    //    Tìm giá trị trong mảng loi element1 khong chay
    public static String[] creatArray(int size) {

        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element" + (i + 1) + " is: ");
            array[i] = scanner.nextLine();
        }
        System.out.println(array);
        return array;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void findValue() {
//        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter your size");
        int size = Integer.parseInt(scanner.nextLine());
        String[] students = creatArray(size);
        System.out.println("Enter the name");
        String input_name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {

            if (input_name.equals(students[i])) {
                System.out.println("It's name: " + input_name + " index: " + i);
                flag = true;
                break;
            }

        }
        if (flag == false) {
            System.out.println("Not found");
        }

    }

    //    Tìm giá trị lớn nhất trong mảng
    public static int[] creatArrayInt(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter element" + (i + 1) + " is: ");
            numbers[i] =Integer.parseInt(scanner.nextLine()) ;
        }
        return numbers;
    }

    public static void findMax() {
        int size;
        do {
            System.out.println("Enter size:");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 10) {
                System.out.println("Size should not exceed 20");
            }
            if (size <= 10) {
                break;
            }
        }
        while (size > 10);
//        System.out.println(Arrays.toString(creatArrayInt(size)));

        int [] myArray = creatArrayInt(size);
        System.out.println(Arrays.toString(myArray));
        int max = 0;
        for (int i=0;i<size;i++){
            if (myArray[i]>max){
                max = myArray[i];
            }
        }
        System.out.println(max+"is max Number");
    }

    //    Chương trình chuyển đổi nhiệt độ
    public static void convertTemperature() {
        float fahrenheit;
        float celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Type Fahrenheit: ");
                    fahrenheit = Float.parseFloat(scanner.nextLine()) ;
                    System.out.println("Fahrenheit to Celsius:" + Celsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Type Celsius: ");
                    celsius = Float.parseFloat(scanner.nextLine()) ;
                    System.out.println("Celsius to Fahrenheit: " + fahrenheit(celsius));
                    break;
            }

        }
        while (choice < 3);
    }

    public static float fahrenheit(float celsius) {
        float fahrenheit;
        fahrenheit = (9 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static float Celsius(float fahrenheit) {
        float celsius;
        celsius = (5 / 9) * (fahrenheit - 32);
        return celsius;
    }
//    Tim so be nhat
    public static void  checkMinValue (){
        int[] array =  creatArrayInt(4);
        int min = minValue(array);
        System.out.println("Value min is:"+array[min]+"\n"+"Index is:"+min);
    }
    public static int minValue (int[] array){
        int index=0;
        for (int i=0;i<array.length;i++){
            if (array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
}