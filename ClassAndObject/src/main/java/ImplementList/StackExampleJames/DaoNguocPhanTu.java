package ImplementList.StackExampleJames;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu <E> {

    public static void main(String[] args) {
       Stack<Integer> stackInteger = new Stack<Integer>();
       int[] arr = new int[]{7,9,8,6};
        for (int i = 0; i< arr.length; i++){
            stackInteger.push(arr[i]);
        }

        for (int i = 0; i< arr.length;i++){
            System.out.print(stackInteger.pop()+" ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackString = new Stack<>();
        System.out.println("Nhap chuoi:");
        String value = scanner.nextLine();
        for (int i = 0; i < value.length();i++){
            stackString.push(value.charAt(i)+"");
        }

        System.out.println("Chuoi dao nguoc");
        for (int i =0; i <value.length(); i++){
            System.out.print(stackString.pop()+" ");
        }
    }
}
