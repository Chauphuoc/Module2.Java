package ImplementList.StackExampleJames;

import java.util.Scanner;
import java.util.Stack;

public class Chuyenthapphansangnhiphan {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        while (x!=0){
            int a = x%2;
            stack.push(a);
            x=x/2;
        }
        int value = stack.size();
        for (int i = 0; i<value;i++){
            System.out.print(stack.pop());
        }
    }
}
