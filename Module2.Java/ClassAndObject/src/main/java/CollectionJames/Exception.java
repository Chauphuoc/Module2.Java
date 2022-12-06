package CollectionJames;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exception {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] createRandom (){
        Random rd = new Random();
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt()/100000000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Enter index value");
        int value = Integer.parseInt(scanner.nextLine());
        int [] list =createRandom();
        try {
            for (int i : list){
                if (list[i]==value){
                    System.out.println("Giá trị của phần tử có chỉ số 5" + value + " là " + list[i]);
                }
            }
        }

        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Out of array");
        }
    }
}
