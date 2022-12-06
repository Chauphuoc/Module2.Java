package CollectionJames;

import java.util.Scanner;

public class MinhhoaBubbleSort {
    public static void bublleSort (int[]list){
        boolean check = true;
        for (int k = 1; k < list.length&&check;k++){
            check = false;
            for (int i = 0; i < list.length-1; i++){
                if (list[i]>list[i+1]){
                    int temp = list[i];
                    list[i]= list[i+1];
                    list[i+1]=temp;
                    check=true;
                }
            }
            if (check == false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int size =scanner.nextInt();
        int [] list = new int[size];
        System.out.println("Enter"+list.length+"value");
        for (int i = 0; i< list.length;i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list");
        for (int i = 0 ; i < list.length; i++){
            System.out.print(list[i]+"\t");
        }
        System.out.println("\nBegin sort processing...");
        bublleSort(list);
    }
}
