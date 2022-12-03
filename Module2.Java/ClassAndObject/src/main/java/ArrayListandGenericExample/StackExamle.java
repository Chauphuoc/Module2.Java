package ArrayListandGenericExample;

import java.util.Scanner;
import java.util.Stack;

public class StackExamle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Stack<String>  stackChuoi = new Stack<>();
        System.out.println("Nhap vao chuoi");
        String s= scanner.nextLine();
        for (int i = 0 ; i <s.length();i++){
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("Chuoi nguoc");
        for (int i = 0 ; i <s.length();i++){
            System.out.print(stackChuoi.pop());
        }
    }
}
