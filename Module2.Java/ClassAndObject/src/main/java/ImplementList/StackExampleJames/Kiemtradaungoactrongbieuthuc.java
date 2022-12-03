package ImplementList.StackExampleJames;

import java.util.Stack;

public class Kiemtradaungoactrongbieuthuc {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "s * ( s – a ) * ( s – b * ( s – c )";
        for (int i = 0; i <str.length(); i++){
//            System.out.println(str.charAt(i));
            if (str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else {
                if (stack.isEmpty()){
                    System.out.println(false);
                }
                else {
                    char topIndex = stack.peek();
                    if (str.charAt(i)==')'&&topIndex=='('){
                        System.out.print(true+" ");
                    }
                    else System.out.print(false+ " ");
                }
            }
        }
    }
}
