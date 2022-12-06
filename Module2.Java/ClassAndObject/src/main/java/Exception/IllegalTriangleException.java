package Exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static Scanner scanner = new Scanner(System.in);
    public static void triangle(int a, int b, int c){
        try{
            System.out.printf("3 canh tam giac la: %d, %d , %d",a,b,c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter c");
        int c = Integer.parseInt(scanner.nextLine());
        triangle(a,b,c);
    }
}
