package com.ArrayFunction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        creatArray();

    }
//    Đếm số lần xuất hiện của ký tự trong chuỗi
    public static void countWord (){
        String string;
        System.out.println("Enter your string:");
        string = scanner.nextLine();
        System.out.println("Enter your word:");
        char charactor = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i<string.length();i++){
            if (string.charAt(i)==charactor){
                count++;
            }
        }
        System.out.println("Charator "+charactor+" exist "+count+" times in this String " +string);
    }
//    Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông
    public static void sumMultipleMatrix (){
        System.out.println("Enter your row;");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your column");
        int column=Integer.parseInt(scanner.nextLine());
        int [][] matrix = creatTypingmatrix(row,column);
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (i==j){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("Sum is:"+sum);
    }

    public static int [][] creatTypingmatrix (int row, int column){
        int[][] matrix = new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.println("a["+i+","+j+"]");
                matrix[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        return matrix;
    }
//    Tính tổng các số ở một cột xác định
    public static void sumColumn (){
        int row;
        int column;
        System.out.println("Enter value of row:");
        row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter value of column:");
        column = Integer.parseInt(scanner.nextLine());
        int [][] matrix = creatMatrix(row,column);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.printf(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int n;
        int sum = 0;
        System.out.println("column what you choose:");
        n = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<row;i++){
            sum+= matrix[i][n];
        }
        System.out.println("sum is: "+sum);
    }
    public static int [][] creatMatrix (int row, int column ){
        int [][] matrix = new  int [row] [column];
        for (int i =0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix[i][j]=(int)(Math.floor(Math.random()*30+1)) ;
            }
        }
        return matrix;
    }
//    Ứng dụng đếm số lượng sinh viên thi đỗ
    public static void countStudents (){
        int size;
        do {
            System.out.println("Enter your size:");
            size = Integer.parseInt(scanner.nextLine());
            if (size>30){
                System.out.println("Type again");
            }
        }
        while (size>30);
        int[] checkPoint = creatArrayInt(size);
        int count = 0;
        for (int i=0;i<checkPoint.length;i++){

            if (checkPoint[i]>=5&&checkPoint[i]<=10){
                count++;
            }
        }
        System.out.print(Arrays.toString(checkPoint)+" "+"\n");
        System.out.println("There are "+count+" student who passed exam");
    }
//    Tìm giá trị nhỏ nhất trong mảng
    public static void findValueMin (){
        int[] array = creatArrayInt(5);
        int min = array[0];
        for (int i=0;i<array.length;i++){
            if (min >array[i]){
                min = array[i];
            }
        }
        System.out.println("Value min is:"+min);
    }
//    Tìm phần tử lớn nhất trong mảng hai chiều
    public static void findMaxElement (){
        System.out.println("Enter your row:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your column:");
        int column = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.println("a["+i+"]"+"["+j+"]=");
                matrix[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int max = matrix[0][0];
        for (int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    row =i;
                    column = j;
                }
            }
        }
        System.out.println("Value max is:"+max+" row="+row+" column="+column);

    }
//    Gop mang
    public static void combineArray (){
        System.out.println("Enter value of array1");
        int[] array1 = creatArrayInt(3);
        System.out.println("Enter value of array2");
        int[] array2 = creatArrayInt(4);
        int[] array3 = new int[7];
        int j = 0;
        for(int i=0;i<array1.length;i++){
            array3[j]=array1[i];
            j++;
        }
       for (int i=0;i<array2.length;i++){
           array3[j]=array2[i];
           j++;
       }
        System.out.println(Arrays.toString(array3));
    }
//    remove element from array
    public static void removeElement (){
        int[] array = creatArrayInt(5);
        System.out.println("Enter your value:");
        int n = Integer.parseInt(scanner.nextLine());
        int index = index_del(array,n);
        for (int i=index; i<array.length;i++){
            if (i<array.length-1){
                array[i]=array[i+1];
            }
            if (i==array.length-1){
                array[i]=0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static int index_del (int[] array,int n){
        int index_del=-1;
        for (int i=0;i<array.length;i++){
            if(array[i]==n){
                index_del = i;
                break;
            }
        }
        return index_del;
    }
//  add element into array
    public static void addElement (){
        int[] array = creatArrayInt(5);
        int n = array.length-1;
        System.out.println("Enter your value:");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your index:");
        int index = Integer.parseInt(scanner.nextLine());
        if (index<=-1&&index>array.length){
            System.out.println("Error");
        }
        for (int i=n;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=value;
        System.out.println(Arrays.toString(array));
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

    //    Tìm giá trị trong mảng
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