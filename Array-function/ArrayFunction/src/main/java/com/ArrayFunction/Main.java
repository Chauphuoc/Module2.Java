package com.ArrayFunction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("size does not exceed 20");
            }

        }
        while (size>20);
        array = new int[size];
//        int i = 0;
//       while (i<array.length){
//           System.out.println("Enter element"+(i+1)+"is:");
//           array[i] = scanner.nextInt();
//           i++;
//       }
        for (int i=0;i< array.length;i++){
            System.out.println("Enter element"+(i+1)+" is: ");
            array[i]=scanner.nextInt();
        }
        System.out.print("Element in array:");
        for (int j=0;j< array.length;j++){
            System.out.printf(array[j]+"\t");
        }
        int first = 0;
        int last = array.length-1;

        for (int i=0;i<array.length-1;i++){
            int temp = array[first];
            array[first] = array [last];
            array [last] = temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(array));

    }
}