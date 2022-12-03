package ImplementList.StackExampleJames;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        String[] arr = str.split("\\s");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String i : arr){
            stack.push(i);
        }
        for (String i : arr){
            queue.add(i);
        }
        boolean flag=false;
        for (int i = 0 ; i < arr.length; i++){
            if ((stack.pop()).equals(queue.poll())){
                flag=true;
            }
        }
        if (flag){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
